/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.oop.gevam.gems.tubes.view;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.itenas.oop.gevam.gems.tubes.model.User;
import org.itenas.oop.gevam.gems.tubes.repository.ControllerDataAdmin;
import net.coobird.thumbnailator.Thumbnails;

/**
 *
 * @author ADIKA
 */

public class viewDataAdmin extends javax.swing.JFrame {
    
    Boolean hasil;
    ControllerDataAdmin conAdmin = new ControllerDataAdmin();
    private DefaultTableModel model;
    
    public viewDataAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        model = new DefaultTableModel();
        
        tabelAdmin.setModel(model);
        
        model.addColumn("ID");
        model.addColumn("Nama Admin");
        model.addColumn("Username");
        model.addColumn("Password");
        getData();
    }
    
    public final void getData(){
        DefaultTableModel dtm = (DefaultTableModel) tabelAdmin.getModel();

        dtm.setRowCount(0);

        List<User> listAdmin = conAdmin.showAdmin();
        String[] data = new String[4];
        for (User newAdmin : listAdmin) {
            data[0] = Integer.toString(newAdmin.getID());
            data[1] = newAdmin.getNama();
            data[2] = newAdmin.getUsername();
            data[3] = newAdmin.getPassword();
            dtm.addRow(data);
        }
    }
    
    private void clearData() {
        txtNamaAdmin.setText("");
        txtUsernameAdmin.setText("");
        txtPasswordAdmin.setText("");
        txtNamaAdmin.setEditable(true);
        txtUsernameAdmin.setEditable(true);
        txtPasswordAdmin.setEditable(true);
        lbl_image.setIcon(null);
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
        txtNamaAdmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsernameAdmin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPasswordAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbl_image = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAdmin = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DATA ADMIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Menambah data Admin");

        txtNamaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaAdminActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama Admin");

        txtUsernameAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameAdminActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Username ");

        txtPasswordAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordAdminActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password");

        jDesktopPane1.setLayer(lbl_image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnUpload.setText("UPLOAD");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnTambah.setText("TAMBAHKAN");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("Back To Menu");

        tabelAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Admin", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelAdmin);

        btnClear.setText("BERSIHKAN");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtCari.setText("Cari berdasarkan nama:");
        txtCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCariMouseClicked(evt);
            }
        });
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPasswordAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(txtUsernameAdmin)
                                    .addComponent(txtNamaAdmin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTambah)))
                        .addGap(12, 12, 12)
                        .addComponent(jDesktopPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBack))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpload)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnTambah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsernameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPasswordAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jDesktopPane1))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpload, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap())
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

    private void txtNamaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaAdminActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        hasil = conAdmin.insertDataAdmin(txtNamaAdmin.getText(),
               txtUsernameAdmin.getText(),
                txtPasswordAdmin.getText());
       String targetDirPath = "src/main/java/com/gevam/gems/tubes/image";
       File targetDir = new File(targetDirPath);
       if(!targetDir.exists()) {
           targetDir.mkdir();
       }
       String fileName = txtNamaAdmin.getText().replaceAll("\\s+", "_") + ".jpeg";
       File targetFile = new File(targetDir,fileName);
       
       try (OutputStream os = new FileOutputStream(targetFile)) {
           os.write(adminImage);
           JOptionPane.showMessageDialog(null, "Gambar disimpan di: " + targetFile.getAbsolutePath());
       } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error saat menyimpan gambar: " + ex.getMessage());
       }
        if (hasil) {
            JOptionPane.showMessageDialog(null, 
                    "Data berhasil ditambahkan");
            getData();
            clearData();
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Data gagal ditambahkan", " Pesan", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void txtUsernameAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameAdminActionPerformed

    private void txtPasswordAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordAdminActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        try {
        String Nama = txtCari.getText();
        
        tampilkanDataAdmin(Nama);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "ID harus berupa angka.");
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariMouseClicked
        // TODO add your handling code here:
        txtCari.setText("");
    }//GEN-LAST:event_txtCariMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearData();
        getData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int i = tabelAdmin.getSelectedRow();
            if (i == -1) {
                JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Warning", WARNING_MESSAGE);
            return;
        }

    int idAdmin = Integer.parseInt(tabelAdmin.getValueAt(i, 0).toString());

    int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?",
            "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        boolean hasil = conAdmin.hapusDataAdmin(idAdmin);
        if (hasil) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
            
            getData();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int i = tabelAdmin.getSelectedRow();

        if (i == -1) {
            JOptionPane.showMessageDialog(btnUpdate, 
                    "Harap pilih salah satu data", "warning", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int idAdmin = Integer.parseInt(tabelAdmin.getModel().getValueAt(i, 0).toString());
        String oldNama = tabelAdmin.getModel().getValueAt(i, 1).toString();
        String oldUsername = tabelAdmin.getModel().getValueAt(i, 2).toString();
        String oldPassword = tabelAdmin.getModel().getValueAt(i, 2).toString();
        
        conAdmin.updateDataAdmin(txtNamaAdmin.getText(), txtUsernameAdmin.getText(), txtPasswordAdmin.getText(), oldNama, oldUsername, oldPassword, idAdmin);
        JOptionPane.showMessageDialog(btnUpdate, "Data berhasil diUpdate");
        getData();
        clearData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tabelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAdminMouseClicked
        // TODO add your handling code here:
        int i = tabelAdmin.getSelectedRow();

        TableModel model = tabelAdmin.getModel();
        String namaAdmin = model.getValueAt(i, 1).toString();
        String username = model.getValueAt(i, 2).toString();
        String password = model.getValueAt(i, 3).toString();
        
        txtNamaAdmin.setText( namaAdmin);
        txtUsernameAdmin.setText(username);
        txtPasswordAdmin.setText(password);
        
        try{
            File imageFile = new File("src/main/java/com/gevam/gems" + "/tubes/image/" +namaAdmin+ ".jpeg");
            if(imageFile != null) {
                BufferedImage originalImage = ImageIO.read(imageFile);
                BufferedImage resizedImage = Thumbnails.of(originalImage).size(230,130).asBufferedImage();
                ImageIcon icon = new ImageIcon(resizedImage);
                lbl_image.setIcon(icon);
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] imageData = baos.toByteArray();
            } else {
                lbl_image.setIcon(null);
                JOptionPane.showMessageDialog(null,"Gambar tidak ditembukan untuk data " + namaAdmin);
            }
        } catch (IOException e) {
            lbl_image.setIcon(null);
            JOptionPane.showMessageDialog(null, "Error saat memuat gambar: " + e.getMessage());
        }
    }//GEN-LAST:event_tabelAdminMouseClicked

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        String namaFileBarang = null;
        ImageIcon mobilIcon = null;
        
        int returnValue = fileChooser.showOpenDialog(null);
        
        if(returnValue == fileChooser.APPROVE_OPTION ) {
            File file = fileChooser.getSelectedFile();
            namaFileBarang = file.getAbsolutePath();
            
            try {
                File image = new File(namaFileBarang);
                BufferedImage thumbnail = Thumbnails.of(image).size(100,220).asBufferedImage();
                
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(thumbnail, "jpeg", os);
                InputStream is = new ByteArrayInputStream(os.toByteArray());
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                
                for (int readNum; (readNum = is.read(buf)) != -1;){
                    bos.write(buf,0,readNum);
                }
                mobilIcon = new ImageIcon(thumbnail);
                lbl_image.setIcon(mobilIcon);
                adminImage = bos.toByteArray();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error processing image: " + e.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(null, "No file selected.");
        }
    }//GEN-LAST:event_btnUploadActionPerformed

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
            java.util.logging.Logger.getLogger(viewDataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDataAdmin().setVisible(true);
            }
        });
    }
    
    private void tampilkanDataAdmin(String Nama) {
    User Admin = conAdmin.cariDataAdmin(Nama);
    DefaultTableModel dtm = (DefaultTableModel) tabelAdmin.getModel();
    dtm.setRowCount(0);
    
    if (Admin != null) {
        String[] data = new String[4];
        data[0] = Integer.toString(Admin.getID());
        data[1] = Admin.getNama();
        data[2] = Admin.getUsername();
        data[3] = Admin.getPassword();
        dtm.addRow(data);
    } else {
        JOptionPane.showMessageDialog(null, "Kasir dengan Nama " + Nama + " tidak ditemukan.");
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpload;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTable tabelAdmin;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNamaAdmin;
    private javax.swing.JTextField txtPasswordAdmin;
    private javax.swing.JTextField txtUsernameAdmin;
    // End of variables declaration//GEN-END:variables
byte[] adminImage = null;
}