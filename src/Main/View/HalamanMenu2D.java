package Main.View;

import DuaD.View.ViewBelahKetupat;
import DuaD.View.ViewJajarGenjang;
import DuaD.View.ViewLayang;
import DuaD.View.ViewLingkaran;
import DuaD.View.ViewPersegi;
import DuaD.View.ViewPersegiPanjang;
import DuaD.View.ViewSegitiga;
import DuaD.View.ViewTrapesium;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HalamanMenu2D extends JFrame {
    
    //Membuat JLabel
    JLabel Header = new JLabel("GEOMETRI 2 DIMENSI");
    JLabel SubHeader1 = new JLabel("PROGRAM HITUNG LUAS 2 DIMENSI");
    JLabel SubHeader2 = new JLabel("Silahkan Pilih Menu");
    
    //Membuat JButton
    JButton tombolBelahKetupat = new JButton("Hitung Belah Ketupat");
    JButton tombolLayang = new JButton("Hitung Layang-Layang");
    JButton tombolLingkaran = new JButton("Hitung Lingkaran");
    JButton tombolJajarGenjang = new JButton("Hitung Jajar Genjang");
    JButton tombolPersegi = new JButton("Hitung Persegi");
    JButton tombolPersegiPanjang = new JButton("Hitung Persegi Panjang");
    JButton tombolSegitiga = new JButton("Hitung Segitiga");
    JButton tombolTrapesium = new JButton("Hitung Trapesium");
    JButton tombolKembali = new JButton("Kembali");
    
    public HalamanMenu2D(){
        setVisible(true);
        setTitle("Halaman Menu 2D");
        setSize(1000, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255, 215, 0));
        
        //Menampilkan JLabel pada Frame
        add(Header);
        Header.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Header.setBounds(365,65,330,35);
        add(SubHeader1);
        SubHeader1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        SubHeader1.setBounds(355,105,400,35);
        add(SubHeader2);
        SubHeader2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        SubHeader2.setBounds(453,185,400,35);
        
        //Menampilkan JButton pada Frame
        add(tombolBelahKetupat);
        tombolBelahKetupat.setBounds(338,225,167,35);
        tombolBelahKetupat.setForeground(new Color(255, 215, 20));
        tombolBelahKetupat.setBackground(new Color(0,0,255));
        add(tombolLayang);
        tombolLayang.setBounds(338,265,167,35);
        tombolLayang.setForeground(new Color(255, 215, 20));
        tombolLayang.setBackground(new Color(0,0,255));
        add(tombolLingkaran);
        tombolLingkaran.setBounds(338,305,167,35);
        tombolLingkaran.setForeground(new Color(255, 215, 20));
        tombolLingkaran.setBackground(new Color(0,0,255));
        add(tombolJajarGenjang);
        tombolJajarGenjang.setBounds(338,345,167,35);
        tombolJajarGenjang.setForeground(new Color(255, 215, 20));
        tombolJajarGenjang.setBackground(new Color(0,0,255));
        add(tombolPersegi);
        tombolPersegi.setBounds(530,225,167,35);
        tombolPersegi.setForeground(new Color(255, 215, 20));
        tombolPersegi.setBackground(new Color(0,0,255));
        add(tombolPersegiPanjang);
        tombolPersegiPanjang.setBounds(530,265,167,35);
        tombolPersegiPanjang.setForeground(new Color(255, 215, 20));
        tombolPersegiPanjang.setBackground(new Color(0,0,255));
        add(tombolSegitiga);
        tombolSegitiga.setBounds(530,305,167,35);
        tombolSegitiga.setForeground(new Color(255, 215, 20));
        tombolSegitiga.setBackground(new Color(0,0,255));add(tombolJajarGenjang);
        add(tombolTrapesium);
        tombolTrapesium.setBounds(530,345,167,35);
        tombolTrapesium.setForeground(new Color(255, 215, 20));
        tombolTrapesium.setBackground(new Color(0,0,255));
        
        
        add(tombolKembali);
        tombolKembali.setBounds(440,435,150,35);
        tombolKembali.setForeground(new Color(255, 215, 20));
        tombolKembali.setBackground(new Color(255,0,0));
        
        //ActionListener ketika tombol di klik
        tombolBelahKetupat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewBelahKetupat();
            }
        });
        
        tombolJajarGenjang.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewJajarGenjang();
            }
        });
        
        tombolLayang.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewLayang();
            }
        });
        
        tombolLingkaran.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewLingkaran();
            }
        });
        
        tombolPersegi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewPersegi();
            }
        });
        
        tombolPersegiPanjang.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewPersegiPanjang();
            }
        });
        
        tombolSegitiga.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewSegitiga();
            }
        });
        
        tombolTrapesium.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewTrapesium();
            }
        });
        
        tombolKembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new HalamanUtama();
            }
        });
    }
}
