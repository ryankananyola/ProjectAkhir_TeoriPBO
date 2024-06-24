package TigaD;

import DuaD.Segitiga;


public class Prisma extends Segitiga {
    
    public double tinggiPrisma;
    public double volumePrisma;
    
    public Prisma(double alas, double tinggi, double tinggiPrisma) {
        super(alas, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        volumePrisma = hitungLuas() * tinggiPrisma;
        return Double.parseDouble(String.format("%.2f", volumePrisma));
    }
}
