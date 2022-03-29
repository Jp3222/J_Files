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

    public Archivos_BYTES() {
        this.input = null;
        this.output = null;
        this.fl = null;
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

    public void Copiar_Archivo(File file, File url, String nombre) {
        try {
            if (Validacion_Archivos(file)) {
                if (Validacion_Folders(url)) {
                    input = new FileInputStream(file);
                    output = new FileOutputStream(url.getPath() + "/" + nombre);
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

    /**
     * Metodo encargado de partir la ruta cada que se encuente un "/" en la cadena
     * @param ruta cadena que contiene la ruta que se va a partir
     * @param imprimir_elementos true si se desea imprimir los elemetos
     * obtenidos de partir dicha ruta
     * @return un array con los elementos obtenidos de la ruta
     */
    public String[] PartirRuta(String ruta, boolean imprimir_elementos) {
        String[] info = ruta.split("/");
        if (imprimir_elementos) {
            for (String string : info) {
                System.out.println(string);
            }
        }
        return info;
    }

    /**
     * @param file archivo a evaluar
     * <br> Este metodo es encargado de evalurar que el parameto file no sea
     * null, que exista y que sea un archivo
     *
     */
    public boolean Validacion_Archivos(File file) {
        return file != null && file.exists() && file.isFile();
    }

    /**
     * @param file directorio a evaluar
     * <br> Este metodo es encargado de evalurar que el parameto file no sea
     * null, que exista y que sea un directorio
     *
     */
    public boolean Validacion_Folders(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

}
