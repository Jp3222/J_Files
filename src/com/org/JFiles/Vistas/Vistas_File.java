package com.org.JFiles.Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class Vistas_File extends javax.swing.JFrame implements ActionListener {

    private static Vistas_File Nodo;

    public static Vistas_File getNodo(String titulo, String aceptar) {
        if (Nodo == null) {
            Nodo = new Vistas_File(titulo, aceptar);
        }
        return Nodo;
    }

    private File file;

    private Vistas_File(String titulo, String aceptar) {
        super(titulo);
        this.file = null;
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
            this.file = jfcArchivo.getSelectedFile();
            this.dispose();
        } else if (e.getActionCommand().equalsIgnoreCase("CancelSelection")) {
            this.dispose();
            Nodo = null;
        }
    }

    public File getFile() {
        return file;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jfcArchivo;
    // End of variables declaration//GEN-END:variables

}
