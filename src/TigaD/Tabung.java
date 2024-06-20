/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
