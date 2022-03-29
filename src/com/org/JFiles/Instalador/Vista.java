package com.org.JFiles.Instalador;

import javax.swing.JFrame;
import java.io.File;

public class Vista extends JFrame {

    private int sig;
    private final String Nombre_Programa;
    private final String Pasos[];
    private final String Folders[];

    public Vista(String Nombre_Programa, String Pasos[], String Folders[]) {
        this.Nombre_Programa = Nombre_Programa;
        this.Pasos = Pasos;
        this.Folders = Folders;
        this.setTitle(Nombre_Programa + " - inicio");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jbtSiguiente = new javax.swing.JButton();
        jbtSeleccion = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Ruta de instalacion: ");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 310, 310, 40);

        jTextField1.setBackground(new java.awt.Color(254, 254, 254));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(1, 1, 1));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(20, 360, 250, 30);

        jbtSiguiente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtSiguiente.setText("Siguiente");
        jbtSiguiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbtSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtSiguiente);
        jbtSiguiente.setBounds(200, 500, 130, 40);

        jbtSeleccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtSeleccion.setText("...");
        jbtSeleccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbtSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(jbtSeleccion);
        jbtSeleccion.setBounds(290, 360, 40, 30);

        jbtCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtCancelar.setText("Cancelar");
        jbtCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtCancelar);
        jbtCancelar.setBounds(20, 500, 130, 40);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 350, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSeleccionActionPerformed

        if (sig < Pasos.length - 1) {

        } else {
            jbtSiguiente.setText("Finalizar");
            jbtCancelar.setVisible(false);

        }

    }//GEN-LAST:event_jbtSeleccionActionPerformed

    private void jbtSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtSiguienteActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtSeleccion;
    private javax.swing.JButton jbtSiguiente;
    // End of variables declaration//GEN-END:variables
}
