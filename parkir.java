package ta_parkir;


import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class fParkir extends javax.swing.JFrame {
    DefaultTableModel masuk, keluar;
    koneksi konek = new koneksi();

    public fParkir(java.awt.Frame parent, boolean modal) {
//        super(parent, modal);
        konek.koneksi();
        initComponents();
        btnSimpan.setBackground(Color.green);
        btnReset.setBackground(Color.red);
        btnCari.setBackground(Color.yellow);
        btnKeluar.setBackground(Color.red);
        //btnCetak.setBackground(Color.green);
        btnClear.setBackground(Color.blue);
        tampil_masuk();
        tampil_keluar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbiaya = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbKeluar = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKNoPol = new javax.swing.JTextField();
        txtKNoTiket = new javax.swing.JTextField();
        txtKJenis = new javax.swing.JTextField();
        txtKTglMasuk = new javax.swing.JTextField();
        txtKDurasiJ = new javax.swing.JTextField();
        txtKBiaya = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtKBiayaAkhir = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoPol = new javax.swing.JTextField();
        cbJenis = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMasuk = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        lblbiaya.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Parkir");
        setResizable(false);

        tbKeluar.setBackground(new java.awt.Color(102, 102, 102));
        tbKeluar.setForeground(new java.awt.Color(255, 255, 255));
        tbKeluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "No. Pol", "Jenis", "Tgl Keluar", "Jam Keluar", "Biaya"
            }
        ));
        jScrollPane2.setViewportView(tbKeluar);

        jLabel4.setText("Nomor Polisi");

        jLabel5.setText("No. Tiket");

        jLabel6.setText("Jenis Kendaraan");

        jLabel7.setText("Tgl Masuk");

        jLabel10.setText("Durasi Jam");

        jLabel11.setText("Biaya :");

        txtKNoPol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKNoPolActionPerformed(evt);
            }
        });
        txtKNoPol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKNoPolKeyTyped(evt);
            }
        });

        txtKNoTiket.setEditable(false);
        txtKNoTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKNoTiketActionPerformed(evt);
            }
        });

        txtKJenis.setEditable(false);

        txtKTglMasuk.setEditable(false);
        txtKTglMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKTglMasukActionPerformed(evt);
            }
        });

        txtKDurasiJ.setEditable(false);

        txtKBiaya.setEditable(false);

        btnCari.setBackground(new java.awt.Color(153, 153, 153));
        btnCari.setText("Cari");
        btnCari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(153, 153, 153));
        btnKeluar.setText("Jam Keluar");
        btnKeluar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        txtKBiayaAkhir.setEditable(false);
        txtKBiayaAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKBiayaAkhirActionPerformed(evt);
            }
        });

        jLabel12.setText("Biaya Akhir");

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Delete");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentY(0.7F);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentY(0.7F);

        jButton1.setText("Keluar");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKNoPol)
                                    .addComponent(txtKNoTiket)
                                    .addComponent(txtKJenis, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtKTglMasuk))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(377, 377, 377))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtKBiayaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtKBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtKDurasiJ, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtKTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCari)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKNoPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtKBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKNoTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(txtKDurasiJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtKJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKBiayaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Jam Keluar", jPanel1);

        jLabel1.setText("Nomor Polisi");

        jLabel2.setText("Jenis Kendaraan");

        txtNoPol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoPolKeyTyped(evt);
            }
        });

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Jenis Kendaraan-", "Motor", "Mobil", "Truk" }));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        tbMasuk.setBackground(new java.awt.Color(102, 102, 102));
        tbMasuk.setForeground(new java.awt.Color(255, 255, 255));
        tbMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "No. Pol", "Jenis", "Tanggal Masuk", "Jam Masuk"
            }
        ));
        jScrollPane1.setViewportView(tbMasuk);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNoPol)
                    .addComponent(cbJenis, 0, 306, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Jam Masuk", jPanel2);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel3.setText("Sistem Parkir PT XYZ");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoPolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoPolKeyTyped
        // TODO add your handling code here:
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txtNoPolKeyTyped

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if (txtNoPol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor polisi belum diisi!");
        } else if (cbJenis.getSelectedItem().equals("-Pilih Jenis Kendaraan-")) {
            JOptionPane.showMessageDialog(this, "Jenis kendaraan belum dipilih");
        } else {
            String nopol, jenis, sql;
            nopol = txtNoPol.getText();
            jenis = cbJenis.getSelectedItem().toString();

            sql = "INSERT INTO tb_parkir(no_pol,jenis,tgl_masuk,jam_masuk)"
                    + "VALUES('"+nopol+"','"+jenis+"',CURDATE(),CURTIME())";
            try{
                konek.st = konek.conn.createStatement();
                konek.st.execute(sql);
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                return;
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        }
        resetAll();
        tampil_masuk();
        tampil_keluar();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtNoPol.setText("");
        cbJenis.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        if(txtKNoPol.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "No. Pol masih kosong!");
        else {
            DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            rupiah.setDecimalFormatSymbols(formatRp);

            String sql = "SELECT *, DATEDIFF(CURDATE(), tgl_masuk) durasi_hari, (TIME_FORMAT(CURTIME(),'%H')-TIME_FORMAT(jam_masuk, '%H')) durasi_jam "
                    + "FROM tb_parkir WHERE no_pol='"+txtKNoPol.getText()+"' AND biaya=0";
            try
            {
                konek.st = konek.conn.createStatement();
                konek.rs = konek.st.executeQuery(sql);
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(this, "Kesalahan query"+ex);
            }
            int size=0;
            try {
                while (konek.rs.next()){
                    size++;
                    txtKNoTiket.setText(konek.rs.getString("no_tiket").toString());
                    txtKJenis.setText(konek.rs.getString("jenis").toString());
                    txtKTglMasuk.setText(konek.rs.getString("tgl_masuk").toString());
                    //txtKJamMasuk.setText(konek.rs.getString("jam_masuk").toString());
                    int hari = Integer.parseInt(konek.rs.getString("durasi_hari"));
                    int jam = Integer.parseInt(konek.rs.getString("durasi_jam"));
                    int biaya, biaya_akhir;
                    if(txtKJenis.getText().equals("Truk")){
                        txtKBiaya.setText(rupiah.format(5000));
                        biaya = 5000;
                    } 
                    else if(txtKJenis.getText().equals("Mobil")){
                        txtKBiaya.setText(rupiah.format(4000));
                        biaya = 4000;
                    }else {
                        txtKBiaya.setText(rupiah.format(2000));
                        biaya = 2000;
                    }
                    if(hari>0){
                        //txtKDurasiH.setText(""+hari+" hari");
                        txtKDurasiJ.setText("-");
                        biaya_akhir = biaya + (50000*hari);
                        txtKBiayaAkhir.setText(rupiah.format(biaya_akhir));
                        lblbiaya.setText(""+biaya_akhir);
                    }
                    else{ 
                        //txtKDurasiH.setText("0 hari");
                        txtKDurasiJ.setText(konek.rs.getString("durasi_jam").toString()+" jam");
                        biaya_akhir = biaya + (1000*jam);
                        txtKBiayaAkhir.setText(rupiah.format(biaya_akhir));
                        lblbiaya.setText(""+biaya_akhir);
                    }

                 }
                if(size==0)
                {
                    JOptionPane.showMessageDialog(this,"Data tidak ditemukan");
                    return;
                }
                konek.rs.close();
                konek.st.close();
            } catch (SQLException ex){
            }
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtKNoPolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKNoPolKeyTyped
        // TODO add your handling code here:
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txtKNoPolKeyTyped

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        if(txtKNoPol.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Data kosong!");
        else {
            int biaya = Integer.parseInt(lblbiaya.getText());
            String sql, notiket;
            notiket = txtKNoTiket.getText();
            
            sql = "UPDATE tb_parkir SET tgl_keluar=CURDATE(), jam_keluar=CURTIME(), biaya='"+biaya+"' "
                    + "WHERE no_tiket='"+notiket+"'";
                try{
                    konek.st = konek.conn.createStatement();
                    konek.st.execute(sql);
                }
                catch (SQLException e){
                    JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                    return;
                }
                JOptionPane.showMessageDialog(this, "Data berhasil diperbaharui");
            
            resetAll();
            tampil_masuk();
            tampil_keluar();
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtKNoPol.setText("");
        //txtKNoTiket.setText("");
        txtKJenis.setText("");
        txtKTglMasuk.setText("");
//        txtKJamMasuk.setText("");
//        txtKDurasiH.setText("");
        txtKDurasiJ.setText("");
        txtKBiaya.setText("");
        txtKBiayaAkhir.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtKTglMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKTglMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKTglMasukActionPerformed

    private void txtKNoTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKNoTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKNoTiketActionPerformed

    private void txtKBiayaAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKBiayaAkhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKBiayaAkhirActionPerformed

    private void txtKNoPolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKNoPolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKNoPolActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void resetAll(){
        txtNoPol.setText("");
        cbJenis.setSelectedIndex(0);
        masuk = (DefaultTableModel) tbMasuk.getModel();
        keluar = (DefaultTableModel) tbKeluar.getModel();
        int rowCount1 = masuk.getRowCount();
        int rowCount2 = keluar.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount1 - 1; i >= 0; i--) {
            masuk.removeRow(i);
        }
        for (int i = rowCount2 - 1; i >= 0; i--) {
            keluar.removeRow(i);
        }
    }
    
    public void tampil_masuk(){
        masuk = (DefaultTableModel) tbMasuk.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT * FROM tb_parkir WHERE biaya=0 ORDER BY no_tiket DESC LIMIT 25";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_pol");
                String jenis = konek.rs.getString("jenis");
                String tgl_masuk = konek.rs.getString("tgl_masuk");
                String jam_masuk = konek.rs.getString("jam_masuk");
                
                String [] data = {no_tiket, no_pol, jenis, tgl_masuk, jam_masuk};
                masuk.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbMasuk.setModel(masuk);
    }
    
    public void tampil_keluar(){
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        keluar = (DefaultTableModel) tbKeluar.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT * FROM tb_parkir WHERE biaya <> 0 ORDER BY tgl_keluar DESC,jam_keluar DESC LIMIT 15";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_pol");
                String jenis = konek.rs.getString("jenis");
                String tgl_keluar = konek.rs.getString("tgl_keluar");
                String jam_keluar = konek.rs.getString("jam_keluar");
                String biaya = konek.rs.getString("biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                
                String [] data = {no_tiket, no_pol, jenis, tgl_keluar, jam_keluar, biaya_final};
                keluar.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbKeluar.setModel(keluar);
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
            java.util.logging.Logger.getLogger(fParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fParkir dialog = new fParkir(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblbiaya;
    private javax.swing.JTable tbKeluar;
    private javax.swing.JTable tbMasuk;
    private javax.swing.JTextField txtKBiaya;
    private javax.swing.JTextField txtKBiayaAkhir;
    private javax.swing.JTextField txtKDurasiJ;
    private javax.swing.JTextField txtKJenis;
    private javax.swing.JTextField txtKNoPol;
    private javax.swing.JTextField txtKNoTiket;
    private javax.swing.JTextField txtKTglMasuk;
    private javax.swing.JTextField txtNoPol;
    // End of variables declaration//GEN-END:variables
}