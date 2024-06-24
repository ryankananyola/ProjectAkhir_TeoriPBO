package TigaD;


public class Juring extends Bola {
    
    public double tinggiJuring;
    public double volumeJuringBola;

    public Juring(double jariJari, double tinggiJuring) {
        super(jariJari);
        this.tinggiJuring = tinggiJuring;
    }

    @Override
    public double hitungVolume() {
        volumeJuringBola = (1.0 / 3.0) * Math.PI * (tinggiJuring * tinggiJuring) * ((3.0 * jariJari) - tinggiJuring);
        return Double.parseDouble(String.format("%.2f", volumeJuringBola));
    }
    
    
}
