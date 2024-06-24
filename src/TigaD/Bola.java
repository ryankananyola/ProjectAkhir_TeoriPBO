package TigaD;

import DuaD.Lingkaran;


public class Bola extends Lingkaran {
    
    public double volumeBola;
    
    public Bola(double jariJari) {
        super(jariJari);
    }

    @Override
    public double hitungVolume() {
        volumeBola = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return Double.parseDouble(String.format("%.2f", volumeBola));
    }
}
