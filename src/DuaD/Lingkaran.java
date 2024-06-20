/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuaD;

import projekpbo.Geometri2D;


public class Lingkaran extends Geometri2D {
    
    public double jariJari;
    public double luasLingkaran;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas() {
        luasLingkaran = Math.PI * jariJari * jariJari;
        return Double.parseDouble(String.format("%.2f", luasLingkaran));
    }
}
