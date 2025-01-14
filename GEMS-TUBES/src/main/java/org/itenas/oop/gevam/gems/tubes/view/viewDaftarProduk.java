/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.oop.gevam.gems.tubes.view;

import org.itenas.oop.gevam.gems.tubes.model.Barang;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.coobird.thumbnailator.Thumbnails;
import org.itenas.oop.gevam.gems.tubes.repository.ControllerBarang;
import java.awt.event.KeyEvent;

/**
 *
 * @author naufa
 */
public final class viewDaftarProduk extends javax.swing.JFrame {
    
    ControllerBarang conBarang = new ControllerBarang();
    private final DefaultTableModel model;
    /**
     * Creates new form viewDaftarProduk
     */
    public viewDaftarProduk() {
         initComponents();
        setLocationRelativeTo(null);
        model = new DefaultTableModel();
        
        tabelBarang.setModel(model);

        model.addColumn("Id");
        model.addColumn("nama produk");
        model.addColumn("jenis");
        model.addColumn("harga");
        model.addColumn("merk");
        model.addColumn("warna");
        model.addColumn("garansi");
        model.addColumn("stok");
        getData();
    }
    
    public void getData() {
        DefaultTableModel dtm = (DefaultTableModel) tabelBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanBarang();
        String[] data = new String[8];
        for (Barang newBarang : listBarang) {
            data[0] = Integer.toString(newBarang.getId());
            data[1] = newBarang.getNamaBarang();
            data[2] = newBarang.getJenis();
            data[3] = Integer.toString(newBarang.getHarga());
            data[4] = newBarang.getMerk();
            data[5] = newBarang.getWarna();
            data[6] = Integer.toString(newBarang.getGaransi());
            data[7] = Integer.toString(newBarang.getStok());
            dtm.addRow(data);
        }
    }
    
    public void getDataSearch(String namaBarang) {
        DefaultTableModel dtm = (DefaultTableModel) tabelBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanBarangSearch(namaBarang);
        String[] data = new String[8];
        for (Barang newBarang : listBarang) {
            data[0] = Integer.toString(newBarang.getId());
            data[1] = newBarang.getNamaBarang();
            data[2] = newBarang.getJenis();
            data[3] = Integer.toString(newBarang.getHarga());
            data[4] = newBarang.getMerk();
            data[5] = newBarang.getWarna();
            data[6] = Integer.toString(newBarang.getGaransi());
            data[7] = Integer.toString(newBarang.getStok());
            dtm.addRow(data);
        }
    }
    
    public void getDataFilterLaptop() {
        DefaultTableModel dtm = (DefaultTableModel) tabelBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanBarangFilterjenisLaptop();
        String[] data = new String[8];
        for (Barang newBarang : listBarang) {
            data[0] = Integer.toString(newBarang.getId());
            data[1] = newBarang.getNamaBarang();
            data[2] = newBarang.getJenis();
            data[3] = Integer.toString(newBarang.getHarga());
            data[4] = newBarang.getMerk();
            data[5] = newBarang.getWarna();
            data[6] = Integer.toString(newBarang.getGaransi());
            data[7] = Integer.toString(newBarang.getStok());
            dtm.addRow(data);
        }
    }
    
   public void getDataFilterHandphone() {
        DefaultTableModel dtm = (DefaultTableModel) tabelBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanBarangFilterjenisHandphone();
        String[] data = new String[8];
        for (Barang newBarang : listBarang) {
            data[0] = Integer.toString(newBarang.getId());
            data[1] = newBarang.getNamaBarang();
            data[2] = newBarang.getJenis();
            data[3] = Integer.toString(newBarang.getHarga());
            data[4] = newBarang.getMerk();
            data[5] = newBarang.getWarna();
            data[6] = Integer.toString(newBarang.getGaransi());
            data[7] = Integer.toString(newBarang.getStok());
            dtm.addRow(data);
        }
    }
   
   public void getDataFilteVrr() {
        DefaultTableModel dtm = (DefaultTableModel) tabelBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanBarangFilterjenisVr();
        String[] data = new String[8];
        for (Barang newBarang : listBarang) {
            data[0] = Integer.toString(newBarang.getId());
            data[1] = newBarang.getNamaBarang();
            data[2] = newBarang.getJenis();
            data[3] = Integer.toString(newBarang.getHarga());
            data[4] = newBarang.getMerk();
            data[5] = newBarang.getWarna();
            data[6] = Integer.toString(newBarang.getGaransi());
            data[7] = Integer.toString(newBarang.getStok());
            dtm.addRow(data);
        }
    }
   
