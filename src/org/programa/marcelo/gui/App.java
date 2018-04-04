/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.programa.marcelo.gui;

import Convenios.Convenio;
import Cursos.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maranda
 */
public class App extends javax.swing.JFrame {

    private List<Curso> cursos;
    private List<Convenio> convenios;

    public App() {
        initComponents();
        this.setTitle("Sistema de matriculas Beat Dance School");
        setLocationRelativeTo(null);

        initCursos();
        initConvenios();
        deshabilitarCamposNoeditables();
        txtDescuento.setText("0");
        txtTotalFinal.setText("0");

    }

    private void mostrarMatrMensTotal() {
        if (String.valueOf(cboCurso.getSelectedItem()).equalsIgnoreCase(cursos.get(0).getNombre())) {
            txtMatricula.setText(String.valueOf(cursos.get(0).getMatricula()));
            txtMensualidad.setText(String.valueOf(cursos.get(0).getMensualidad()));
            txtTotal.setText(String.valueOf(cursos.get(0).getMatricula() + (cursos.get(0).getMensualidad() * cursos.get(0).getCantidadDeMeses())));
            txtTotalFinal.setText(String.valueOf(cursos.get(0).getMatricula() + (cursos.get(0).getMensualidad() * cursos.get(0).getCantidadDeMeses())));

        } else if (String.valueOf(cboCurso.getSelectedItem()).equalsIgnoreCase(cursos.get(1).getNombre())) {
            txtMatricula.setText(String.valueOf(cursos.get(1).getMatricula()));
            txtMensualidad.setText(String.valueOf(cursos.get(1).getMensualidad()));
            txtTotal.setText(String.valueOf(cursos.get(1).getMatricula() + (cursos.get(1).getMensualidad() * cursos.get(1).getCantidadDeMeses())));
            txtTotalFinal.setText(String.valueOf(cursos.get(1).getMatricula() + (cursos.get(1).getMensualidad() * cursos.get(1).getCantidadDeMeses())));

        } else if (String.valueOf(cboCurso.getSelectedItem()).equalsIgnoreCase(cursos.get(2).getNombre())) {
            txtMatricula.setText(String.valueOf(cursos.get(2).getMatricula()));
            txtMensualidad.setText(String.valueOf(cursos.get(2).getMensualidad()));
            txtTotal.setText(String.valueOf(cursos.get(2).getMatricula() + (cursos.get(2).getMensualidad() * cursos.get(2).getCantidadDeMeses())));
            txtTotalFinal.setText(String.valueOf(cursos.get(2).getMatricula() + (cursos.get(2).getMensualidad() * cursos.get(2).getCantidadDeMeses())));

        }

    }

