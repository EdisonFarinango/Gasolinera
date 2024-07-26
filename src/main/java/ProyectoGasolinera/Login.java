/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoGasolinera;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Login extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.Escalar(lblPrin, "/C:/Users/USER/OneDrive/Escritorio/mockitt/visual/gaso.jpg");
        this.Escalar(lblLogo, "/C:/Users/USER/OneDrive/Escritorio/mockitt/visual/logo.png");
        this.Escalar(lbluser, "/C:/Users/USER/OneDrive/Escritorio/mockitt/visual/user.png");
        this.Escalar(lblmostrar, "/C:/Users/USER/OneDrive/Escritorio/mockitt/visual/pass.png");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblPrin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        fieldContrasenia = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lblmostrar = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel3)
                .addContainerGap(234, Short.MAX_VALUE))
            .addComponent(lblPrin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("SESIÓN");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("INICIAR");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("USUARIO");

        fieldUsuario.setForeground(new java.awt.Color(204, 204, 204));
        fieldUsuario.setText("Ingrese su nombre de usuario.");
        fieldUsuario.setBorder(null);
        fieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldUsuarioMousePressed(evt);
            }
        });
        fieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuarioActionPerformed(evt);
            }
        });

        fieldContrasenia.setForeground(new java.awt.Color(204, 204, 204));
        fieldContrasenia.setText("********");
        fieldContrasenia.setBorder(null);
        fieldContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldContraseniaMousePressed(evt);
            }
        });
        fieldContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldContraseniaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        btnLogin.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("ENTRAR");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        lblmostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmostrarMouseClicked(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jCheckBox1.setText("Mostrar contraseña");
        jCheckBox1.setBorder(null);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(fieldContrasenia)
                                    .addComponent(jSeparator1)
                                    .addComponent(fieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCheckBox1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 400, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldUsuarioMousePressed
        if (fieldUsuario.getText().equals("Ingrese su nombre de usuario.")) {
            fieldUsuario.setText("");
            fieldUsuario.setForeground(Color.black);
        }
        if (String.valueOf(fieldContrasenia.getPassword()).isEmpty()) {
            fieldContrasenia.setText("********");
            fieldContrasenia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_fieldUsuarioMousePressed

    private void fieldContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldContraseniaMousePressed
        if (String.valueOf(fieldContrasenia.getPassword()).equals("********")) {
            fieldContrasenia.setText("");
            fieldContrasenia.setForeground(Color.black);
        }
        if (fieldUsuario.getText().isEmpty()) {
            fieldUsuario.setText("Ingrese su nombre de usuario.");
            fieldUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_fieldContraseniaMousePressed

    boolean mostrarContrasenia = false;

    private void lblmostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmostrarMouseClicked

    }//GEN-LAST:event_lblmostrarMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String usuario = fieldUsuario.getText();
        String contrasenia = new String(fieldContrasenia.getPassword());

        Gasolinera.Conexion conexion = new Gasolinera.Conexion();
        conexion.conectar();

        try {
            // Consulta para verificar si es un empleado
            String sqlEmpleado = "SELECT * FROM Empleados WHERE Usuario=? AND Clave=?";
            PreparedStatement psEmpleado = conexion.conn.prepareStatement(sqlEmpleado);
            psEmpleado.setString(1, usuario);
            psEmpleado.setString(2, contrasenia);
            ResultSet rsEmpleado = psEmpleado.executeQuery();

            if (rsEmpleado.next()) {
                // Si las credenciales corresponden a un empleado
                String cedula = rsEmpleado.getString("Cedula");
                String nombre = rsEmpleado.getString("Nombre");
                String apellido = rsEmpleado.getString("Apellido");

                JOptionPane.showMessageDialog(this, "Inicio de sesión como empleado exitoso");

                // Abrir VentanaEstacion y pasar los datos del empleado
                VentanaEstacion ventanaEstacion = new VentanaEstacion(cedula, nombre, apellido);
                ventanaEstacion.setVisible(true);
                this.dispose();

            } else {
                // Si no es empleado, verificar si es administrador
                String sqlAdmin = "SELECT * FROM Admin WHERE Usuario=? AND Clave=?";
                PreparedStatement psAdmin = conexion.conn.prepareStatement(sqlAdmin);
                psAdmin.setString(1, usuario);
                psAdmin.setString(2, contrasenia);
                ResultSet rsAdmin = psAdmin.executeQuery();

                if (rsAdmin.next()) {
                    // Si las credenciales corresponden a un administrador
                    JOptionPane.showMessageDialog(this, "Inicio de sesión como administrador exitoso");

                    // Abrir VentanaMenu para administrador
                    Menu ventanaMenu = new Menu();
                    ventanaMenu.setVisible(true);
                    this.dispose();

                } else {
                    // Si no se encontraron coincidencias en ninguna tabla
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
                }

                rsAdmin.close();
                psAdmin.close();
            }

            rsEmpleado.close();
            psEmpleado.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error en la conexión a la base de datos: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            conexion.desconectar();
        }

    }//GEN-LAST:event_btnLoginMouseClicked

    private void fieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsuarioActionPerformed

    private void fieldContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldContraseniaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (mostrarContrasenia) {
            fieldContrasenia.setEchoChar('*');
            mostrarContrasenia = false;
        } else {
            fieldContrasenia.setEchoChar((char) 0);
            mostrarContrasenia = true;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    private void Escalar(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JPasswordField fieldContrasenia;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPrin;
    private javax.swing.JLabel lblmostrar;
    private javax.swing.JLabel lbluser;
    // End of variables declaration//GEN-END:variables
}
