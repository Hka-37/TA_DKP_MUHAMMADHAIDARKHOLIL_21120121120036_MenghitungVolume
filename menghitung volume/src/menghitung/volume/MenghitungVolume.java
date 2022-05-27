/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung.volume;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MenghitungVolume {

    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton keluar;
    private javax.swing.JLabel ket;
    private javax.swing.JLabel lb_volume;
    private javax.swing.JButton reset;
    private javax.swing.JTextField txt_lebar;
    private javax.swing.JTextField txt_panjang;
    private javax.swing.JTextField txt_tinggi;
    
    public static void main(String[] args) {
        volume laund = new volume();
        laund.setVisible(true);
        
    }
    public MenghitungVolume(){
        Scanner sc = new Scanner(System.in);
        int hasil = 0;
        float panjang = Integer.parseInt(txt_panjang.getText());
        float lebar = Integer.parseInt(txt_lebar.getText());
        float tinggi = Integer.parseInt(txt_tinggi.getText());
        
        if(panjang>0 && lebar>0 && tinggi>0) 
        {
            float volume = panjang * lebar * tinggi;
            hasil = (int) volume;
        }
        else
        {
            hasil = hasil+0;
        }
        
        lb_volume.setText(String.valueOf(hasil));
        
        String z = "";
        if (hasil<= 27.0)
        {
            z = "ruang termasuk kecil";
        }
        else if (hasil >= 27.0 && hasil <= 125.0)
        {
            z = "ruang termasuk standar";
        }
        else
        {
            z = "ruang termasuk besar";
        }
        ket.setText(z);
    }
    public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
                resetActionPerformed(evt);
                keluarActionPerformed(evt);
            }
    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {
        int hasil = 0;
        float panjang = Integer.parseInt(txt_panjang.getText());
        float lebar = Integer.parseInt(txt_lebar.getText());
        float tinggi = Integer.parseInt(txt_tinggi.getText());
        
        if(panjang>0 && lebar>0 && tinggi>0) 
        {
            float volume = panjang * lebar * tinggi;
            hasil = (int) volume;
        }
        else
        {
            hasil = hasil+0;
        }
        
        lb_volume.setText(String.valueOf(hasil));
        
        String z = "";
        if (hasil<= 27.0)
        {
            z = "ruang termasuk kecil";
        }
        else if (hasil >= 27.0 && hasil <= 125.0)
        {
            z = "ruang termasuk standar";
        }
        else
        {
            z = "ruang termasuk besar";
        }
        ket.setText(z);
    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
        String x = "";
        String y = "0";
        txt_panjang.setText(x);
        txt_lebar.setText(x);
        txt_tinggi.setText(x);
        lb_volume.setText(y);
        ket.setText("...");
    }
    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {
        String tanya = "Apakah Anda Yakin Ingin Keluar...?";
        Component rootpane = null;
        boolean yakin = JOptionPane.showConfirmDialog(rootpane, tanya)
                == JOptionPane.YES_OPTION;
        if (yakin)
        {
        System.exit(0);
        }
    }
}
