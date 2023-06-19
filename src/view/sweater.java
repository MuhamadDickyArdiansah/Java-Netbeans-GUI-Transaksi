/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerSweater;
import controller.ControllerTransaksi;
import controller.ControllerUser;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;
import model.Sweater;
import model.Sweater;
import model.Transaksi;
import model.User;

/**
 *
 * @author Lenovo
 */
public class sweater extends javax.swing.JFrame {

    /**
     * Creates new form swater1
     */
    private String username;
    private double saldo;

    public sweater() {
    }
    
    public sweater(String username, double saldo) {
        initComponents();
        this.username = username;
        this.saldo = saldo;
        jLabel3.setText(username);
        loadTable();
        waktu();
        
        txtuangpembelian.setText(String.valueOf(saldo));
        jButton3.setBackground(new Color(242,244,243));
        
        JButton [] btns = {jButton1,jButton2, jButton4, jButton5, jButton5, jButton6};
        for (JButton btn: btns){
            btn.setBackground(Color.white);
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(242,244,243));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(Color.white);
                }
                
            });
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

        navbar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtkodebarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdiskon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtuangpembelian = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        txtkembalian = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnbeli = new javax.swing.JButton();
        txtwaktu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        spinjumlah = new javax.swing.JSpinner();
        btncektotal = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jersey = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        sweater = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        Merchandise = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        riwayatTransaksi = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        Logout = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        navbar.setBackground(new java.awt.Color(255, 255, 255));
        navbar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        navbar.setPreferredSize(new java.awt.Dimension(1196, 50));
        navbar.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        navbar.add(jPanel3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sweater");
        navbar.add(jLabel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/user32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        navbar.add(jPanel2);

        getContentPane().add(navbar, java.awt.BorderLayout.PAGE_START);

        content.setPreferredSize(new java.awt.Dimension(1196, 550));
        content.setRequestFocusEnabled(false);
        content.setLayout(new javax.swing.BoxLayout(content, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(598, 525));

        jLabel7.setText("Total Pembelian");

        jLabel2.setText("Nama");

        jLabel8.setText("Saldo Anda");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txtuangpembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuangpembelianActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga");

        jLabel9.setText("Kembalian");

        txtkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembalianActionPerformed(evt);
            }
        });

        jLabel5.setText("Tanggal");

        btnbeli.setBackground(new java.awt.Color(3, 70, 148));
        btnbeli.setForeground(new java.awt.Color(255, 255, 255));
        btnbeli.setText("Beli");
        btnbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeliActionPerformed(evt);
            }
        });

        jLabel6.setText("Jumlah Pembelian");

        btncektotal.setBackground(new java.awt.Color(3, 70, 148));
        btncektotal.setForeground(new java.awt.Color(255, 255, 255));
        btncektotal.setText("cek Total");
        btncektotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncektotalActionPerformed(evt);
            }
        });

        jLabel10.setText("Kode Barang");

        jLabel11.setText("Diskon");

        btnclear.setBackground(new java.awt.Color(3, 70, 148));
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(431, 568, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinjumlah)
                            .addComponent(txtdiskon)
                            .addComponent(txtnama)
                            .addComponent(txtharga)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7)
                                        .addComponent(txttotal)
                                        .addComponent(btncektotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtkodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(txtuangpembelian)
                            .addComponent(txtkembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(btnbeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnclear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(216, 216, 216))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34))
                            .addComponent(txtuangpembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbeli)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncektotal)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(9, 9, 9)
                .addComponent(txtdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        content.add(jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(598, 525));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "kode_barang", "nama", "harga"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Daftar Barang");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        content.add(jPanel4);

        getContentPane().add(content, java.awt.BorderLayout.CENTER);

        footer.setBackground(new java.awt.Color(255, 255, 255));
        footer.setPreferredSize(new java.awt.Dimension(1196, 50));
        footer.setLayout(new java.awt.GridLayout(1, 0));

        jersey.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/jersey.png"))); // NOI18N
        jButton2.setText("Jersey");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jerseyLayout = new javax.swing.GroupLayout(jersey);
        jersey.setLayout(jerseyLayout);
        jerseyLayout.setHorizontalGroup(
            jerseyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        );
        jerseyLayout.setVerticalGroup(
            jerseyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        footer.add(jersey);

        sweater.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/sweatshirt.png"))); // NOI18N
        jButton3.setText("Sweater");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setMaximumSize(new java.awt.Dimension(300, 70));
        jButton3.setPreferredSize(new java.awt.Dimension(248, 50));

        javax.swing.GroupLayout sweaterLayout = new javax.swing.GroupLayout(sweater);
        sweater.setLayout(sweaterLayout);
        sweaterLayout.setHorizontalGroup(
            sweaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        );
        sweaterLayout.setVerticalGroup(
            sweaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        footer.add(sweater);

        Merchandise.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/branding.png"))); // NOI18N
        jButton4.setText("Merchandise");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MerchandiseLayout = new javax.swing.GroupLayout(Merchandise);
        Merchandise.setLayout(MerchandiseLayout);
        MerchandiseLayout.setHorizontalGroup(
            MerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        );
        MerchandiseLayout.setVerticalGroup(
            MerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        footer.add(Merchandise);

        riwayatTransaksi.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/file32.png"))); // NOI18N
        jButton5.setText("Riwayat Transaksi");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout riwayatTransaksiLayout = new javax.swing.GroupLayout(riwayatTransaksi);
        riwayatTransaksi.setLayout(riwayatTransaksiLayout);
        riwayatTransaksiLayout.setHorizontalGroup(
            riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        );
        riwayatTransaksiLayout.setVerticalGroup(
            riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        footer.add(riwayatTransaksi);

        Logout.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logout32.png"))); // NOI18N
        jButton6.setText("Logout");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        footer.add(Logout);

        getContentPane().add(footer, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    public void waktu(){
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        txtwaktu.setText(dateFormat.format(d));
    }
    
    private void loadTable() {
        List<Sweater> lsSweater = new ArrayList<Sweater>();
        ControllerSweater cmdSweater = new ControllerSweater();
        lsSweater = cmdSweater.getAllSweater();

        String[][] dtSweater = new String[lsSweater.size()][4];
        int i = 0;
        for (Sweater barang: lsSweater){
            dtSweater[i][0] = String.valueOf(i + 1);
            dtSweater[i][1] = barang.getKode_barang();
            dtSweater[i][2] = barang.getNama_barang();
            dtSweater[i][3] = ""+barang.getHarga();

            i++;
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            dtSweater,
            new String [] {
               "No", "Kode Sweater", "Nama", "Harga"
            }
        ));
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new homeUser(username, saldo).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtuangpembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuangpembelianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuangpembelianActionPerformed

    private void txtkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkembalianActionPerformed

    private void btnbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeliActionPerformed
        // TODO add your handling code here:
        Double uangPembelian = Double.parseDouble(txtuangpembelian.getText());
        Double hargaTotal = Double.parseDouble(txttotal.getText());
        

        Double bayar = uangPembelian - hargaTotal;

        if (bayar < 0) {
            JOptionPane.showMessageDialog(null, "Uang anda tidak cukup: " );
        } else {
            txtkembalian.setText(String.valueOf(formatRupiah.format(bayar)));
            String message = "Apakah Anda yakin ingin melakukan pembelian dengan total pembayaran sebesar " + bayar + " ?";
               int option = JOptionPane.showConfirmDialog(this, message, "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
               if (option == JOptionPane.YES_OPTION) {
                   // Proses pembelian
                    String waktu = txtwaktu.getText();
                    String kode_barang = txtkodebarang.getText();
                    String nama_barang = txtnama.getText();
                    int jumlah = (int) spinjumlah.getValue();
                    Double total_harga = Double.parseDouble(txttotal.getText());

                    ControllerTransaksi cmdTransaksi = new ControllerTransaksi();
                    Transaksi transaksi = new Transaksi(waktu, username, kode_barang, nama_barang, jumlah, total_harga);
                    
                    
                    int hasil = cmdTransaksi.simpanTransaksi(transaksi);
                    if (hasil > 0) {
                        JOptionPane.showMessageDialog(null, "Transaksi berhasil");
                        // Lakukan tindakan setelah registrasi berhasil
                        ControllerUser cmdUser = new ControllerUser();
                        User user = new User(); // Create a User object or retrieve it from somewhere
                        // Set the necessary user properties
                        user.setUsername(username); // Replace "username" with the actual username value

                        int success = cmdUser.kurangSaldo(user, total_harga);
                        

                        if (success > 0) {
                            // Saldo berhasil dikurangi
                            saldo -= total_harga; // Update nilai saldo setelah pengurangan
                            txtuangpembelian.setText(String.valueOf(saldo));
                        } else {
                            // Gagal mengurangi saldo
                            JOptionPane.showMessageDialog(null, "Gagal mengurangi saldo.");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Transaksi gagal");
                        // Lakukan tindakan setelah registrasi gagal
                    }
               } else {
                   // Pembelian dibatalkan
               }

        }
    }//GEN-LAST:event_btnbeliActionPerformed

    private void btncektotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncektotalActionPerformed
        // TODO add your handling code here:
        // Mengambil nilai dari JTextField dan JSpinner

        double banyak = Double.parseDouble(spinjumlah.getValue().toString());
        double harga = Double.parseDouble(txtharga.getText());

        if (banyak > 0){
            // Menghitung jumlah
            double jumlah = banyak * harga;
            double uangPembelian = Double.parseDouble(txtuangpembelian.getText());

            Sweater sweater = new Sweater();
            sweater.setKode_barang(txtkodebarang.getText());
            sweater.setHarga(jumlah);
            double diskon = sweater.hitungHargaFinal();
            
            txtdiskon.setText(String.valueOf(diskon));

            double totalBayar = jumlah - diskon;
            txttotal.setText(String.valueOf(totalBayar));

            
            double kembalian = uangPembelian - totalBayar;
            
            if (kembalian > 0) {
                txtkembalian.setText(String.valueOf(formatRupiah.format(kembalian)));

            } else {
                txtkembalian.setText("Saldo anda kurang");
            }

            // Membuat objek NumberFormat dengan format mata uang Indonesia (Rupiah)

            // Mengatur nilai ke JTextField dengan format rupiah

        } else {
            JOptionPane.showMessageDialog(this, "Jumlah Pembelian harus lebih dari 0.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btncektotalActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtkodebarang.setText(null);
        txtnama.setText(null);
        txtharga.setText(null);
        txtdiskon.setText(null);
        txttotal.setText(null);
        spinjumlah.setValue(0);
        txtkembalian.setText(null);
    }//GEN-LAST:event_btnclearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());

        String kode =jTable1.getValueAt(baris, 1).toString();
        txtkodebarang.setText(kode);
        String nama =jTable1.getValueAt(baris, 2).toString();
        txtnama.setText(nama);
        String harga =jTable1.getValueAt(baris, 3).toString();
        txtharga.setText(harga);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new riwayatTransaksi(username, saldo).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new jersey(username, saldo).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new merchandise(username, saldo).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String message = "Apakah anda yakin akan keluar?";
        int option = JOptionPane.showConfirmDialog(this, message, "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            new login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(sweater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sweater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sweater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sweater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sweater().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel Merchandise;
    private javax.swing.JButton btnbeli;
    private javax.swing.JButton btncektotal;
    private javax.swing.JButton btnclear;
    private javax.swing.JPanel content;
    private javax.swing.JPanel footer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jersey;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel riwayatTransaksi;
    private javax.swing.JSpinner spinjumlah;
    private javax.swing.JPanel sweater;
    private javax.swing.JTextField txtdiskon;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtkodebarang;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtuangpembelian;
    private javax.swing.JTextField txtwaktu;
    // End of variables declaration//GEN-END:variables
}
