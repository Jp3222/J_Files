package com.org.JFiles.Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author jp
 */
public class Archivos {

    public class Operaciones {

        public static String LeerArchivo(File file) throws FileNotFoundException, IOException {
            String txt = "";
            FileReader f = new FileReader(file);
            BufferedReader buffer = new BufferedReader(f);
            String line;
            while (true) {
                line = buffer.readLine();
                if (line != null) {
                    txt += line + "\n";
                } else {
                    break;
                }
            }
            buffer.close();
            f.close();
            return txt;
        }

        public static File CrearArchivo(File url, String nombre, String tipo) throws IOException {
            File file = new File(url.getPath() + "/" + nombre + "." + tipo);
            if (url.exists()) {
                file.createNewFile();
            }
            return file;
        }

        public static void EscribirArchivo(File file, String txt) throws FileNotFoundException, UnsupportedEncodingException {
            if (file.exists()) {
                PrintWriter pw = new PrintWriter(file, "utf-8");
                pw.write(txt);
                pw.close();
            }
        }

        

    }

    public class Manejo {

    }

}
