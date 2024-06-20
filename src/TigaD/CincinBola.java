/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TigaD;

/**
 *
 * @author USER
 */
public class CincinBola extends Bola {
    
    public double jariJariCincin;
    public double volumeCincinBola;
    
    public CincinBola(double jariJari, double jariJariCincin) {
        super(jariJari);
        this.jariJariCincin = jariJariCincin;
    }

    @Override
    public double hitungVolume() {
        volumeCincinBola = 2.0 * (Math.PI * Math.PI) * jariJari * (jariJariCincin * jariJariCincin);
        return Double.parseDouble(String.format("%.2f", volumeCincinBola));
    }
}
