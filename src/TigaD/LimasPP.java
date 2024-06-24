package TigaD;

import DuaD.PersegiPanjang;

public class LimasPP extends PersegiPanjang {
    
    public double tinggiLimasPP;
    public double volumeLimasPP;
    
    public LimasPP(double panjang, double lebar, double tinggiLimasPP) {
        super(panjang, lebar);
        this.tinggiLimasPP = tinggiLimasPP;
    }

    @Override
    public double hitungVolume() {
        volumeLimasPP = (1.0 / 3.0) * hitungLuas() * tinggiLimasPP;
        return Double.parseDouble(String.format("%.2f", volumeLimasPP));
    }
}
