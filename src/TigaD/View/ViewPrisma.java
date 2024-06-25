package TigaD.View;

import Main.View.HalamanMenu3D;
import TigaD.Prisma;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewPrisma extends JFrame{

    //Membuat JLabel
    JLabel Header = new JLabel("MENU HITUNG");
    JLabel SubHeader1 = new JLabel("PRISMA");
    JLabel SubHeader2 = new JLabel("Silahkan masukkan nilai");
    JLabel labelAlas = new JLabel("Alas (Alas Segitiga) (cm)");
    JLabel labelTinggi = new JLabel("Tinggi (Alas Segitiga) (cm)");
    JLabel labelTinggiPrisma = new JLabel("Tinggi Prisma (cm)");
    JLabel labelHasil = new JLabel("Hasil Hitung =");
    JLabel labelCm3 = new JLabel("cm^3");
    JLabel labelHasilHitung = new JLabel();
    
    //Membuat JTextField
    JTextField inputAlas = new JTextField();
    JTextField inputTinggi = new JTextField();
    JTextField inputTinggiPrisma = new JTextField();
    
    //Membuat JButton
    JButton tombolHitung = new JButton("Hitung");
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolReset = new JButton("Reset");
    
    public ViewPrisma(){
    
        setVisible(true);
        setTitle("Halaman Menu Prisma");
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
        SubHeader1.setBounds(440,105,400,35);
        add(SubHeader2);
        SubHeader2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        SubHeader2.setBounds(425,165,400,35);
        add(labelAlas);
        labelAlas.setBounds(350,210,300,25);
        add(labelTinggi);
        labelTinggi.setBounds(350,280,300,25);
        add(labelTinggiPrisma);
        labelTinggiPrisma.setBounds(350,350,300,25);
        add(labelHasil);
        labelHasil.setBounds(350,470,100,25);
        add(labelCm3);
        labelCm3.setBounds(550,470,50,25);
        add(labelHasilHitung);
        labelHasilHitung.setBounds(470,470,100,25);
        labelHasilHitung.setForeground(new Color(0,128,0));
        
        //Menampilkan JTextField pada Frame
        add(inputAlas);
        inputAlas.setBounds(350,240,300,30);
        add(inputTinggi);
        inputTinggi.setBounds(350,310,300,30);
        add(inputTinggiPrisma);
        inputTinggiPrisma.setBounds(350,380,300,30);
        
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
                    double alas = Double.parseDouble(inputAlas.getText());
                    double tinggi = Double.parseDouble(inputTinggi.getText());
                    double tinggiPrisma = Double.parseDouble(inputTinggiPrisma.getText());
                    Prisma prisma = new Prisma(alas, tinggi, tinggiPrisma);
                    double luas = prisma.hitungVolume();
                    labelHasilHitung.setText(String.valueOf(luas));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Input tidak valid! Masukkan angka yang benar.");
                }
            }
        });
        
        tombolReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                inputAlas.setText("");
                inputTinggi.setText("");
                inputTinggiPrisma.setText("");
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
