/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testDebugging;
import javax.swing.*;
import java.text.DecimalFormat;

public class Debugging extends javax.swing.JFrame {
    Rumah rmh = new Rumah();
    DecimalFormat df = new DecimalFormat();
    
    public Debugging() {
        initComponents();
        cmblok.addItem("PILIH");
        cmblok.addItem("BLOK A");
        cmblok.addItem("BLOK B");
        cmblok.addItem("BLOK C");


                
        nonaktif();
        bhitung.setEnabled(false);
    }
    
    void aktif(){
        cmblok.setEnabled(true);
        cbjog.setEnabled(true);
        cbgy.setEnabled(true);
        cbsw.setEnabled(true);
        rbbtn.setEnabled(true);
        rbob.setEnabled(true);
        bhitung.setEnabled(true);
    }
    
    void bersih(){
        cmblok.setSelectedItem("pilih");
        cbjog.setSelected(false);
        cbsw.setSelected(false);
        cbgy.setSelected(false);
        bg1.clearSelection();
        thrg.setText("");
        tbtn.setText("");
        tother.setText("");
        ttot.setText("");
        
        aktif();
    }
    
    void nonaktif(){
    cmblok.setEnabled(false);
    cbjog.setEnabled(false);
    cbgy.setEnabled(false);
    cbsw.setEnabled(false);
    rbbtn.setEnabled(false);
    rbob.setEnabled(false);
    thrg.setEnabled(false);
    tother.setEnabled(false);
    tbtn.setEnabled(false);
    ttot.setEnabled(false);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DR = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmblok = new javax.swing.JComboBox<>();
        thrg = new javax.swing.JTextField();
        FR = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbjog = new javax.swing.JCheckBox();
        cbsw = new javax.swing.JCheckBox();
        cbgy = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CB = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        rbbtn = new javax.swing.JRadioButton();
        rbob = new javax.swing.JRadioButton();
        tbtn = new javax.swing.JTextField();
        tother = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ttot = new javax.swing.JTextField();
        bhitung = new javax.swing.JButton();
        bbersih = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("DEVELOPER PERUMAHAN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("PT. RUMAH MURAH MERIAH");

        jLabel3.setText("Data Rumah");

        jLabel4.setText("Lokasi");

        jLabel5.setText("Harga Dasar");

        cmblok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblokActionPerformed(evt);
            }
        });

        thrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thrgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DRLayout = new javax.swing.GroupLayout(DR);
        DR.setLayout(DRLayout);
        DRLayout.setHorizontalGroup(
            DRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DRLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(DRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(DRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thrg)
                            .addComponent(cmblok, 0, 191, Short.MAX_VALUE)))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DRLayout.setVerticalGroup(
            DRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addGroup(DRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmblok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(thrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel6.setText("Fasilitas Rumah");

        cbjog.setText("Jogging Track");
        cbjog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjogActionPerformed(evt);
            }
        });

        cbsw.setText("Swimming Pool");
        cbsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbswActionPerformed(evt);
            }
        });

        cbgy.setText("Gymnasium");
        cbgy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbgyActionPerformed(evt);
            }
        });

        jLabel7.setText("Rp. 100.000.00");

        jLabel8.setText("Rp. 200.000.00");

        jLabel9.setText("Rp. 300.000.00");

        javax.swing.GroupLayout FRLayout = new javax.swing.GroupLayout(FR);
        FR.setLayout(FRLayout);
        FRLayout.setHorizontalGroup(
            FRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(FRLayout.createSequentialGroup()
                            .addGroup(FRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbsw)
                                .addComponent(cbgy))
                            .addGap(73, 73, 73)
                            .addGroup(FRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)))
                        .addGroup(FRLayout.createSequentialGroup()
                            .addComponent(cbjog)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FRLayout.setVerticalGroup(
            FRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjog)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbsw))
                .addGap(12, 12, 12)
                .addGroup(FRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbgy))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel10.setText("Cara Pembayaran");

        bg1.add(rbbtn);
        rbbtn.setSelected(true);
        rbbtn.setText("BTN");
        rbbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbtnActionPerformed(evt);
            }
        });

        bg1.add(rbob);
        rbob.setText("Other Bank");
        rbob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbobActionPerformed(evt);
            }
        });

        tbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnActionPerformed(evt);
            }
        });

        tother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CBLayout = new javax.swing.GroupLayout(CB);
        CB.setLayout(CBLayout);
        CBLayout.setHorizontalGroup(
            CBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CBLayout.createSequentialGroup()
                        .addComponent(rbbtn)
                        .addGap(64, 64, 64)
                        .addComponent(tbtn))
                    .addGroup(CBLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CBLayout.createSequentialGroup()
                        .addComponent(rbob)
                        .addGap(27, 27, 27)
                        .addComponent(tother)))
                .addContainerGap())
        );
        CBLayout.setVerticalGroup(
            CBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbbtn)
                    .addComponent(tbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbob))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Total");

        ttot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttotActionPerformed(evt);
            }
        });

        bhitung.setText("HITUNG");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });

        bbersih.setText("BERSIH");
        bbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbersihActionPerformed(evt);
            }
        });

        bkeluar.setText("KELUAR");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ttot, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bhitung)
                                        .addGap(37, 37, 37)
                                        .addComponent(bbersih)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addComponent(bkeluar)))))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(DR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ttot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bhitung)
                    .addComponent(bbersih)
                    .addComponent(bkeluar))
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thrgActionPerformed
       
    }//GEN-LAST:event_thrgActionPerformed

    private void rbbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbtnActionPerformed
        rmh.setCara(rbbtn.getText());
