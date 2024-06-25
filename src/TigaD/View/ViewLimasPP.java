package TigaD.View;

import Main.View.HalamanMenu3D;
import TigaD.LimasPP;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewLimasPP extends JFrame {
    
    //Membuat JLabel
    JLabel Header = new JLabel("MENU HITUNG");
    JLabel SubHeader1 = new JLabel("LIMAS PERSEGI PANJANG");
    JLabel SubHeader2 = new JLabel("Silahkan masukkan nilai");
    JLabel labelPanjang = new JLabel("Panjang (Alas) (cm)");
    JLabel labelLebar = new JLabel("Lebar (Alas) (cm)");
    JLabel labelTinggiLimasPP = new JLabel("Tinggi Limas Persegi Panjang (cm)");
    JLabel labelHasil = new JLabel("Hasil Hitung =");
    JLabel labelCm3 = new JLabel("cm^3");
    JLabel labelHasilHitung = new JLabel();
    
    //Membuat JTextField
    JTextField inputPanjang = new JTextField();
    JTextField inputLebar = new JTextField();
    JTextField inputTinggiLimasPP = new JTextField();
    
    //Membuat JButton
    JButton tombolHitung = new JButton("Hitung");
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolReset = new JButton("Reset");
    
    public ViewLimasPP(){
        
        setVisible(true);
        setTitle("Halaman Menu Limas Persegi Panjang");
        setSize(1000, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255, 215, 0));
        
        //Menampilkan JLabel pada Frame
        add(Header);
        Header.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Header.setBounds(400,65,330,35);
        add(SubHeader1);
        SubHeader1.setFont(new Font("Times New Roman", Font.BOLD, 32));
        SubHeader1.setBounds(295,105,430,35);
        add(SubHeader2);
        SubHeader2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        SubHeader2.setBounds(425,165,400,35);
        add(labelPanjang);
        labelPanjang.setBounds(350,210,300,25);
        add(labelLebar);
        labelLebar.setBounds(350,280,300,25);
        add(labelTinggiLimasPP);
        labelTinggiLimasPP.setBounds(350,350,300,25);
        add(labelHasil);
        labelHasil.setBounds(350,470,100,25);
        add(labelCm3);
        labelCm3.setBounds(550,470,50,25);
        add(labelHasilHitung);
        labelHasilHitung.setBounds(470,470,100,25);
        labelHasilHitung.setForeground(new Color(0,128,0));
        
        //Menampilkan JTextField pada Frame
        add(inputPanjang);
        inputPanjang.setBounds(350,240,300,30);
        add(inputLebar);
        inputLebar.setBounds(350,310,300,30);
        add(inputTinggiLimasPP);
        inputTinggiLimasPP.setBounds(350,380,300,30);
        
        //Menampilkan JButton pada Frame
        add(tombolHitung);
        tombolHitung.setForeground(new Color(255, 255, 255));
        tombolHitung.setBackground(new Color(50,205,50));
        tombolHitung.setBounds(450,430,100,30);
        add(tombolReset);
        tombolReset.setBounds(350,520,140,30);
        tombolReset.setBackground(new Color(0,0,255));
        tombolReset.setForeground(new Color(255, 255, 255));
        add(tombolKembali);
        tombolKembali.setBounds(510,520,140,30);
        tombolKembali.setBackground(Color.red);
        tombolKembali.setForeground(Color.white);
        
        //ActionListener ketika tombol di klik
        tombolHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double panjang = Double.parseDouble(inputPanjang.getText());
                    double lebar = Double.parseDouble(inputLebar.getText());
                    double tinggiLimasPP = Double.parseDouble(inputTinggiLimasPP.getText());
                    LimasPP limasPP = new LimasPP(panjang, lebar, tinggiLimasPP);
                    double luas = limasPP.hitungVolume();
                    labelHasilHitung.setText(String.valueOf(luas));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Input tidak valid! Masukkan angka yang benar.");
                }
            }
        });
        
        tombolReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                inputPanjang.setText("");
                inputLebar.setText("");
                inputTinggiLimasPP.setText("");
                labelHasilHitung.setText("");
            }
        });
        
        tombolKembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new HalamanMenu3D();
            }
        });  
    }
}
