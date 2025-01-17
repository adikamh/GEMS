package org.itenas.oop.gevam.gems.tubes.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
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
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    ConnectionManager conMan = new ConnectionManager();
    
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
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();
        btnRiwayat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 249, 242));
        jPanel1.setForeground(new java.awt.Color(247, 249, 242));
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
        jScrollPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

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
        tabelTransaksi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelTransaksiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTransaksi);

        btnNamaCustomer.setBackground(new java.awt.Color(153, 255, 204));
        btnNamaCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNamaCustomer.setForeground(new java.awt.Color(0, 0, 0));
        btnNamaCustomer.setText("ADD");
        btnNamaCustomer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
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

        btnNamaBarang.setBackground(new java.awt.Color(102, 255, 204));
        btnNamaBarang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNamaBarang.setForeground(new java.awt.Color(0, 0, 0));
        btnNamaBarang.setText("ADD");
        btnNamaBarang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamaBarangActionPerformed(evt);
            }
        });

        txtTotalTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalTransaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalTransaksi.setForeground(new java.awt.Color(255, 0, 51));
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
        pnlNamaCustomer.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
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

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 102, 102));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("CLEAR");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 153, 153));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setText("SAVE");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Masukan jumlah barang : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TRANSAKSI");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pilih kategori barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CETAK STRUK");

        btnCetak.setBackground(new java.awt.Color(0, 204, 204));
        btnCetak.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCetak.setForeground(new java.awt.Color(0, 0, 0));
        btnCetak.setText("CETAK");
        btnCetak.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnRiwayat.setBackground(new java.awt.Color(247, 249, 242));
        btnRiwayat.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRiwayat.setForeground(new java.awt.Color(0, 0, 0));
        btnRiwayat.setText("RIWAYAT TRANSAKSI");
        btnRiwayat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(77, 161, 169));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(77, 161, 169));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(37, 37, 37))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SIMPAN TRANSAKSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelTotalTransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(829, 829, 829)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(396, 396, 396)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(btnNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(61, 61, 61))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(118, 118, 118)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(labelNamaCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTotalTransaksi)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCetak)
                            .addComponent(btnSave))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnDelete))
                        .addGap(22, 22, 22)
                        .addComponent(btnRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(38, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    DefaultTableModel dtm = (DefaultTableModel) tabelTransaksi.getModel();
    int selectedRow = tabelTransaksi.getSelectedRow();

    if (selectedRow != -1) {
        dtm.removeRow(selectedRow);
    } else {
        JOptionPane.showMessageDialog(null, "Silakan pilih baris yang ingin dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    DefaultTableModel modelTransaksi = (DefaultTableModel) tabelTransaksi.getModel();
    if (modelTransaksi.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "Tidak ada data transaksi untuk disimpan.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String customer = pnlNamaCustomer.getText().trim();
    String totalTransaksiStr = txtTotalTransaksi.getText().trim();

    if (customer.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama customer tidak boleh kosong.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (totalTransaksiStr.isEmpty() || !isNumeric(totalTransaksiStr)) {
        JOptionPane.showMessageDialog(null, "Total transaksi tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double totalTransaksi = Double.parseDouble(totalTransaksiStr);
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String tanggalTransaksi = sdf.format(date);

    Connection con = null;
    PreparedStatement psTransaksi = null, psDetail = null;
    ResultSet rs = null;

    try {
        ConnectionManager conMan = new ConnectionManager();
        con = conMan.logOn();
        con.setAutoCommit(false);

        String sqlTransaksi = "INSERT INTO transaksi (nama_customer, total_transaksi, tanggal) VALUES (?, ?, ?)";
        psTransaksi = con.prepareStatement(sqlTransaksi, Statement.RETURN_GENERATED_KEYS);
        psTransaksi.setString(1, customer);
        psTransaksi.setDouble(2, totalTransaksi);
        psTransaksi.setString(3, tanggalTransaksi);
        
         int affectedRows = psTransaksi.executeUpdate();

        if (affectedRows > 0) {
            rs = psTransaksi.getGeneratedKeys();
            int idTransaksi = 0;
            if (rs.next()) {
                idTransaksi = rs.getInt(1);
            }

            String sqlDetail = "INSERT INTO detail_transaksi (id_transaksi, id, jumlah, harga_peritem, totalHarga) VALUES (?, ?, ?, ?, ?)";
            psDetail = con.prepareStatement(sqlDetail);

            for (int row = 0; row < modelTransaksi.getRowCount(); row++) {
                int id = Integer.parseInt(modelTransaksi.getValueAt(row, 0).toString());
                int jumlah = Integer.parseInt(modelTransaksi.getValueAt(row, 3).toString());
                double hargaPerItem = Double.parseDouble(modelTransaksi.getValueAt(row, 2).toString());
                double totalHarga = Double.parseDouble(modelTransaksi.getValueAt(row, 4).toString());

                psDetail.setInt(1, idTransaksi);
                psDetail.setInt(2, id);
                psDetail.setInt(3, jumlah);
                psDetail.setDouble(4, hargaPerItem);
                psDetail.setDouble(5, totalHarga);
                psDetail.addBatch();
            }

            psDetail.executeBatch();
            con.commit();

            JOptionPane.showMessageDialog(null, "Data transaksi berhasil disimpan.", "Success", JOptionPane.INFORMATION_MESSAGE);
            modelTransaksi.setRowCount(0);
            txtNamaCustomer.setText("");
            txtTotalTransaksi.setText("");
        } else {
            con.rollback();
            JOptionPane.showMessageDialog(null, "Gagal menyimpan transaksi.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        try {
            if (con != null) {
                con.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan data.", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rs != null) rs.close();
            if (psDetail != null) psDetail.close();
            if (psTransaksi != null) psTransaksi.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

// Fungsi untuk memeriksa apakah sebuah string merupakan angka
private boolean isNumeric(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
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
      
            /*if (i == -1) {
                JOptionPane.showMessageDialog(btnUpdate, 
                        "Harap pilih salah satu data", "Warning", 
                        JOptionPane.WARNING_MESSAGE);
                return;
            }*/

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

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
                                         
    double totalTransaksi = 0;

    DefaultTableModel model = (DefaultTableModel) tabelTransaksi.getModel();
    if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "Tabel transaksi kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String namaCustomer = pnlNamaCustomer.getText();
    if (namaCustomer.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama customer belum diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        totalTransaksi = Double.parseDouble(txtTotalTransaksi.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Total transaksi tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    String outputPath = "src/main/resources/Struk_" + namaCustomer + ".pdf";

    try {
        
        File outputFile = new File(outputPath);
        outputFile.getParentFile().mkdirs();

        Document document = new Document(PageSize.A6);
        PdfWriter.getInstance(document, new FileOutputStream(outputFile));
        document.open();

        document.add(new Paragraph("       MINIMARKET GEVAM ", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16)));
        document.add(new Paragraph("  Jl. Green Garden No.45, Bandung", FontFactory.getFont(FontFactory.HELVETICA, 12)));
        document.add(new Paragraph("        Telp: 08996806320 ", FontFactory.getFont(FontFactory.HELVETICA, 13)));
        document.add(new Paragraph("---------------------------------------"));

        document.add(new Paragraph("Nama Customer: " + namaCustomer, FontFactory.getFont(FontFactory.HELVETICA, 12)));
        document.add(new Paragraph("---------------------------------------"));

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        for (int i = 0; i < model.getRowCount(); i++) {
            String idTransaksi = model.getValueAt(i, 0).toString();
            String namaBarang = model.getValueAt(i, 1).toString();
            double hargaPerItem = Double.parseDouble(model.getValueAt(i, 2).toString());
            int kuantitas = Integer.parseInt(model.getValueAt(i, 3).toString());
            double totalHarga = Double.parseDouble(model.getValueAt(i, 4).toString());

            document.add(new Paragraph("ID Transaksi: " + idTransaksi, FontFactory.getFont(FontFactory.HELVETICA, 12)));
            document.add(new Paragraph("Nama Barang: " + namaBarang, FontFactory.getFont(FontFactory.HELVETICA, 12)));
            document.add(new Paragraph("Harga: " + currencyFormat.format(hargaPerItem), FontFactory.getFont(FontFactory.HELVETICA, 12)));
            document.add(new Paragraph("Kuantitas: " + kuantitas, FontFactory.getFont(FontFactory.HELVETICA, 12)));
            document.add(new Paragraph("Total: " + currencyFormat.format(totalHarga), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            document.add(new Paragraph("---------------------------------------"));
        }

        document.add(new Paragraph("Total Transaksi: " + currencyFormat.format(totalTransaksi), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
        document.add(new Paragraph("       Terima Kasih atas Kunjungan Anda!", FontFactory.getFont(FontFactory.HELVETICA, 12)));
        document.add(new Paragraph("     Barang yang sudah dibeli tidak bisa dikembalikan.", FontFactory.getFont(FontFactory.HELVETICA, 10)));

        document.close();

        JOptionPane.showMessageDialog(null, "Struk berhasil dicetak ke: " + outputPath, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mencetak struk.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnCetakActionPerformed

    private void jScrollPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1AncestorAdded

    private void tabelTransaksiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelTransaksiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelTransaksiAncestorAdded

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void btnRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatActionPerformed
        // TODO add your handling code here:
        new viewRiwayatTransaksi().setVisible(true);
    }//GEN-LAST:event_btnRiwayatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new viewLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tabelTransaksi.getModel();
    dtm.setRowCount(0);

    // Clear text fields
    txtTotalTransaksi.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNamaBarang;
    private javax.swing.JButton btnNamaCustomer;
    private javax.swing.JButton btnRiwayat;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
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
