package com.org.JFiles.Instalador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Installer {

    private String fases[];
    private String folder[];
    private final Inicio inicio;
    private final Vista rutas;

    public Installer(String[] fases, String[] folder, String nombre ) {
        this.fases = fases;
        this.folder = folder;
        this.inicio = new Inicio(nombre);
        this.rutas = new Vista(nombre, fases, folder);
    }

    

    public void inicio(String Descripcion) {
        try {
            inicio.setVisible(true);

            while (true) {

                if (inicio.isSig()) {
                    break;
                }
                Thread.sleep(100);

            }

            rutas.setVisible(true);

        } catch (InterruptedException ex) {
            Logger.getLogger(Installer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
