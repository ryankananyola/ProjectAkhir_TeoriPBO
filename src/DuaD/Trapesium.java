/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuaD;

import Main.Geometri2D;


public class Trapesium extends Geometri2D {
    
    public double alasA, alasB, tinggiTrap;
    public double luasTrapesium;
    
    public Trapesium(double alasA, double alasB, double tinggiTrap){
        this.alasA = alasA;
        this.alasB = alasB;
        this.tinggiTrap = tinggiTrap;
    }
    
    @Override
    public double hitungLuas() {
        luasTrapesium = 0.5 * (alasA + alasB) * tinggiTrap;
        return Double.parseDouble(String.format("%.2f", luasTrapesium));
    }
}
