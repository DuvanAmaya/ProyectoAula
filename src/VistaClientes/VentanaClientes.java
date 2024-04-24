package VistaClientes;

import gestordeclientesgimnasio.Clientes;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author HP
 */
public class VentanaClientes extends javax.swing.JDialog {
    Clientes clientes = new Clientes();
    
    List<Clientes> cliente = new ArrayList<>();
    /**
     * Creates new form VentanaClientes
     */
    public VentanaClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPlanesGimnasio = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        radioPlanMensual = new javax.swing.JRadioButton();
        radioPlanAnual = new javax.swing.JRadioButton();
        fechaInicioPlan = new com.toedter.calendar.JDateChooser();
        fechaFinPlan = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionPlan = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("GESTION DE CLIENTES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true), "Datos del cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setText("CEDULA:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("APELLIDO:");

        jLabel5.setText("CORREO:");

        jLabel6.setText("TELEFONO:");

        jLabel7.setText("PLAN ELEGIDO:");

        jLabel8.setText("INICIO DEL PLAN:");

        jLabel9.setText("FIN DEL PLAN:");

        campoCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCedulaMouseClicked(evt);
            }
        });
        campoCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCedulaKeyTyped(evt);
            }
        });

        campoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoNombreMouseClicked(evt);
            }
        });

        campoApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoApellidoMouseClicked(evt);
            }
        });

        campoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCorreoMouseClicked(evt);
            }
        });

        campoTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoTelefonoMouseClicked(evt);
            }
        });
        campoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTelefonoKeyTyped(evt);
            }
        });

        grupoPlanesGimnasio.add(radioPlanMensual);
        radioPlanMensual.setText("PLAN MENSUAL");

        grupoPlanesGimnasio.add(radioPlanAnual);
        radioPlanAnual.setText("PLAN ANUAL");

        txtDescripcionPlan.setEditable(false);
        txtDescripcionPlan.setColumns(20);
        txtDescripcionPlan.setRows(5);
        txtDescripcionPlan.setText("Planes Disponibles:\n\n--- Plan Mensual ---\n\n-- Duración del plan: 30 días.\n\n-- Precio: $60.000\n\n-- Descripción del plan: \nAcceso a nuestros servicios: Duchas,\nparqueadero, comedor,\nzona de masajes.\n\n--- Plan Anual ---\n\n-- Duración del plan: 1 año.\n\n-- Precio: $60.000\n\n-- Descripción del plan: \nAcceso a nuestros servicios: Duchas,\nparqueadero, comedor,saunas,\nzona de masajes.");
        txtDescripcionPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtDescripcionPlan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioPlanMensual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(radioPlanAnual))
                    .addComponent(campoCedula)
                    .addComponent(campoNombre)
                    .addComponent(campoApellido)
                    .addComponent(campoCorreo)
                    .addComponent(campoTelefono)
                    .addComponent(fechaInicioPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaFinPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(radioPlanMensual)
                            .addComponent(radioPlanAnual))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(fechaInicioPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(fechaFinPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1)
                .addGap(0, 314, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Se valida todos los campos que esten vacios
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(!validarDatosEnCampo(campoCedula, "Digite la cedula")) {
        return;
        }
        if(!validarDatosEnCampo(campoNombre, "Digite el nombre")) {
        return;
        }
        if(!validarDatosEnCampo(campoApellido, "Digite el apellido")) {
        return;
        }
        if(!validarDatosEnCampo(campoCorreo, "Digite el correo")) {
        return;
        }
        if(!validarDatosEnCampo(campoTelefono, "Digite el telefono")) {
        return;
        }
        if(!radioPlanMensual.isSelected() && !radioPlanAnual.isSelected()) {
            JOptionPane.showMessageDialog(this, "Elegir un plan");
            return;
        }
        /*Obtenemos las fechas, si estan uno de los dos campos vacios
        manda un mensaje de aviso
        */
        clientes.inicioPlan = fechaInicioPlan.getDate();
        clientes.finPlan = fechaFinPlan.getDate();
        if(clientes.inicioPlan == null || clientes.finPlan == null) {
            JOptionPane.showMessageDialog(this, "Fechas de plan no ingresado");
        }
        //Verifica que el telefono tenga un texto
        clientes.telefono = campoTelefono.getText();
        try {
            long tel = Integer.parseInt(clientes.telefono);
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(this, "El telefono debe ser numerico", "Validar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!validarEmail(campoCorreo.getText())) {
            return;
        }
        //Mostrar y recuperar todos los datos
        //telefono, inicioPlan y finPlan ya están arriba
        clientes.cedula = campoCedula.getText();
        clientes.nombre = campoNombre.getText();
        clientes.apellido = campoApellido.getText();
        clientes.correo = campoCorreo.getText();
        clientes.planElegido = (radioPlanMensual.isSelected())
                                ? radioPlanMensual.getText()
                                : radioPlanAnual.getText();
        //Datos
        cliente.add(clientes);
        int totalClientes = cliente.size();
        String datos = "CEDULA: " + clientes.cedula + "\n";
                datos += "NOMBRE: " + clientes.nombre + "\n";
                datos += "APELLIDO: " + clientes.apellido + "\n";
                datos += "CORREO: " + clientes.correo + "\n";
                datos += "TELEFONO: " + clientes.telefono + "\n";
                datos += "PLAN ELEGIDO: " + clientes.planElegido + "\n";
                datos += "INICIO DEL PLAN: " + clientes.inicioPlan + "\n";
                datos += "FIN DEL PLAN: " + clientes.finPlan + "\n";
                datos += "----------------------- \n";
                datos += "CLIENTES REGISTRADOS: " + totalClientes + "\n";
                JOptionPane.showMessageDialog(this, datos);
                        
}   
        private boolean validarEmail(String email) {
            int cuentaArroba = 0;
            
            for(int i = 0; i < email.length(); i++) {
                char caracter = email.charAt(i);
                if(Character.isSpaceChar(caracter)) {
                    JOptionPane.showMessageDialog(this, "El email no puede tener espacios", "Validar", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                if(caracter == '@') {
                    ++ cuentaArroba;
                }
                if ( (caracter >= 33 & caracter <= 44) || (caracter == 47)
                      || (caracter >= 58 && caracter <= 63)
                      || (caracter >= 91 && caracter <= 94) 
                      || (caracter == 96)
                      || (caracter >= 123)
                    )
                {
                    JOptionPane.showMessageDialog(this, "El email no puede tener caracteres extraños", "Validar", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                
            }
            if (email.startsWith("@") || email.endsWith("@")) {
                    JOptionPane.showMessageDialog(this, "El email no puede empezar ni terminar con @", "Validar", JOptionPane.ERROR_MESSAGE);
                    return false;
            }
            if (cuentaArroba != 1) {
                    JOptionPane.showMessageDialog(this, "El email no puede tener varios arrobas", "Validar", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
                
                
    }//GEN-LAST:event_btnGuardarActionPerformed
    //Desactivamos los caracteres en el campo de la cedula
    private void campoCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCedulaKeyTyped
        char tecla = evt.getKeyChar();
        if(!Character.isDigit(tecla)) {
            evt.consume();
        }
        
        
    }//GEN-LAST:event_campoCedulaKeyTyped

    private void campoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTelefonoKeyTyped
        char tecla = evt.getKeyChar();
        if(!Character.isDigit(tecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_campoTelefonoKeyTyped

    private void campoCedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCedulaMouseClicked
        cambiarColorCampo((JTextComponent)evt.getSource());
    }//GEN-LAST:event_campoCedulaMouseClicked

    private void campoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoNombreMouseClicked
        cambiarColorCampo((JTextComponent)evt.getSource());
    }//GEN-LAST:event_campoNombreMouseClicked

    private void campoApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoApellidoMouseClicked
        cambiarColorCampo((JTextComponent)evt.getSource());
    }//GEN-LAST:event_campoApellidoMouseClicked

    private void campoCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCorreoMouseClicked
        cambiarColorCampo((JTextComponent)evt.getSource());
    }//GEN-LAST:event_campoCorreoMouseClicked

    private void campoTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoTelefonoMouseClicked
        cambiarColorCampo((JTextComponent)evt.getSource());
    }//GEN-LAST:event_campoTelefonoMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void cambiarColorCampo (JTextComponent campo) {
            campo.setBackground(Color.WHITE);
    }
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
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaClientes dialog = new VentanaClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private boolean validarDatosEnCampo(JTextField campo, String mensaje) {
        String dato = campo.getText();
        dato = dato.trim();
        if(dato.isEmpty()) {
            campo.requestFocus();
            campo.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, mensaje, "Validar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private com.toedter.calendar.JDateChooser fechaFinPlan;
    private com.toedter.calendar.JDateChooser fechaInicioPlan;
    private javax.swing.ButtonGroup grupoPlanesGimnasio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioPlanAnual;
    private javax.swing.JRadioButton radioPlanMensual;
    private javax.swing.JTextArea txtDescripcionPlan;
    // End of variables declaration//GEN-END:variables
}
