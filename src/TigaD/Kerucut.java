package TigaD;

import DuaD.Lingkaran;


public class Kerucut extends Lingkaran {
    
    public double tinggiKerucut;
    public double volumeKerucut;

    public Kerucut(double jariJari, double tinggiKerucut) {
        super(jariJari);
        this.tinggiKerucut = tinggiKerucut;
    }

    @Override
    public double hitungVolume() {
        volumeKerucut = (1.0 / 3.0) * hitungLuas() * tinggiKerucut;
        return Double.parseDouble(String.format("%.2f", volumeKerucut));
    } 
}
