package DuaD.View;

import DuaD.LayangLayang;
import Main.View.HalamanMenu2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewLayang extends JFrame{
    
    //Membuat JLabel
    JLabel Header = new JLabel("MENU HITUNG");
    JLabel SubHeader1 = new JLabel("LAYANG-LAYANG");
    JLabel SubHeader2 = new JLabel("Silahkan masukkan nilai");
    JLabel labelDiag1 = new JLabel("Diagonal 1 (cm)");
    JLabel labelDiag2 = new JLabel("Diagonal 2 (cm)");
    JLabel labelHasil = new JLabel("Hasil Hitung =");
    JLabel labelCm2 = new JLabel("cm^2");
    JLabel labelHasilHitung = new JLabel();
    
    //Membuat JTextField
    JTextField inputDiag1 = new JTextField();
    JTextField inputDiag2 = new JTextField();
    
    //Membuat JButton
    JButton tombolHitung = new JButton("Hitung");
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolReset = new JButton("Reset");
    
    public ViewLayang(){
        setVisible(true);
        setTitle("Halaman Menu Layang-Layang");
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
        SubHeader1.setBounds(358,105,400,35);
        add(SubHeader2);
        SubHeader2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        SubHeader2.setBounds(425,165,400,35);
        add(labelDiag1);
        labelDiag1.setBounds(350,220,300,25);
        add(labelDiag2);
        labelDiag2.setBounds(350,290,300,25);
        add(labelHasil);
        labelHasil.setBounds(350,420,100,25);
        add(labelCm2);
        labelCm2.setBounds(550,420,50,25);
        add(labelHasilHitung);
        labelHasilHitung.setBounds(470,420,100,25);
        labelHasilHitung.setForeground(new Color(0,128,0));
        
        //Menampilkan JTextField pada Frame
        add(inputDiag1);
        inputDiag1.setBounds(350,250,300,30);
        add(inputDiag2);
        inputDiag2.setBounds(350,320,300,30);
        
        //Menampilkan JButton pada Frame
        add(tombolHitung);
        tombolHitung.setForeground(new Color(255, 255, 255));
        tombolHitung.setBackground(new Color(50,205,50));
        tombolHitung.setBounds(450,370,100,30);
        add(tombolReset);
        tombolReset.setBounds(350,490,140,30);
        tombolReset.setBackground(new Color(0,0,255));
        tombolReset.setForeground(new Color(255, 255, 255));
        add(tombolKembali);
        tombolKembali.setBounds(510,490,140,30);
        tombolKembali.setBackground(Color.red);
        tombolKembali.setForeground(Color.white);
        
        //ActionListener ketika tombol di klik
        tombolHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double diagonal1 = Double.parseDouble(inputDiag1.getText());
                    double diagonal2 = Double.parseDouble(inputDiag2.getText());
                    LayangLayang layangLayang = new LayangLayang(diagonal1, diagonal2);
                    double luas = layangLayang.hitungLuas();
                    labelHasilHitung.setText(String.valueOf(luas));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Input tidak valid! Masukkan angka yang benar.");
                }
            }
        });
        
        tombolReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                inputDiag1.setText("");
                inputDiag2.setText("");
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