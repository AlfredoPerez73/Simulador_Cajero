/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Metodos.Metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfredo
 */
public class frmRegistroCliente extends javax.swing.JFrame {
    int xMouse, yMouse;
    Metodos mt = new Metodos();
    /**
     * Creates new form frmRegistroUsuario
     */
    public frmRegistroCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtId.requestFocus();
    }
    void limpiarCeldas(){
        txtId.setText("");
        txtSaldo.setText("");
        cboTransferencia.setSelectedIndex(0);
        cboTransferenciaIdr.setSelectedIndex(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboTransferencia = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cboTransferenciaIdr = new javax.swing.JComboBox<>();
        txtSaldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jmenu = new javax.swing.JMenu();
        btnConsignaciones = new javax.swing.JMenuItem();
        btnRetiros = new javax.swing.JMenuItem();
        btnServicios = new javax.swing.JMenuItem();
        btnReporte = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-documento (1).png"))); // NOI18N
        jLabel1.setText("CONTROL DE CLIENTES");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 560, 80));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("IDENTIFICACION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        txtId.setBackground(new java.awt.Color(204, 204, 204));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 150, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TIPO DE TRANSFERENCIA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        cboTransferencia.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cboTransferencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "RETIRO", "CONSIGNACION", "PAGO SERVICIO" }));
        jPanel1.add(cboTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 140, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-usuario.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo-marca-x.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo-marca-x.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 680, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("IDENTIFICADOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("SALDO INICIAL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cboTransferenciaIdr.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cboTransferenciaIdr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "CAJA 1", "CAJA 2", "CAJA 3" }));

        txtSaldo.setBackground(new java.awt.Color(204, 204, 204));
        txtSaldo.setForeground(new java.awt.Color(0, 0, 0));
        txtSaldo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTransferenciaIdr, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(cboTransferenciaIdr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 300, 260));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bank-of-america-logo-80F5DEF479-seeklogo.com.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 150));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2023-5-24 9-22-21.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 120, 160));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 250, 260));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("INFORMACION PARA NUEVO CLIENTE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar1MousePressed(evt);
            }
        });

        Jmenu.setForeground(new java.awt.Color(0, 0, 0));
        Jmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aplicaciones (1).png"))); // NOI18N
        Jmenu.setText("OPCIONES PRINCIPALES");
        Jmenu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        btnConsignaciones.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnConsignaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-compra-anadir (1).png"))); // NOI18N
        btnConsignaciones.setText("CONSIGNACIONES");
        btnConsignaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsignacionesMouseClicked(evt);
            }
        });
        btnConsignaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignacionesActionPerformed(evt);
            }
        });
        Jmenu.add(btnConsignaciones);

        btnRetiros.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnRetiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-menos (1).png"))); // NOI18N
        btnRetiros.setText("RETIROS");
        btnRetiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirosActionPerformed(evt);
            }
        });
        Jmenu.add(btnRetiros);

        btnServicios.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-del-carrito-hacia-abajo (1).png"))); // NOI18N
        btnServicios.setText("SERVICIOS");
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        Jmenu.add(btnServicios);

        btnReporte.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo.png"))); // NOI18N
        btnReporte.setText("REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        Jmenu.add(btnReporte);

        jMenuBar1.add(Jmenu);

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aplicaciones.png"))); // NOI18N
        jMenu1.setText("CONTROL DE REGISTRO");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aplicaciones.png"))); // NOI18N
        jMenuItem1.setText("CONTROLES");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed

    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged

    }//GEN-LAST:event_jLabel1MouseDragged

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        new frmMenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        String message[] = {"Aceptar","Cancelar"};
        int r = JOptionPane.showOptionDialog(null, "¿Desea salir del Programa?", "REGISTRO DE DATOS", 0, 0, null, message, this);
        if (r == 0){
            System.exit(0);
        }else if(r == 1){
        }else if(r == 2){
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        String id;
        String transferencia;
        String id_;
        String transferencia_;
        int saldoInicial;
        int saldoActual;
        String message[] = {"Si", "No", "Cancelar"};
        
        if (txtId.getText().isEmpty() || txtSaldo.getText().isEmpty() || cboTransferencia.equals("SELECCIONE UNA OPCION") || cboTransferenciaIdr.equals("SELECCIONE UNA OPCION")){
            JOptionPane.showMessageDialog(this,"Favor no dejar campos vacios!","ERROR",2);
            txtId.requestFocus();
        }else{
            id = txtId.getText().toUpperCase();
            id_ = cboTransferenciaIdr.getSelectedItem().toString();
            transferencia = cboTransferencia.getSelectedItem().toString();
            saldoInicial = Integer.parseInt(txtSaldo.getText());
            saldoActual = Integer.parseInt(txtSaldo.getText());
            transferencia_ = cboTransferencia.getSelectedItem().toString();
            
            mt.setId(id);
            mt.setTransaccion(transferencia);
            mt.setIdr(id_);
            mt.setSaldo(saldoInicial);
            mt.setSaldoActual(saldoActual);
            mt.setTransaccionIdr(transferencia_);
            int r = JOptionPane.showOptionDialog(null, "¿Desea guardar este \nregistro?", "REGISTRO DE DATOS", 0, 1, null, message, this);
            if (r == 0){
                mt.guardarArreglo(mt);
                mt.guardarArchivo(mt);
                JOptionPane.showMessageDialog(this," Registro exitoso","REGISTRO DE DATOS",1);
                limpiarCeldas();
                txtId.requestFocus();
            }else if(r == 1){
                txtId.requestFocus();
            }else if(r == 2){
                txtId.requestFocus();
            }
        }
        
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_txtSaldoKeyTyped

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel7MouseDragged

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel7MousePressed

    private void btnRetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirosActionPerformed
        new frmRetiros().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetirosActionPerformed

    private void jMenuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jMenuBar1MousePressed

    private void btnConsignacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsignacionesMouseClicked

    }//GEN-LAST:event_btnConsignacionesMouseClicked

    private void btnConsignacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignacionesActionPerformed
        new frmConsignaciones().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsignacionesActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        new frmPagoServicios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        new frmReporteBanco().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReporteActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new frmControlCliente().setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1MouseDragged

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
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Jmenu;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JMenuItem btnConsignaciones;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JMenuItem btnReporte;
    private javax.swing.JMenuItem btnRetiros;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem btnServicios;
    private javax.swing.JComboBox<String> cboTransferencia;
    private javax.swing.JComboBox<String> cboTransferenciaIdr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
