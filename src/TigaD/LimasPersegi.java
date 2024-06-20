/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TigaD;

import DuaD.Persegi;


/**
 *
 * @author USER
 */
public class LimasPersegi extends Persegi{    
    
    public double tinggiLimas;
    public double volumeLimasPersegi;
    
    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    public double hitungVolume() {
        volumeLimasPersegi = (1.0 / 3.0) * hitungLuas() * tinggiLimas;
        return Double.parseDouble(String.format("%.2f", volumeLimasPersegi));
    }
}
