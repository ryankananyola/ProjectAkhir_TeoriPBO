package Main.View;

import TigaD.View.ViewBola;
import TigaD.View.ViewCincinBola;
import TigaD.View.ViewJuring;
import TigaD.View.ViewKerucut;
import TigaD.View.ViewLimasPP;
import TigaD.View.ViewLimasPersegi;
import TigaD.View.ViewPrisma;
import TigaD.View.ViewTabung;
import TigaD.View.ViewTembereng;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HalamanMenu3D extends JFrame {
    
    //Membuat JLabel
    JLabel Header = new JLabel("GEOMETRI 3 DIMENSI");
    JLabel SubHeader1 = new JLabel("PROGRAM HITUNG VOLUME 3 DIMENSI");
    JLabel SubHeader2 = new JLabel("Silahkan Pilih Menu");
    
    //Membuat JButton
    JButton tombolBola = new JButton("Hitung Bola");
    JButton tombolCincinBola = new JButton("Hitung Cincin Bola");
    JButton tombolJuring = new JButton("Hitung Juring");
    JButton tombolKerucut = new JButton("Hitung Kerucut");
    JButton tombolLimasPP = new JButton("Hitung Limas Persegi.P");
    JButton tombolLimasPersegi = new JButton("Hitung Limas Persegi");
    JButton tombolPrisma = new JButton("Hitung Prisma");
    JButton tombolTabung = new JButton("Hitung Tabung");
    JButton tombolTembereng = new JButton("Hitung Tembereng");
    JButton tombolKembali = new JButton("Kembali");
    
    public HalamanMenu3D(){
        setVisible(true);
        setTitle("Halaman Menu 3D");
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
        SubHeader1.setBounds(340,105,400,35);
        add(SubHeader2);
        SubHeader2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        SubHeader2.setBounds(453,185,400,35);
        
        //Menampilkan JButton pada Frame
        add(tombolBola);
        tombolBola.setBounds(250,225,167,35);
        tombolBola.setForeground(new Color(255, 215, 20));
        tombolBola.setBackground(new Color(0,0,255));
        add(tombolCincinBola);
        tombolCincinBola.setBounds(250,275,167,35);
        tombolCincinBola.setForeground(new Color(255, 215, 20));
        tombolCincinBola.setBackground(new Color(0,0,255));
        add(tombolJuring);
        tombolJuring.setBounds(250,325,167,35);
        tombolJuring.setForeground(new Color(255, 215, 20));
        tombolJuring.setBackground(new Color(0,0,255));
        add(tombolKerucut);
        tombolKerucut.setBounds(432,225,167,35);
        tombolKerucut.setForeground(new Color(255, 215, 20));
        tombolKerucut.setBackground(new Color(0,0,255));
        add(tombolLimasPP);
        tombolLimasPP.setBounds(432,275,167,35);
        tombolLimasPP.setForeground(new Color(255, 215, 20));
        tombolLimasPP.setBackground(new Color(0,0,255));
        add(tombolLimasPersegi);
        tombolLimasPersegi.setBounds(432,325,167,35);
        tombolLimasPersegi.setForeground(new Color(255, 215, 20));
        tombolLimasPersegi.setBackground(new Color(0,0,255));
        add(tombolPrisma);
        tombolPrisma.setBounds(614,225,167,35);
        tombolPrisma.setForeground(new Color(255, 215, 20));
        tombolPrisma.setBackground(new Color(0,0,255));
        add(tombolTabung);
        tombolTabung.setBounds(614,275,167,35);
        tombolTabung.setForeground(new Color(255, 215, 20));
        tombolTabung.setBackground(new Color(0,0,255));
        add(tombolTembereng);
        tombolTembereng.setBounds(614,325,167,35);
        tombolTembereng.setForeground(new Color(255, 215, 20));
        tombolTembereng.setBackground(new Color(0,0,255));
        
        add(tombolKembali);
        tombolKembali.setBounds(440,435,150,35);
        tombolKembali.setForeground(new Color(255, 215, 20));
        tombolKembali.setBackground(new Color(255,0,0));
        
        
        //ActionListener ketika tombol di klik
        tombolBola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewBola();
            }
        });
        
        tombolCincinBola.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewCincinBola();
            }
        });
        
        tombolJuring.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewJuring();
            }
        });
        
        tombolKerucut.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewKerucut();
            }
        });
        
        tombolLimasPP.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewLimasPP();
            }
        });
        
        tombolLimasPersegi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewLimasPersegi();
            }
        });
        
        tombolPrisma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewPrisma();
            }
        });
        
        tombolTabung.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewTabung();
            }
        });
        
        tombolTembereng.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewTembereng();
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
