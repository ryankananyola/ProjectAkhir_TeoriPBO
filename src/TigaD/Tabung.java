package TigaD;

import DuaD.Lingkaran;


public class Tabung extends Lingkaran {
    
    public double tinggiTabung;
    public double volumeTabung;
    
    public Tabung(double jariJari, double tinggiTabung) {
        super(jariJari);
        this.tinggiTabung = tinggiTabung;
    }

    @Override
    public double hitungVolume() {
        volumeTabung = hitungLuas() * tinggiTabung;
        return Double.parseDouble(String.format("%.2f", volumeTabung));
    }
}
