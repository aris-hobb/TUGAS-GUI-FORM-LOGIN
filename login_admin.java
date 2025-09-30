import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class login_admin extends javax.swing.JFrame {
    
    private Connection conn;
    
    private void connectDB() {
        try {
            // Gunakan properti koneksi PostgreSQL Anda
            String url = "jdbc:postgresql://localhost:5432/OOP";
            String user = "postgres"; // ganti dengan username PostgreSQL Anda
            String password = "anonim"; // ganti dengan password PostgreSQL Anda 

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Admin berhasil.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Koneksi Database Gagal: " + e.getMessage(), "Error Koneksi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public login_admin() {
        initComponents();
        connectDB();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idadmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deleteadmin = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        loginadmin = new javax.swing.JButton();
        labelid = new javax.swing.JLabel();
        passwordadmin = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadminActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jLabel1.setText("LOGIN ADMIN");

        deleteadmin.setText("DELETE");
        deleteadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteadminActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        loginadmin.setText("LOGIN");
        loginadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginadminActionPerformed(evt);
            }
        });

        labelid.setText("ID");

        passwordadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordadminActionPerformed(evt);
            }
        });

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(labelid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 123, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteadmin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit)
                            .addComponent(loginadmin))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idadmin, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(passwordadmin))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelid))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteadmin)
                    .addComponent(loginadmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(jButton1))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void idadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadminActionPerformed

    private void passwordadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordadminActionPerformed

    private void loginadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginadminActionPerformed
        try {
        int ID = Integer.parseInt(idadmin.getText());
        String pass = new String(passwordadmin.getPassword());
        
        if (conn == null || conn.isClosed()) {
                JOptionPane.showMessageDialog(this, "Koneksi database belum aktif. Harap coba lagi.", "Error Koneksi", JOptionPane.ERROR_MESSAGE);
                return;
            }   
        String sql = "SELECT id FROM login_admin WHERE id = ? AND password = ?";
        PreparedStatement stmt = this.conn.prepareStatement(sql); 
            stmt.setInt(1, ID); 
            stmt.setString(2, pass);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Login BERHASIL
                JOptionPane.showMessageDialog(this, "✅ Login Berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                
                JFrame_TampilAdmin frameAdmin = new JFrame_TampilAdmin();
                frameAdmin.setVisible(true);
                
                this.dispose(); 
                
            } else {
                // Login GAGAL
                JOptionPane.showMessageDialog(this, "❌ ID atau Password Salah!", "Login Gagal", JOptionPane.ERROR_MESSAGE);
                passwordadmin.setText(""); 
            }
            rs.close();
            stmt.close();
            
            } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka!", "Input Error", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi Error saat Login: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginadminActionPerformed

    private void deleteadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteadminActionPerformed
        idadmin.setText("");
        passwordadmin.setText("");
    }//GEN-LAST:event_deleteadminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            // 1. Koneksi ke database
            Class.forName("org.postgresql.Driver"); // Ganti sesuai driver DB kamu
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OOP", "postgres", "anonim");

            // 2. SQL untuk menambahkan data
            String sql = "INSERT INTO login_admin (id, password) VALUES (?, ?)";

            // 3. Ambil data dari input form
            int ID = Integer.parseInt(idadmin.getText()); // JTextField namaField
            String pass = new String(passwordadmin.getPassword()); // JTextField passwordField

            // 4. Eksekusi query
            pst = conn.prepareStatement(sql);
            pst.setInt(1, ID);
            pst.setString(2, pass);
            pst.executeUpdate();

            // 5. Tampilkan pesan sukses
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                // Optional: log error saat menutup koneksi
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteadmin;
    private javax.swing.JButton exit;
    private javax.swing.JTextField idadmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelid;
    private javax.swing.JButton loginadmin;
    private javax.swing.JPasswordField passwordadmin;
    // End of variables declaration//GEN-END:variables
}
