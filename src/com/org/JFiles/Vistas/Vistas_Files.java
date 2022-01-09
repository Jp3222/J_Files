package com.org.JFiles.Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class Vistas_Files extends javax.swing.JFrame implements ActionListener {

    private static Vistas_Files Nodo;

    public static Vistas_Files getNodo(String titulo, String aceptar) {
        if (Nodo == null) {
            Nodo = new Vistas_Files(titulo, aceptar);
        }
        return Nodo;
    }

    private File[] files;

    private Vistas_Files(String titulo, String aceptar) {
        super(titulo);
        this.files = null;
        initComponents();
        jfcArchivo.addActionListener(this);
        jfcArchivo.setApproveButtonText(aceptar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcArchivo = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jfcArchivo.setBackground(new java.awt.Color(254, 254, 254));
        jfcArchivo.setForeground(new java.awt.Color(1, 1, 1));
        jfcArchivo.setToolTipText("");
        jfcArchivo.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jfcArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jfcArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("ApproveSelection")) {
            this.files = jfcArchivo.getSelectedFiles();
            this.dispose();
        } else if (e.getActionCommand().equalsIgnoreCase("CancelSelection")) {
            this.dispose();
            Nodo = null;
        }
    }

    public File[] getFiles() {
        return files;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jfcArchivo;
    // End of variables declaration//GEN-END:variables

}
