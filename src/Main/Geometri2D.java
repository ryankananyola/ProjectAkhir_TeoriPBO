package Main;

public abstract class Geometri2D implements BendaGeometri {

    public double alas, tinggi, panjang, lebar;

    public Geometri2D() {
        this.alas = alas;
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungVolume() {
        return 0;
    }
    
}
