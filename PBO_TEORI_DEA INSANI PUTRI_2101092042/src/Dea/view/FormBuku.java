/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dea.view;
import Dea.controller.BukuController;

/**
 *
 * @author deain
 */
public class FormBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku
     */
    BukuController controller;
    public FormBuku() {
        initComponents();
        controller = new BukuController(this);
        controller.bersihForm();
        controller.tampilData();
    }
    public javax.swing.JTextField getTxtJudul(){
        return TxtJudul;
    }
    
    public javax.swing.JTextField getTxtKodeBuku(){
        return TxtKodeBuku;
    }
    public javax.swing.JTextField getTxtPenerbit(){
       return TxtPenerbit;
    }
    public javax.swing.JTextField getTxtPengarang(){
        return TxtPengarang;
    }
    public javax.swing.JTable getTblBuku(){
        return TblBuku;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtKodeBuku = new javax.swing.JTextField();
        TxtJudul = new javax.swing.JTextField();
        TxtPengarang = new javax.swing.JTextField();
        TxtPenerbit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblBuku = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Buku");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 90, 30);

        jLabel2.setText("Judul");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 60, 70, 30);

        jLabel3.setText("Pengarang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 100, 90, 30);

        jLabel4.setText("Penerbit");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 140, 70, 30);

        TxtKodeBuku.setText("jTextField1");
        getContentPane().add(TxtKodeBuku);
        TxtKodeBuku.setBounds(170, 20, 270, 40);

        TxtJudul.setText("jTextField2");
        getContentPane().add(TxtJudul);
        TxtJudul.setBounds(170, 60, 270, 40);

        TxtPengarang.setText("jTextField3");
        getContentPane().add(TxtPengarang);
        TxtPengarang.setBounds(170, 100, 270, 40);

        TxtPenerbit.setText("jTextField4");
        getContentPane().add(TxtPenerbit);
        TxtPenerbit.setBounds(170, 140, 270, 40);

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 230, 100, 40);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 230, 100, 40);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 230, 110, 40);

        jButton4.setText("Cancle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(450, 230, 100, 40);

        TblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul", "Pengarang", "Penerbit"
            }
        ));
        TblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblBuku);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 290, 590, 260);

        jButton5.setText("Exit");
        getContentPane().add(jButton5);
        jButton5.setBounds(590, 230, 90, 40);

        setSize(new java.awt.Dimension(765, 677));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controller.saveBuku();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton4ActionPerformed

    private void TblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblBukuMouseClicked
        // TODO add your handling code here:
        controller.getBuku();
    }//GEN-LAST:event_TblBukuMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        controller.updateBuku();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        controller.deleteBuku();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblBuku;
    private javax.swing.JTextField TxtJudul;
    private javax.swing.JTextField TxtKodeBuku;
    private javax.swing.JTextField TxtPenerbit;
    private javax.swing.JTextField TxtPengarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}