//        rmh.setBiaya(10000);
////        rmh.setSeleksiCara();
        tbtn.setText(Double.toString(rmh.getBiaya()));
        tother.setText("");
        
    }//GEN-LAST:event_rbbtnActionPerformed

    private void tbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnActionPerformed

    private void totherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totherActionPerformed

    private void cmblokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblokActionPerformed
       rmh.setLokasi(cmblok.getSelectedItem().toString());
       rmh.setSeleksilok();
       thrg.setText(df.format(rmh.getHrg()));
    }//GEN-LAST:event_cmblokActionPerformed

    private void cbjogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjogActionPerformed
        if(cbjog.isSelected()){
            String j = cbjog.getText();
            rmh.setJog(j);
            rmh.getJog();
        }
        else{
            String j = "";
            rmh.setJog(j);
            rmh.getJog();
        }
    }//GEN-LAST:event_cbjogActionPerformed

    private void cbswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbswActionPerformed
        if(cbsw.isSelected()){
            String s = cbsw.getText();
            rmh.setSwim(s);
            rmh.getSwim();
        }
        else{
            String s = "";
            rmh.setSwim(s);
            rmh.getSwim();
            
        }
    }//GEN-LAST:event_cbswActionPerformed

    private void cbgyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbgyActionPerformed
        if(cbgy.isSelected()){
            String g = cbgy.getText();
            rmh.setGym(g);
            rmh.getGym();
        }
        else{
            String g = "";
            rmh.setGym(g);
            rmh.getGym();            
        }
    }//GEN-LAST:event_cbgyActionPerformed

    private void rbobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbobActionPerformed
        rmh.setCara(rbob.getText());
//        rmh.setBiaya(50000);
////        rmh.setSeleksiCara();
        tother.setText(Double.toString(rmh.getBiaya()));
        tbtn.setText("");
    }//GEN-LAST:event_rbobActionPerformed

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        thrg.setText(df.format(rmh.getHrg()));
        ttot.setText(df.format(rmh.getTotal()));
    }//GEN-LAST:event_bhitungActionPerformed

    private void bbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbersihActionPerformed
        bersih();
        aktif();
        bhitung.setEnabled(true);
    }//GEN-LAST:event_bbersihActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        int tutup;
        //membuat pop up panel option "yes & no" saat diklik dan jika "yes" akan tertutup dan "no" akan tetap berjalan 
        tutup = JOptionPane.showConfirmDialog(null,"Yakin tutup Program?", "konfirmasi", JOptionPane.YES_NO_OPTION);
        
        //membuat kondisi jika yes "dispose", jika no akan return ke program
        if(tutup==JOptionPane.YES_NO_OPTION){
            //close program
            dispose();    
        }
                
        else{
            //kembali ke program
            return;
        }    
    }//GEN-LAST:event_bkeluarActionPerformed

    private void ttotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttotActionPerformed

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
            java.util.logging.Logger.getLogger(Debugging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Debugging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Debugging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Debugging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Debugging().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CB;
    private javax.swing.JPanel DR;
    private javax.swing.JPanel FR;
    private javax.swing.JButton bbersih;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JButton bhitung;
    private javax.swing.JButton bkeluar;
    private javax.swing.JCheckBox cbgy;
    private javax.swing.JCheckBox cbjog;
    private javax.swing.JCheckBox cbsw;
    private javax.swing.JComboBox<String> cmblok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbbtn;
    private javax.swing.JRadioButton rbob;
    private javax.swing.JTextField tbtn;
    private javax.swing.JTextField thrg;
    private javax.swing.JTextField tother;
    private javax.swing.JTextField ttot;
    // End of variables declaration//GEN-END:variables
}
