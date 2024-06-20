/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuaD;

import projekpbo.Geometri2D;


public class PersegiPanjang extends Geometri2D {
    
    public double panjang, lebar;
    public double luasPP;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        luasPP = panjang * lebar;
        return Double.parseDouble(String.format("%.2f", luasPP));
    }
}
