package DuaD;

import Main.Geometri2D;


public class PersegiPanjang extends Geometri2D {
    
    public double panjang, lebar;
    public double luasPP;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        luasPP = panjang * lebar;
        return Double.parseDouble(String.format("%.2f", luasPP));
    }
}
