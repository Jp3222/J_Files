package com.org.JFiles.Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jp
 */
public class Archivos_TEXT {

    private FileReader input;
    private FileWriter output;
    private File file;

    @SuppressWarnings("null")
    public boolean Crear_Archivo(File url, String nombre, String tipo) {
        String d = url.getPath() + "/" + nombre + "." + tipo;
        try {
            if (url != null) {
                if (url.isDirectory()) {
                    if (url.exists()) {
                        file = new File(d);
                        return file.createNewFile();
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            file = null;
        }
        return false;
    }

    public boolean Remover_Archivo(File file) {
        if (file != null) {
            if (file.exists()) {
                if (file.isFile()) {
                    return file.delete();
                }
            }
        }
        return false;
    }

    public void Escribir_Archivo(File file, String txt) {
        try {
            if (Validacion_Archivos(file) && file.canWrite()) {
                output = new FileWriter(file.getAbsoluteFile());
                output.write(txt);
                output.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            output = null;
        }
    }

    public String Leer_Archivo(File file, String text) {
        try {
            if (Validacion_Archivos(file) && file.canRead()) {
                input = new FileReader(file.getAbsolutePath());
                String txt = "";
                char character;
                int i;
                while (true) {
                    i = input.read();
                    if (i != -1) {
                        character = (char) i;
                        txt += String.valueOf(character);
                    } else {
                        break;
                    }
                }
                input.close();
                return txt;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            input = null;
        }
        return null;
    }

    

    private boolean Validacion_Archivos(File file) {
        return file != null && file.exists() && file.isFile();
    }

    private boolean Validacion_Folders(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

}
