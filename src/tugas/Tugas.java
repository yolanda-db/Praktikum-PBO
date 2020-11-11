/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author HP
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GUI g = new GUI();
    }
    
}

class GUI extends JFrame{
    final JTextField fnama = new JTextField(10);
    final JTextField fkode = new JTextField(10);
 
    JLabel lkode = new JLabel(" Kode Obat ");
 
    JLabel lnama = new JLabel(" Nama Obat ");
 
    JLabel ljenisobat = new JLabel(" Jenis Obat ");
    JRadioButton rbSirup = new JRadioButton(" Sirup ");
    JRadioButton rbTablet = new JRadioButton(" Tablet ");
    JRadioButton rbKapsul = new JRadioButton(" Kapsul ");
    JRadioButton rbKaplet = new JRadioButton(" Kaplet ");
    JRadioButton rbPil = new JRadioButton(" Pil ");
    JRadioButton rbCairan = new JRadioButton(" Cairan Tetes ");
 
    JLabel lsatuan = new JLabel(" Satuan Obat ");
    String[] namaSatuan =
    {"Botol","Tube","Pcs"};
    JComboBox cmbSatuan = new JComboBox(namaSatuan);
 
    JButton btnSave = new JButton(" Simpan ");
    
    public GUI(){
        
    setTitle(" DATA OBAT ");
        setSize(330,420);
        setDefaultCloseOperation(3);
        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8,6));
        mainContainer.setBackground(Color.WHITE);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(5,5,5,5, Color.BLACK));
 
        ButtonGroup group = new ButtonGroup();
        group.add(rbSirup);
        group.add(rbTablet);
        group.add(rbKapsul);
        group.add(rbKaplet);
        group.add(rbPil);
        group.add(rbCairan);
 
        setLayout(null);
        add(lkode);
        add(fkode);
        add(lnama);
        add(fnama);
        add(ljenisobat);
        add(rbSirup);
        add(rbTablet);
        add(rbKapsul);
        add(rbKaplet);
        add(rbPil);
        add(rbCairan);
        add(lsatuan);
        add(cmbSatuan);
        add(btnSave);
 
        // setBounds(m,n,o,p)
        // m = posisi x; n = posisi n
        // o = panjang komponen; p = tinggi komponen
        lkode.setBounds(10,10,110,20);
        fkode.setBounds(130,40,150,20);
        lnama.setBounds(10,40,120,20);
        fnama.setBounds(130,10,150,20);
        ljenisobat.setBounds(10,70,120,20);
        rbSirup.setBounds(130,70,110,20);
        rbTablet.setBounds(130,90,110,20);
        rbKapsul.setBounds(130,110,110,20);
        rbKaplet.setBounds(130,130,110,20);
        rbPil.setBounds(130,150,110,20);
        rbCairan.setBounds(130,170,110,20);
        lsatuan.setBounds(10,200,150,20);
        cmbSatuan.setBounds(130,200,150,20);
        btnSave.setBounds(100,300,120,20);
        setVisible(true);
        
}
}
