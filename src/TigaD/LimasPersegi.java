package TigaD;

import DuaD.Persegi;

public class LimasPersegi extends Persegi{    
    
    public double tinggiLimas;
    public double volumeLimasPersegi;
    
    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    public double hitungVolume() {
        volumeLimasPersegi = (1.0 / 3.0) * hitungLuas() * tinggiLimas;
        return Double.parseDouble(String.format("%.2f", volumeLimasPersegi));
    }
}
