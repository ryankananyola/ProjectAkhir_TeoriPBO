package TigaD;

public class Tembereng extends Bola {
    
    public double tinggiTembereng;
    public double volumeTemberengBola;
    
    public Tembereng(double jariJari, double tinggiTembereng) {
        super(jariJari);
        this.tinggiTembereng = tinggiTembereng;
    }

    @Override
    public double hitungVolume() {
        volumeTemberengBola = (1.0 / 3.0) * Math.PI * (tinggiTembereng * tinggiTembereng) * ((3.0 * jariJari) - tinggiTembereng);
        return Double.parseDouble(String.format("%.2f", volumeTemberengBola));
    }  
}
