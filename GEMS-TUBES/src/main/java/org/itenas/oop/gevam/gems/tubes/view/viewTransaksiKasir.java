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
import java.text.NumberFormat;
import java.util.Locale;
import org.itenas.oop.gevam.gems.tubes.config.ConnectionManager;

/**
 *
 * @author naufa
 */
public class viewTransaksiKasir extends javax.swing.JFrame {
    
    
    private DefaultTableModel barang;

    Boolean hasil;
    ControllerBarang conBarang = new ControllerBarang();
    private DefaultTableModel model;
    
    /**
     * Creates new form viewTransaksiKasir
     */
    private boolean isMessageShown = false;
    
    public viewTransaksiKasir() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel model = new DefaultTableModel();
        
        
        tblNamaBarang.setModel(model);

        model.addColumn("nama produk");
        getDataTabel();
        
        tblNamaBarang.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = tblNamaBarang.getSelectedRow();
            if (row != -1) {
                String namaBarang = tblNamaBarang.getModel().getValueAt(row, 0).toString();
                txtNamaBarang.setText(namaBarang); // Menampilkan nama barang di JTextField
                
            }
        }
    });
       
        txtNamaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyPressed(java.awt.event.KeyEvent evt) {
        txtNamaBarangKeyPressed(evt);
    }
});
        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
             txtNamaBarang.setText(" "); 
            //searchNamaBarang(evt);
        }
    });
    }
    
    public void getDataTabel() {
        DefaultTableModel dtm = (DefaultTableModel) tblNamaBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanNamaBarang();
        String[] data = new String[1];
        for (Barang newBarang : listBarang) {
            data[0] = newBarang.getNamaBarang();
            dtm.addRow(data);
        }
    }
   
    public void getNamaLaptop() {
        DefaultTableModel dtm = (DefaultTableModel) tblNamaBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanNamaBarangLaptop();
        String[] data = new String[1];
        
        for (Barang newBarang : listBarang) {
            data[1] = newBarang.getNamaBarang();
            dtm.addRow(data);
        }
    }
    
   public void getNamaHandphone() {
        DefaultTableModel dtm = (DefaultTableModel) tblNamaBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanNamaBarangHandphone();
        String[] data = new String[1];
        for (Barang newBarang : listBarang) {
            data[0] = newBarang.getNamaBarang();
            dtm.addRow(data);
        }
    }
   
   public void getNamaVR() {
        DefaultTableModel dtm = (DefaultTableModel) tblNamaBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanNamaBarangVR();
        String[] data = new String[1];
        for (Barang newBarang : listBarang) {
            data[0] = newBarang.getNamaBarang();
            dtm.addRow(data);
        }
    }
   
   public void getNamaSW() {
        DefaultTableModel dtm = (DefaultTableModel) tblNamaBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanNamaBarangSW();
        String[] data = new String[1];
        for (Barang newBarang : listBarang) {
            data[0] = newBarang.getNamaBarang();
            dtm.addRow(data);
        }
    }
   
   public void getNamaHeadset() {
        DefaultTableModel dtm = (DefaultTableModel) tblNamaBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanNamaBarangHeadset();
        String[] data = new String[1];
        for (Barang newBarang : listBarang) {
            data[0] = newBarang.getNamaBarang();
            dtm.addRow(data);
        }
    }
   
   public void getNamaSearch(String namaBarang) {
        DefaultTableModel dtm = (DefaultTableModel) tblNamaBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanNamaBarangSearch(namaBarang);
        String[] data = new String[1];
        for (Barang newBarang : listBarang) {
            data[0] = newBarang.getNamaBarang();
            dtm.addRow(data);
        }
    }
   
   public void getNamaBarang() {
        DefaultTableModel dtm = (DefaultTableModel) tblNamaBarang.getModel();

        dtm.setRowCount(0);

        List<Barang> listBarang = conBarang.tampilkanNamaBarang();
        String[] data = new String[1];
        for (Barang newBarang : listBarang) {
            data[1] = newBarang.getNamaBarang();
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
        tabelTransaksi = new javax.swing.JTable();
        btnNamaCustomer = new javax.swing.JButton();
        txtNamaCustomer = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtJumlahBarang = new javax.swing.JTextField();
        btnNamaBarang = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTotalTransaksi = new javax.swing.JTextPane();
        labelTotalTransaksi = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlNamaCustomer = new javax.swing.JTextPane();
        labelNamaCustomer = new javax.swing.JLabel();
        cbKategori = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNamaBarang = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID BARANG", "NAMA BARANG", "HARGA BARANG", "KUANTITAS", "TOTAL HARGA"
            }
        ));
        tabelTransaksi.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabelTransaksi);

        btnNamaCustomer.setText("Add");
        btnNamaCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamaCustomerActionPerformed(evt);
            }
        });

        txtNamaCustomer.setText("Masukkan nama customer");
        txtNamaCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNamaCustomerMouseClicked(evt);
            }
        });
        txtNamaCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaCustomerActionPerformed(evt);
            }
        });
        txtNamaCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaCustomerKeyPressed(evt);
            }
        });

        txtNamaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaBarangKeyPressed(evt);
            }
        });

        txtJumlahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahBarangActionPerformed(evt);
            }
        });

        btnNamaBarang.setText("Add");
        btnNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamaBarangActionPerformed(evt);
            }
        });

        txtTotalTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalTransaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalTransaksi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtTotalTransaksiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(txtTotalTransaksi);

        labelTotalTransaksi.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        labelTotalTransaksi.setForeground(new java.awt.Color(0, 0, 0));
        labelTotalTransaksi.setText("TOTAL TRANSAKSI");
        labelTotalTransaksi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelTotalTransaksi.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        labelTotalTransaksi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelTotalTransaksiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        pnlNamaCustomer.setBackground(new java.awt.Color(255, 255, 255));
        pnlNamaCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(pnlNamaCustomer);

        labelNamaCustomer.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        labelNamaCustomer.setForeground(new java.awt.Color(0, 0, 0));
        labelNamaCustomer.setText("CUSTOMER : ");

        cbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Handphone", "Virtual Reality", "Smart Watch", "Headset" }));
        cbKategori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKategoriActionPerformed(evt);
            }
        });

        tblNamaBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {""},
                {null},
                {null}
            },
            new String [] {
                "Nama Barang"
            }
        ));
        tblNamaBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNamaBarangMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblNamaBarang);

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Masukan jumlah barang : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTotalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btnNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNamaCustomer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(txtNamaCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNamaBarang))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTotalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate)
                        .addComponent(btnClear)
                        .addComponent(btnDelete))
                    .addComponent(btnSave))
                .addGap(71, 71, 71))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void txtJumlahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahBarangActionPerformed

    private void txtNamaCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaCustomerKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String customerName = txtNamaCustomer.getText().trim();

        // Periksa apakah transaksi sebelumnya belum disimpan
        if (!isTransactionSaved) {
            JOptionPane.showMessageDialog(this, 
                "Transaksi sebelumnya belum disimpan! Harap simpan transaksi sebelum menambahkan pelanggan baru.", 
                "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Periksa apakah nama customer tidak kosong
        if (!customerName.isEmpty()) {
            // Dapatkan teks lama dan tambahkan teks baru
            String existingText = pnlNamaCustomer.getText();
            String newText = existingText + (existingText.isEmpty() ? "" : "\n") + customerName;

            // Tampilkan teks baru di JTextPane
            pnlNamaCustomer.setText(newText);

            // Reset input
            txtNamaCustomer.setText("");

            // Tandai bahwa transaksi belum disimpan dan nonaktifkan input/tombol
            isTransactionSaved = false;
            txtNamaCustomer.setEnabled(false); // Nonaktifkan input
            btnNamaCustomer.setEnabled(false); // Nonaktifkan tombol "Add"
        } else {
            JOptionPane.showMessageDialog(this, 
                "Nama customer tidak boleh kosong!", 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_txtNamaCustomerKeyPressed

    
    
    public void enableCustomerInput() {
        txtNamaCustomer.setEnabled(true);
        isTransactionSaved = true; // Ubah status transaksi menjadi disimpan
    }
    
    private void txtNamaCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaCustomerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNamaCustomerActionPerformed
    
    private void txtNamaBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaBarangKeyPressed
       
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { // Periksa apakah tombol Enter ditekan
        // Ambil input dari JTextField dan hapus spasi di awal/akhir
        String searchQuery = txtNamaBarang.getText().trim(); // Hapus spasi di awal/akhir input
        
        // Periksa apakah kategori sudah dipilih
        String selectedCategory = (String) cbKategori.getSelectedItem(); // Ambil kategori dari ComboBox
        if (selectedCategory == null || selectedCategory.equals("Pilih Kategori")) {
            JOptionPane.showMessageDialog(this, 
                "Silakan pilih kategori terlebih dahulu!", 
                "Peringatan", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Periksa jika input kosong setelah trim
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Masukkan nama barang untuk pencarian!", 
                "Peringatan", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Ambil model tabel dan kosongkan sebelum pencarian
        DefaultTableModel model = (DefaultTableModel) tblNamaBarang.getModel();
        model.setRowCount(0);

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Membuat koneksi ke database
            ConnectionManager conMan = new ConnectionManager();
            con = conMan.logOn();

            // Query untuk mencari nama barang berdasarkan kategori
            String sql = "SELECT namaBarang FROM barang WHERE jenis = ? AND namaBarang LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, selectedCategory); // Set kategori dari ComboBox
            ps.setString(2, "%" + searchQuery + "%"); // Mencari nama barang yang mengandung teks pencarian

            rs = ps.executeQuery();

            // Menambahkan hasil pencarian ke tabel
            while (rs.next()) {
                String namaBarang = rs.getString("namaBarang");
                model.addRow(new Object[]{namaBarang}); // Tambahkan nama barang ke tabel
            }

            // Jika tidak ada hasil, tampilkan pesan informasi
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, 
                    "Tidak ada barang yang ditemukan untuk kategori \"" + selectedCategory + "\"!", 
                    "Informasi", 
                    JOptionPane.INFORMATION_MESSAGE);
                isMessageShown = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, 
                "Terjadi kesalahan saat mencari data.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                }
            }
        }        
    }//GEN-LAST:event_txtNamaBarangKeyPressed

    
    
    private boolean isTransactionSaved = true;
    private void btnNamaCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamaCustomerActionPerformed
    
    String customerName = txtNamaCustomer.getText().trim();

    // Periksa apakah transaksi sebelumnya sudah disimpan
    if (!isTransactionSaved) {
        JOptionPane.showMessageDialog(this, 
            "Transaksi sebelumnya belum disimpan! Harap simpan transaksi sebelum menambahkan pelanggan baru.", 
            "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Periksa apakah nama customer tidak kosong
    if (!customerName.isEmpty()) {
        // Dapatkan teks lama dan tambahkan teks baru
        String existingText = pnlNamaCustomer.getText();
        String newText = existingText + (existingText.isEmpty() ? "" : "\n") + customerName;

        // Tampilkan teks baru di JTextPane
        pnlNamaCustomer.setText(newText);

        // Reset input
        txtNamaCustomer.setText("");

        // Tandai bahwa transaksi belum disimpan dan nonaktifkan tombol "Add"
        isTransactionSaved = false;
        btnNamaCustomer.setEnabled(false);
    } else {
        JOptionPane.showMessageDialog(this, 
            "Nama customer tidak boleh kosong!", 
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNamaCustomerActionPerformed

    
    private void txtNamaCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNamaCustomerMouseClicked
        // TODO add your handling code here:
        txtNamaCustomer.setText(" ");
    }//GEN-LAST:event_txtNamaCustomerMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKategoriActionPerformed
    DefaultTableModel model = (DefaultTableModel) tblNamaBarang.getModel();
    model.setRowCount(0);

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        ConnectionManager conMan = new ConnectionManager();
        con = conMan.logOn();

        // Query hanya untuk mengambil nama barang berdasarkan jenis
        String sql = "SELECT namaBarang FROM barang WHERE jenis = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, (String) cbKategori.getSelectedItem()); 

        rs = ps.executeQuery();

        // Isi tabel hanya dengan nama barang
        while (rs.next()) {
            String namaBarang = rs.getString("namaBarang");
            model.addRow(new Object[]{namaBarang}); // Tambahkan hanya nama barang
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
    }//GEN-LAST:event_cbKategoriActionPerformed

    private void btnNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamaBarangActionPerformed
      int i = tblNamaBarang.getSelectedRow();
      int totalTransaksi = 0;
      
            if (i == -1) {
                JOptionPane.showMessageDialog(btnUpdate, 
                        "Harap pilih salah satu data", "Warning", 
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

    // Mengambil data dari tabel awal
    String namaBarang = tblNamaBarang.getModel().getValueAt(i, 0).toString();  // Kolom ke-1: Nama barang
    txtNamaBarang.setText(namaBarang); // Menampilkan nama barang di JTextField
   
    int kuantitas;

    // Validasi input kuantitas dari JTextField
    try {
        kuantitas = Integer.parseInt(txtJumlahBarang.getText());  // Mengambil kuantitas dari JTextField
        if (kuantitas <= 0) {
            JOptionPane.showMessageDialog(null, "Masukkan kuantitas lebih dari 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Masukkan kuantitas yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Menambahkan data ke tabel baru
    DefaultTableModel modelBaru = (DefaultTableModel) tabelTransaksi.getModel();
    clearEmptyRows(modelBaru); // Hapus baris kosong sebelum menambahkan data baru
    
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        // Membuat koneksi ke database
        ConnectionManager conMan = new ConnectionManager();
        con = conMan.logOn();
        // Query untuk mengambil id dan harga berdasarkan nama barang
        String sql = "SELECT id, harga FROM barang WHERE namaBarang = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, namaBarang);  // namaBarang adalah nama barang yang dipilih dari tabel

        // Eksekusi query
        rs = ps.executeQuery();

        // Jika data ditemukan, tambahkan ke tabel transaksi
        if (rs.next()) {
            int id = rs.getInt("id");
            int harga = rs.getInt("harga");
            int totalHarga = harga * kuantitas;
         
            // Tambahkan data ke tabel transaksi, termasuk total harga
            modelBaru.addRow(new Object[]{id, namaBarang, harga, kuantitas, totalHarga});
            
            for (int row = 0; row < modelBaru.getRowCount(); row++) {
                    totalTransaksi += (int) modelBaru.getValueAt(row, 4); // Kolom ke-5 adalah total harga
                }
                
            
            txtTotalTransaksi.setText(String.valueOf(totalTransaksi));
            
            txtJumlahBarang.setText("");
            txtNamaBarang.setText("");
            
            /*printTabelTransaksi();
            totalTransaksi =+ totalHarga;*/
            
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Data tidak ditemukan untuk nama barang: " + namaBarang, 
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, 
                "Terjadi kesalahan saat mengambil data dari database.", 
                "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnNamaBarangActionPerformed

    private void clearEmptyRows(DefaultTableModel model) {
        for (int row = model.getRowCount() - 1; row >= 0; row--) {
            boolean isEmpty = true;
            for (int col = 0; col < model.getColumnCount(); col++) {
                if (model.getValueAt(row, col) != null && !model.getValueAt(row, col).toString().isEmpty()) {
                    isEmpty = false;
                    break;
                }
            }
            if (isEmpty) {
                model.removeRow(row);
            }
        }
    }
   /*private void printTabelTransaksi() {
        DefaultTableModel modelBaru = (DefaultTableModel) tabelTransaksi.getModel();

        System.out.println("Data dalam Tabel Transaksi:");
        for (int row = 0; row < modelBaru.getRowCount(); row++) {
            for (int col = 0; col < modelBaru.getColumnCount(); col++) {
                System.out.print(modelBaru.getValueAt(row, col) + "\t");
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak kolom
        }
        System.out.println("-------------------------------------");
    }*/
   
    private void tblNamaBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNamaBarangMouseClicked
        // TODO add your handling code here:
         int i = tblNamaBarang.getSelectedRow();

        TableModel model = tblNamaBarang.getModel();
        String idBarang = model.getValueAt(i, 0).toString();      
        String namaBarang = model.getValueAt(i, 1).toString();    
        String hargaBarang = model.getValueAt(i, 2).toString(); 
        
        txtNamaBarang.setText(namaBarang);     
       
    }//GEN-LAST:event_tblNamaBarangMouseClicked

    private void labelTotalTransaksiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelTotalTransaksiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_labelTotalTransaksiAncestorAdded

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void txtTotalTransaksiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtTotalTransaksiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalTransaksiAncestorAdded

    private void btnSaveTransactionActionPerformed(java.awt.event.ActionEvent evt) {
    // Simpan transaksi ke database atau lakukan proses penyimpanan lainnya di sini
    
    // Tandai bahwa transaksi telah disimpan
    isTransactionSaved = true;

    JOptionPane.showMessageDialog(this, "Transaksi berhasil disimpan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewTransaksiKasir().setVisible(true);
                
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNamaBarang;
    private javax.swing.JButton btnNamaCustomer;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelNamaCustomer;
    private javax.swing.JLabel labelTotalTransaksi;
    private javax.swing.JTextPane pnlNamaCustomer;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTable tblNamaBarang;
    private javax.swing.JTextField txtJumlahBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtNamaCustomer;
    private javax.swing.JTextPane txtTotalTransaksi;
    // End of variables declaration//GEN-END:variables
}
