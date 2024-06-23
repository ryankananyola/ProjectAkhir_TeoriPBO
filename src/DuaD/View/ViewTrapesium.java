package DuaD.View;

import DuaD.Trapesium;
import Main.View.HalamanMenu2D;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewTrapesium  extends JFrame{
    
    //Membuat JLabel
    JLabel Header = new JLabel("MENU HITUNG");
    JLabel SubHeader1 = new JLabel("TRAPESIUM");
    JLabel SubHeader2 = new JLabel("Silahkan masukkan nilai");
    JLabel labelAlas1 = new JLabel("Alas 1 (cm)");
    JLabel labelAlas2 = new JLabel("Alas 2 (cm)");
    JLabel labelTinggiTrap = new JLabel("Tinggi Trapesium (cm)");
    JLabel labelHasil = new JLabel("Hasil Hitung =");
    JLabel labelCm2 = new JLabel("cm^2");
    JLabel labelHasilHitung = new JLabel();
    
    //Membuat JTextField
    JTextField inputAlas1 = new JTextField();
    JTextField inputAlas2 = new JTextField();
    JTextField inputTinggiTrap = new JTextField();
    
    //Membuat JButton
    JButton tombolHitung = new JButton("Hitung");
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolReset = new JButton("Reset");
    
    public ViewTrapesium(){
        
        setVisible(true);
        setTitle("Halaman Menu Trapesium");
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
        SubHeader1.setBounds(407,105,400,35);
        add(SubHeader2);
        SubHeader2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        SubHeader2.setBounds(425,165,400,35);
        add(labelAlas1);
        labelAlas1.setBounds(350,210,300,25);
        add(labelAlas2);
        labelAlas2.setBounds(350,280,300,25);
        add(labelTinggiTrap);
        labelTinggiTrap.setBounds(350,350,300,25);
        add(labelHasil);
        labelHasil.setBounds(350,470,100,25);
        add(labelCm2);
        labelCm2.setBounds(550,470,50,25);
        add(labelHasilHitung);
        labelHasilHitung.setBounds(470,470,100,25);
        labelHasilHitung.setForeground(new Color(0,128,0));
        
        //Menampilkan JTextField pada Frame
        add(inputAlas1);
        inputAlas1.setBounds(350,240,300,30);
        add(inputAlas2);
        inputAlas2.setBounds(350,310,300,30);
        add(inputTinggiTrap);
        inputTinggiTrap.setBounds(350,380,300,30);
        
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
                    double alas1 = Double.parseDouble(inputAlas1.getText());
                    double alas2 = Double.parseDouble(inputAlas2.getText());
                    double tinggiTrap = Double.parseDouble(inputTinggiTrap.getText());
                    Trapesium trapesium = new Trapesium(alas1, alas2, tinggiTrap);
                    double luas = trapesium.hitungLuas();
                    labelHasilHitung.setText(String.valueOf(luas));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Input tidak valid! Masukkan angka yang benar.");
                }
            }
        });
        
        tombolReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                inputAlas1.setText("");
                inputAlas2.setText("");
                inputTinggiTrap.setText("");
                labelHasilHitung.setText("");
            }
        });
        
        tombolKembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new HalamanMenu2D();
            }
        });  
    }
}
