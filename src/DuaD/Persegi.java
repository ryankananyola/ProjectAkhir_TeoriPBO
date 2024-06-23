package DuaD;

import Main.Geometri2D;


public class Persegi extends Geometri2D {
    
    public double sisi;
    public double luasPersegi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        luasPersegi = sisi * sisi;
        return Double.parseDouble(String.format("%.2f", luasPersegi));
    }
}