    private void deshabilitarCamposNoeditables() {
        txtMatricula.setEnabled(false);
        txtMensualidad.setEnabled(false);
        txtTotal.setEnabled(false);
        pnlConvenio.setEnabled(false);
        cboConvenio.setEnabled(false);
        txtDescuento.setEnabled(false);
        txtTotalFinal.setEnabled(false);
        txtValorCuota.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        pnlPrincipal = new javax.swing.JPanel();
        lblRun = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblMensualidad = new javax.swing.JLabel();
        lblTotalCurso = new javax.swing.JLabel();
        chkConvenio = new javax.swing.JCheckBox();
        pnlConvenio = new javax.swing.JPanel();
        cboConvenio = new javax.swing.JComboBox<>();
        lblDescuento = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        lblTotalFinal = new javax.swing.JLabel();
        lblNCuotas = new javax.swing.JLabel();
        lblTotalCuota = new javax.swing.JLabel();
        txtRun = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cboCurso = new javax.swing.JComboBox<>();
        txtMatricula = new javax.swing.JTextField();
        txtMensualidad = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtTotalFinal = new javax.swing.JTextField();
        txtValorCuota = new javax.swing.JTextField();
        txtNCuotas = new javax.swing.JTextField();
        btnMasculino = new javax.swing.JRadioButton();
        btnFemenino = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        btnMatricular = new javax.swing.JButton();
        mnuP = new javax.swing.JMenuBar();
        menuBtnArchivo = new javax.swing.JMenu();
        menuEstadisticas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos alumno\n", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        pnlPrincipal.setToolTipText("Datos alumno\n");
        pnlPrincipal.setName(""); // NOI18N

        lblRun.setText("Run:");

        lblSexo.setText("Sexo:");

        lblNombre.setText("Nombre:");

        lblDireccion.setText("Direccion:");

        lblCurso.setText("Curso:");

        lblMatricula.setText("Matricula:");

        lblMensualidad.setText("Mensualidad:");

        lblTotalCurso.setText("Total:");

        chkConvenio.setText("Convenio");
        chkConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConvenioActionPerformed(evt);
            }
        });

        pnlConvenio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Convenio", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        cboConvenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConvenioActionPerformed(evt);
            }
        });

        lblDescuento.setText("Descuento:");

        javax.swing.GroupLayout pnlConvenioLayout = new javax.swing.GroupLayout(pnlConvenio);
        pnlConvenio.setLayout(pnlConvenioLayout);
        pnlConvenioLayout.setHorizontalGroup(
            pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboConvenio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlConvenioLayout.createSequentialGroup()
                        .addComponent(lblDescuento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnlConvenioLayout.setVerticalGroup(
            pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescuento)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lblTotalFinal.setText("Total FINAL:");

        lblNCuotas.setText("N° Cuotas");

        lblTotalCuota.setText("Total cuota:");

        cboCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCursoActionPerformed(evt);
            }
        });

        txtTotalFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalFinalActionPerformed(evt);
            }
        });

        txtNCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNCuotasActionPerformed(evt);
            }
        });
        txtNCuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNCuotasKeyPressed(evt);
            }
        });

        btnGroupSexo.add(btnMasculino);
        btnMasculino.setText("Masculino");

        btnGroupSexo.add(btnFemenino);
        btnFemenino.setText("Femenino");

        btnBuscar.setText("...");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                    .addComponent(lblTotalCurso)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTotal))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                    .addComponent(lblMensualidad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMensualidad))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                    .addComponent(lblMatricula)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMatricula))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                    .addComponent(lblCurso)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblRun)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblSexo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addComponent(btnMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFemenino))
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar))
                                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkConvenio)
                            .addComponent(pnlConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblTotalCuota)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorCuota))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblNCuotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblTotalFinal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalFinal)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRun)
                    .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(btnMasculino)
                    .addComponent(btnFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurso)
                    .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensualidad)
                    .addComponent(txtMensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalCurso)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkConvenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalFinal)
                    .addComponent(txtTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNCuotas)
                    .addComponent(txtNCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalCuota)
                    .addComponent(txtValorCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        btnMatricular.setText("Matricular");

        menuBtnArchivo.setText("Archivo");

        menuEstadisticas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuEstadisticas.setText("Ver estadisticas de curso");
        menuEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEstadisticasActionPerformed(evt);
            }
        });
        menuBtnArchivo.add(menuEstadisticas);

        mnuP.add(menuBtnArchivo);

        setJMenuBar(mnuP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMatricular)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMatricular)
                .addContainerGap())
        );

        pnlPrincipal.getAccessibleContext().setAccessibleName("Datos alumno");
        pnlPrincipal.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFinalActionPerformed

    private void cboCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCursoActionPerformed
        mostrarMatrMensTotal();

    }//GEN-LAST:event_cboCursoActionPerformed

    private int calcularDescuento(int total, int porc) {

        int resultado = (total * porc) / 100;
        return resultado;
    }

    private void cboConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConvenioActionPerformed

        int totalEnNumeros = Integer.parseInt(txtTotal.getText());

        int descuento = 0;

        if (String.valueOf(cboConvenio.getSelectedItem()).contains(convenios.get(0).getNombre())) {
            descuento = calcularDescuento(totalEnNumeros, (convenios.get(0).getPorcentaje()));

        } else if (String.valueOf(cboConvenio.getSelectedItem()).contains(convenios.get(1).getNombre())) {
            descuento = calcularDescuento(totalEnNumeros, (convenios.get(1).getPorcentaje()));

        }

        txtDescuento.setText(String.valueOf(descuento));
        int totalFinal = totalEnNumeros - descuento;
        txtTotalFinal.setText(String.valueOf(totalFinal));


    }//GEN-LAST:event_cboConvenioActionPerformed

    private void chkConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConvenioActionPerformed
        if (chkConvenio.isSelected()) {
            pnlConvenio.setEnabled(true);
            cboConvenio.setEnabled(true);
        } else if (!chkConvenio.isSelected()) {
            pnlConvenio.setEnabled(false);
            cboConvenio.setEnabled(false);
        }
    }//GEN-LAST:event_chkConvenioActionPerformed

    
    private void txtNCuotasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCuotasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNCuotasKeyPressed

    private void txtNCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNCuotasActionPerformed
        int cantidadCuotas=Integer.parseInt(txtNCuotas.getText());
        
        int valorCuota=calcularValorCuotas(Integer.parseInt(txtTotalFinal.getText()), cantidadCuotas);
        txtValorCuota.setText(String.valueOf(valorCuota));
    }//GEN-LAST:event_txtNCuotasActionPerformed

    private void menuEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEstadisticasActionPerformed
        //Este boton muestra estadisticas
    }//GEN-LAST:event_menuEstadisticasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    private void initConvenios() {
        convenios = new ArrayList<>();

        convenios.add(new Convenio("Caja los andes", 5));
        convenios.add(new Convenio("Caja los heroes", 7));

        cboConvenio.removeAllItems();

        for (Convenio c : convenios) {
            cboConvenio.addItem(c.toString());
        }

    }

    private void initCursos() {
        cursos = new ArrayList<>();

        cursos.add(new Curso("Hardstyle Shuffle", 80000, 40000, 6));
        cursos.add(new Curso("Jumpstyle", 60000, 50000, 4));
        cursos.add(new Curso("Tecktonik", 90000, 60000, 3));

        cboCurso.removeAllItems();

        for (Curso curso : cursos) {
            cboCurso.addItem(curso.getNombre());
        }

    }

    private int calcularValorCuotas(int precio, int cantidadDeCuotas) {
        int resultado = precio / cantidadDeCuotas;

        return resultado;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JRadioButton btnFemenino;
    private javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JRadioButton btnMasculino;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JComboBox<String> cboConvenio;
    private javax.swing.JComboBox<String> cboCurso;
    private javax.swing.JCheckBox chkConvenio;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblMensualidad;
    private javax.swing.JLabel lblNCuotas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRun;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTotalCuota;
    private javax.swing.JLabel lblTotalCurso;
    private javax.swing.JLabel lblTotalFinal;
    private javax.swing.JMenu menuBtnArchivo;
    private javax.swing.JMenuItem menuEstadisticas;
    private javax.swing.JMenuBar mnuP;
    private javax.swing.JPanel pnlConvenio;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMensualidad;
    private javax.swing.JTextField txtNCuotas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRun;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalFinal;
    private javax.swing.JTextField txtValorCuota;
    // End of variables declaration//GEN-END:variables
}
