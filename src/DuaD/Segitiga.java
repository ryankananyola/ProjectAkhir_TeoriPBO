/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuaD;

import projekpbo.Geometri2D;

/**
 *
 * @author USER
 */
public class Segitiga extends Geometri2D {
    
    public double alas, tinggi;
    public double luasSegitiga;
    
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        luasSegitiga = 0.5 * alas * tinggi;
        return Double.parseDouble(String.format("%.2f", luasSegitiga));
    }
    
}
