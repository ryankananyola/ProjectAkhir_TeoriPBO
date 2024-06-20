/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
