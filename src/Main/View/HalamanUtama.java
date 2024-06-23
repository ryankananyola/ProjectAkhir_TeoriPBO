package Main.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class HalamanUtama extends JFrame {
    
    //Membuat JLabel
    JLabel Header = new JLabel("SELAMAT DATANG");
    JLabel SubHeader1 = new JLabel("PROGRAM HITUNG GEOMETRI");
    JLabel SubHeader2 = new JLabel("Silahkan Pilih Menu");
    
    //Membuat JButton
    JButton tombol2D = new JButton("Menghitung Luas Geometri 2D");
    JButton tombol3D = new JButton("Menghitung Volume Geometri 3D");
    JButton tombolKeluar = new JButton("Keluar");
    
    public HalamanUtama(){
        setVisible(true);
        setTitle("Halaman Utama");
        setSize(1000, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255, 215, 0));
        
        //Menampilkan JLabel pada Frame
        add(Header);
        Header.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Header.setBounds(385,65,330,35);
        add(SubHeader1);
        SubHeader1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        SubHeader1.setBounds(380,105,400,35);
        add(SubHeader2);
        SubHeader2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        SubHeader2.setBounds(453,185,400,35);
        
        //Menampilkan JButton pada Frame
        add(tombol2D);
        tombol2D.setBounds(360,225,300,35);
        tombol2D.setForeground(new Color(255, 215, 20));
        tombol2D.setBackground(new Color(50,205,50));
        add(tombol3D);
        tombol3D.setBounds(360,285,300,35);
        tombol3D.setForeground(new Color(255, 215, 20));
        tombol3D.setBackground(new Color(0,0,255));
        add(tombolKeluar);
        tombolKeluar.setBounds(440,375,150,35);
        tombolKeluar.setForeground(new Color(255, 215, 20));
        tombolKeluar.setBackground(new Color(255,0,0));
        
        //ActionListener ketika tombol di klik
        tombol2D.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new HalamanMenu2D();
            }
        });
        
        tombol3D.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new HalamanMenu3D();
            }
        });
        
        tombolKeluar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}