   public void getDataFilterSmartWatch() {
        DefaultTableModel dtm = (DefaultTableModel) tabelBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanBarangFilterjenisSmartWatch();
        String[] data = new String[8];
        for (Barang newBarang : listBarang) {
            data[0] = Integer.toString(newBarang.getId());
            data[1] = newBarang.getNamaBarang();
            data[2] = newBarang.getJenis();
            data[3] = Integer.toString(newBarang.getHarga());
            data[4] = newBarang.getMerk();
            data[5] = newBarang.getWarna();
            data[6] = Integer.toString(newBarang.getGaransi());
            data[7] = Integer.toString(newBarang.getStok());
            dtm.addRow(data);
        }
    }
   
   public void getDataFilterHeadset() {
        DefaultTableModel dtm = (DefaultTableModel) tabelBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanBarangFilterjenisHeadset();
        String[] data = new String[8];
        for (Barang newBarang : listBarang) {
            data[0] = Integer.toString(newBarang.getId());
            data[1] = newBarang.getNamaBarang();
            data[2] = newBarang.getJenis();
            data[3] = Integer.toString(newBarang.getHarga());
            data[4] = newBarang.getMerk();
            data[5] = newBarang.getWarna();
            data[6] = Integer.toString(newBarang.getGaransi());
            data[7] = Integer.toString(newBarang.getStok());
            dtm.addRow(data);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        cbSortingJenis = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        paneImage = new javax.swing.JDesktopPane();
        lbl_image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nama produk", "jenis", "harga", "merk", "warna", "garansi", "stok"
            }
        ));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cbSortingJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Handphone", "Virtual Reality", "Smart Watch", "Headset" }));
        cbSortingJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortingJenisActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        paneImage.setLayer(lbl_image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout paneImageLayout = new javax.swing.GroupLayout(paneImage);
        paneImage.setLayout(paneImageLayout);
        paneImageLayout.setHorizontalGroup(
            paneImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneImageLayout.setVerticalGroup(
            paneImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneImageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(545, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paneImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbSortingJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(269, 269, 269))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paneImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSortingJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        // TODO add your handling code here:
         int i = tabelBarang.getSelectedRow();

        TableModel model = tabelBarang.getModel();
        String namaBarang = model.getValueAt(i, 1).toString();
        String jenis = model.getValueAt(i, 2).toString();
        int harga = Integer.parseInt(model.getValueAt(i, 3).toString());
        String merk = model.getValueAt(i, 4).toString();
        String warna = model.getValueAt(i, 5).toString();
        int garansi = Integer.parseInt(model.getValueAt(i, 6).toString());
        int stok = Integer.parseInt(model.getValueAt(i, 7).toString());
        
        try {
            File imageFile = new File("src/main/java/org/itenas/oop/gevam/gems/tubes/image/"+namaBarang+".jpeg");
            
            if (imageFile != null) {
                BufferedImage originalImage = ImageIO.read(imageFile);
                BufferedImage resizedImage  = Thumbnails.of(originalImage).size(300,400).asBufferedImage();
                
                 ImageIcon icon = new ImageIcon(resizedImage);
            lbl_image.setIcon(icon);
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(resizedImage, "jpeg", baos);
            byte[] imageData = baos.toByteArray();
            
            }else{
                lbl_image .setIcon(null);
                JOptionPane.showMessageDialog(null, "Gambar tidak ditemukan untuk data " + namaBarang);
            }
             
        } catch (Exception e) {
            lbl_image.setIcon(null);
            JOptionPane.showMessageDialog(null, "Error saat memuat gambar " + e.getMessage());
        }
        
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void cbSortingJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortingJenisActionPerformed
        // TODO add your handling code here:
        switch (cbSortingJenis.getSelectedIndex()) {
            case 0:
                getDataFilterLaptop();
                break;
            case 1:
                getDataFilterHandphone();
                break;
            case 2:
                getDataFilteVrr();
                break;
            case 3:
                getDataFilterSmartWatch();
                break;
            case 4:
                getDataFilterHeadset();
                break;
        }
    }//GEN-LAST:event_cbSortingJenisActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here
        getDataSearch(txtSearch.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getDataSearch(txtSearch.getText());
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new viewDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(viewDaftarProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDaftarProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDaftarProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDaftarProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDaftarProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbSortingJenis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JDesktopPane paneImage;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
byte[] barangImage = null;
}

