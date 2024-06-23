package DuaD;

import Main.Geometri2D;


public class Lingkaran extends Geometri2D {
    
    public double jariJari;
    public double luasLingkaran;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas() {
        luasLingkaran = Math.PI * jariJari * jariJari;
        return Double.parseDouble(String.format("%.2f", luasLingkaran));
    }
}
