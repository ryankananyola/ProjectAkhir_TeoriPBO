package DuaD;

import Main.Geometri2D;


public class LayangLayang extends Geometri2D {
    
    public double diagonal1Layang, diagonal2Layang;
    public double luasLayangLayang;
    
    public LayangLayang(double diagonal1, double diagonal2){
        this.diagonal1Layang = diagonal1;
        this.diagonal2Layang = diagonal2;
    }
    
    @Override
    public double hitungLuas() {
        luasLayangLayang = diagonal1Layang * diagonal2Layang;
        return Double.parseDouble(String.format("%.2f", luasLayangLayang));
    }
}
