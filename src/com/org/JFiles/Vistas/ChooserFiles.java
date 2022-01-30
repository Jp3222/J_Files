package com.org.JFiles.Vistas;

import java.io.File;

/**
 *
 * @author jp
 */
public class ChooserFiles {

    @SuppressWarnings("SleepWhileInLoop")
    public static File ChooserFile(String Titulo, String Aceptar) {
        try {
            Vistas_File v = Vistas_File.getNodo(Titulo, Aceptar);
            v.setVisible(true);
            while (true) {
                Thread.sleep(10);
                if (v.getFile() != null) {
                    return v.getFile();
                }
                if (!v.isVisible()) {
                    return v.getFile() ;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static File[] ChooserFiles(String Titulo, String Aceptar) {
        try {
            Vistas_Files v = Vistas_Files.getNodo(Titulo, Aceptar);
            v.setVisible(true);
            while (true) {
                Thread.sleep(10);
                if (v.getFiles() != null) {
                    return v.getFiles();
                }
                if (!v.isVisible()) {
                    return null;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static File ChooserFolder(String Titulo, String Aceptar) {
        try {
            Vista_Folders v = Vista_Folders.getNodo(Titulo, Aceptar);
            v.setVisible(true);
            while (true) {
                Thread.sleep(10);
                if (v.getFile() != null) {
                    return v.getFile();
                }
                if (!v.isVisible()) {
                    return null;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
