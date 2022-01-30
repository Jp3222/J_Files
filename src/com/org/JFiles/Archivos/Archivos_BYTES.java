package com.org.JFiles.Archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author jp
 */
public class Archivos_BYTES {

    private FileInputStream input;
    private FileOutputStream output;
    private File fl;
    private String tipo, nombre, url;
    private final String[] info;

    public Archivos_BYTES() {
        info = new String[3];
        this.input = null;
        this.output = null;
        this.fl = null;
    }

    public String[] PartirRuta(String url) {
        String[] aux = url.split("/|\\.");
        String u = "";
        for (int i = 0; i < aux.length - 2; i++) {
            u += aux[i] + "/";
        }
        this.info[0] = this.url = u;
        this.info[1] = this.nombre = aux[aux.length - 2];
        this.info[2] = this.tipo = aux[aux.length - 1];
        return info;
    }

    public String getUrl() {
        return url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @SuppressWarnings("null")
    public boolean Crear_Archivo(File url, String nombre, String tipo) {
        String d = url.getPath() + "/" + nombre + "." + tipo;
        try {
            if (url != null) {
                if (url.isDirectory()) {
                    if (url.exists()) {
                        fl = new File(d);
                        return fl.createNewFile();
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            fl = null;
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

    public void Escribir_Archivo(File file, byte[] txt) {
        try {
            if (file != null) {
                if (file.exists()) {
                    if (file.isFile()) {
                        output = new FileOutputStream(file);
                        output.write(txt);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            output = null;
        }
    }

    public byte[] Leer_Archivo(File file) {
        try {
            if (file != null) {
                if (file.exists()) {
                    if (file.isFile()) {
                        if (file.canRead()) {
                            input = new FileInputStream(file);
                            byte[] array = input.readAllBytes();
                            input.close();
                            return array;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            output = null;
        }
        return null;
    }

    public void Copiar_Archivo(File file, File url) {
        try {
            if (Validacion_Archivos(file)) {
                if (Validacion_Folders(url)) {
                    String[] archivo = PartirRuta(file.getPath());
                    input = new FileInputStream(file);
                    output = new FileOutputStream(url.getPath() + "/" + archivo[1] + "copia" + "." + archivo[0]);
                    output.write(input.readAllBytes());
                    input.close();
                    output.close();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" xd ");
            input = null;
            output = null;
        }
    }

    private byte[] merge(byte[] array1, byte[] array2) {
        byte[] array3 = new byte[array1.length + array2.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++, j++) {
            array3[j] = array1[i];
        }
        for (int i = 0; i < array2.length; i++, j++) {
            array3[j] = array2[i];
        }
        return array3;
    }

    private boolean Validacion_Archivos(File file) {
        return file != null && file.exists() && file.isFile();
    }

    private boolean Validacion_Folders(File file) {
        return file != null && file.exists() && file.isDirectory();
    }
}
