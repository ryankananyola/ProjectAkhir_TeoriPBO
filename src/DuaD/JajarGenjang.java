package DuaD;

import Main.Geometri2D;


public class JajarGenjang extends Geometri2D {
    
    public double alas, tinggi;
    public double luasJajarGenjang;
    
    public JajarGenjang(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        luasJajarGenjang = alas * tinggi;
        return Double.parseDouble(String.format("%.2f", luasJajarGenjang));
    }
}
