/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuaD;

import projekpbo.Geometri2D;


public class BelahKetupat extends Geometri2D {
    
    public double diagonal1Ketupat, diagonal2Ketupat;
    public double luasBelahKetupat;
    
    public BelahKetupat(double diagonal1, double diagonal2){
        this.diagonal1Ketupat = diagonal1;
        this.diagonal2Ketupat = diagonal2;
    }

    @Override
    public double hitungLuas() {
        luasBelahKetupat = 0.5 * diagonal1Ketupat * diagonal2Ketupat;
        return Double.parseDouble(String.format("%.2f", luasBelahKetupat));
    }
}
