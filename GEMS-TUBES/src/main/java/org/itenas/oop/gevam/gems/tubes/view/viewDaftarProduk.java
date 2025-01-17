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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.itenas.oop.gevam.gems.tubes.config.ConnectionManager;

/**
 *
 * @author naufa
 */
public final class viewDaftarProduk extends javax.swing.JFrame {
    
     Boolean hasil;
    ControllerBarang conBarang = new ControllerBarang();
    private DefaultTableModel model;
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
        jLabel1 = new javax.swing.JLabel();
        paneImage = new javax.swing.JDesktopPane();
        lbl_image = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        kontrolProduk = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelTambahAkunAdmin = new javax.swing.JLabel();
        labelTambahAkunKasir = new javax.swing.JLabel();
        labelTambahAkunKasir2 = new javax.swing.JLabel();
        labelTambahAkunKasir3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 249, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAMA BARANG", "KATEGORI", "HARGA", "MERK", "WARNA", "GARANSI", "STOK"
            }
        ));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        btnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
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

        lbl_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        paneImage.setLayer(lbl_image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout paneImageLayout = new javax.swing.GroupLayout(paneImage);
        paneImage.setLayout(paneImageLayout);
        paneImageLayout.setHorizontalGroup(
            paneImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );
        paneImageLayout.setVerticalGroup(
            paneImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(145, 221, 207));

        kontrolProduk.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        kontrolProduk.setForeground(new java.awt.Color(255, 255, 255));
        kontrolProduk.setText("KONTROL PRODUK");
        kontrolProduk.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                kontrolProdukAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        kontrolProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kontrolProdukMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DAFTAR PRODUK");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 102));
        jLabel13.setText("ADMIN");

        labelTambahAkunAdmin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        labelTambahAkunAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labelTambahAkunAdmin.setText("KELOLA ADMIN");
        labelTambahAkunAdmin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelTambahAkunAdminAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        labelTambahAkunAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTambahAkunAdminMouseClicked(evt);
            }
        });

        labelTambahAkunKasir.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        labelTambahAkunKasir.setForeground(new java.awt.Color(255, 255, 255));
        labelTambahAkunKasir.setText("KELOLA KASIR");
        labelTambahAkunKasir.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelTambahAkunKasirAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        labelTambahAkunKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTambahAkunKasirMouseClicked(evt);
            }
        });

        labelTambahAkunKasir2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        labelTambahAkunKasir2.setForeground(new java.awt.Color(255, 255, 255));
        labelTambahAkunKasir2.setText("LAPORAN TRANSAKSI");
        labelTambahAkunKasir2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelTambahAkunKasir2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        labelTambahAkunKasir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTambahAkunKasir2MouseClicked(evt);
            }
        });

        labelTambahAkunKasir3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        labelTambahAkunKasir3.setForeground(new java.awt.Color(255, 255, 255));
        labelTambahAkunKasir3.setText("LAPORAN PENJUALAN");
        labelTambahAkunKasir3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelTambahAkunKasir3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        labelTambahAkunKasir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTambahAkunKasir3MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("LOG OUT");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTambahAkunAdmin)
                            .addComponent(kontrolProduk)
                            .addComponent(labelTambahAkunKasir)
                            .addComponent(labelTambahAkunKasir2)
                            .addComponent(labelTambahAkunKasir3)
                            .addComponent(jLabel11))))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel13)
                .addGap(36, 36, 36)
                .addComponent(kontrolProduk)
                .addGap(18, 18, 18)
                .addComponent(labelTambahAkunAdmin)
                .addGap(18, 18, 18)
                .addComponent(labelTambahAkunKasir)
                .addGap(18, 18, 18)
                .addComponent(labelTambahAkunKasir2)
                .addGap(18, 18, 18)
                .addComponent(labelTambahAkunKasir3)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(55, 55, 55))
        );

        jPanel4.setBackground(new java.awt.Color(77, 161, 169));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(77, 161, 169));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(28, 28, 28))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DAFTAR PRODUK");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbSortingJenis, javax.swing.GroupLayout.Alignment.LEADING, 0, 383, Short.MAX_VALUE)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(94, 94, 94)
                                    .addComponent(paneImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1139, 1139, 1139)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(120, 120, 120))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSearch))
                                        .addGap(37, 37, 37)
                                        .addComponent(cbSortingJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(paneImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, Short.MAX_VALUE)
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
        DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
    model.setRowCount(0);

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        ConnectionManager conMan = new ConnectionManager();
        con = conMan.logOn();

        // Query hanya untuk mengambil nama barang berdasarkan jenis
        String sql = "SELECT * FROM barang WHERE jenis = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, (String) cbSortingJenis.getSelectedItem()); 

        rs = ps.executeQuery();

        // Isi tabel hanya dengan nama barang
        while (rs.next()) {
            
                int Id = rs.getInt("id");
               String NamaBarang = rs.getString("namaBarang");
               String Jenis = rs.getString("jenis");
               int Harga = rs.getInt("harga");
               String Merk = rs.getString("merk");
               String Warna = rs.getString("warna");
               int Garansi = rs.getInt("garansi");
               int Stok = rs.getInt("stok");
            model.addRow(new Object[]{Id,NamaBarang,Jenis,Harga,Merk,Warna,Garansi,Stok}); // Tambahkan hanya nama barang
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
    }
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

    private void kontrolProdukAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_kontrolProdukAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_kontrolProdukAncestorAdded

    private void kontrolProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kontrolProdukMouseClicked
        // TODO add your handling code here:
        new viewKontrolProduk().setVisible(true);
        dispose();
    }//GEN-LAST:event_kontrolProdukMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        new viewDaftarProduk().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void labelTambahAkunAdminAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelTambahAkunAdminAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_labelTambahAkunAdminAncestorAdded

    private void labelTambahAkunAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTambahAkunAdminMouseClicked
        // TODO add your handling code here:
        new viewDataAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelTambahAkunAdminMouseClicked

    private void labelTambahAkunKasirAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelTambahAkunKasirAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_labelTambahAkunKasirAncestorAdded

    private void labelTambahAkunKasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTambahAkunKasirMouseClicked
        // TODO add your handling code here:
        new viewDataKasir().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelTambahAkunKasirMouseClicked

    private void labelTambahAkunKasir2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelTambahAkunKasir2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_labelTambahAkunKasir2AncestorAdded

    private void labelTambahAkunKasir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTambahAkunKasir2MouseClicked
        // TODO add your handling code here:
        new viewLaporanTransaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelTambahAkunKasir2MouseClicked

    private void labelTambahAkunKasir3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelTambahAkunKasir3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_labelTambahAkunKasir3AncestorAdded

    private void labelTambahAkunKasir3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTambahAkunKasir3MouseClicked
        // TODO add your handling code here:
        new viewLaporanPenjualan().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelTambahAkunKasir3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new viewLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kontrolProduk;
    private javax.swing.JLabel labelTambahAkunAdmin;
    private javax.swing.JLabel labelTambahAkunKasir;
    private javax.swing.JLabel labelTambahAkunKasir2;
    private javax.swing.JLabel labelTambahAkunKasir3;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JDesktopPane paneImage;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
byte[] barangImage = null;
}

