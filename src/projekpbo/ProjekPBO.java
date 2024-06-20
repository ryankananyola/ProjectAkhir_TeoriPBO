/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekpbo;

import DuaD.*;
import TigaD.*;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ProjekPBO{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihMenu, pilihan;
        char ulang = 't';
        
        do{
            System.out.println("Menu Utama");
            System.out.println("1. Menghitung Luas Geometri 2D");
            System.out.println("2. Menghitung Volume Geometri 3D");
            System.out.println("3. Keluar");
            System.out.println();
            System.out.print("Pilih Menu : ");
            pilihMenu = scanner.nextInt();
            
            switch (pilihMenu){
                case 1:
                    do{
                        System.out.println();
                        System.out.println("Menu Menghitung Luas Geometri 2D");
                        System.out.println("1. Hitung Luas Segitiga");
                        System.out.println("2. Hitung Luas Persegi");
                        System.out.println("3. Hitung Luas Persegi Panjang");
                        System.out.println("4. Hitung Luas Jajar Genjang");
                        System.out.println("5. Hitung Luas Belah Ketupat");
                        System.out.println("6. Hitung Luas Layang-Layang");
                        System.out.println("7. Hitung Luas Trapesium");
                        System.out.println("8. Hitung Luas Lingkaran");
                        System.out.println("0. Kembali");
                        System.out.println();
                        System.out.print("Pilih Menu : ");
                        pilihan = scanner.nextInt();

                        switch (pilihan){
                            
                            case 1:
                                System.out.println("==MENGHITUNG LUAS SEGITIGA==");
                                System.out.println();
                                System.out.print("Masukkan alas segitiga: ");
                                double alasSegitiga = scanner.nextDouble();
                                System.out.print("Masukkan tinggi segitiga: ");
                                double tinggiSegitiga = scanner.nextDouble();
                                Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
                                System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
                                break;
                                
                            case 2:
                                System.out.println("==MENGHITUNG LUAS PERSEGI==");
                                System.out.println();
                                System.out.print("Masukkan sisi persegi: ");
                                double sisiPersegi = scanner.nextDouble();
                                Persegi persegi = new Persegi(sisiPersegi);
                                System.out.println("Luas Persegi: " + persegi.hitungLuas());
                                break;
                                
                            case 3:
                                System.out.println("==MENGHITUNG LUAS PERSEGI PANJANG==");
                                System.out.println();
                                System.out.print("Masukkan Panjang Persegi Panjang: ");
                                double panjangPP = scanner.nextDouble();
                                System.out.print("Masukkan Lebar Persegi Panjang: ");
                                double lebarPP = scanner.nextDouble();
                                PersegiPanjang luasPP = new PersegiPanjang(panjangPP,lebarPP);
                                System.out.println("Luas Persegi: " + luasPP.hitungLuas());
                                break;
                                
                            case 4:
                                System.out.println("==MENGHITUNG LUAS JAJAR GENJANG==");
                                System.out.println();
                                System.out.print("Masukkan Alas Jajar Genjang: ");
                                double alasJG = scanner.nextDouble();
                                System.out.print("Masukkan Tinggi Jajar Genjang: ");
                                double tinggiJG = scanner.nextDouble();
                                JajarGenjang luasJajarGenjang = new JajarGenjang(alasJG,tinggiJG);
                                System.out.println("Luas Persegi: " + luasJajarGenjang.hitungLuas());
                                break;
                                
                            case 5:
                                System.out.println("==MENGHITUNG LUAS BELAH KETUPAT==");
                                System.out.println();
                                System.out.print("Masukkan Diagonal 1 Belah Ketupat: ");
                                double diag1BK = scanner.nextDouble();
                                System.out.print("Masukkan Diagonal 2 Belah Ketupat: ");
                                double diag2BK = scanner.nextDouble();
                                BelahKetupat luasBelahKetupat = new BelahKetupat(diag1BK,diag2BK);
                                System.out.println("Luas Belah Ketupat: " + luasBelahKetupat.hitungLuas());
                                break;
                                
                            case 6:
                                System.out.println("==MENGHITUNG LUAS LAYANG - LAYANG==");
                                System.out.println();
                                System.out.print("Masukkan Diagonal 1 Layang-Layang: ");
                                double diag1LL = scanner.nextDouble();
                                System.out.print("Masukkan Diagonal 2 Layang-Layang: ");
                                double diag2LL = scanner.nextDouble();
                                LayangLayang luasLayangLayang = new LayangLayang(diag1LL,diag2LL);
                                System.out.println("Luas Layang-Layang: " + luasLayangLayang.hitungLuas());
                                break;
                                
                            case 7:
                                System.out.println("==MENGHITUNG LUAS TRAPESIUM==");
                                System.out.println();
                                System.out.print("Masukkan Alas A Trapesium: ");
                                double alasATrap = scanner.nextDouble();
                                System.out.print("Masukkan Alas B Trapesium: ");
                                double alasBTrap = scanner.nextDouble();
                                System.out.print("Masukkan Tinggi Trapesium: ");
                                double tinggiTrap = scanner.nextDouble();
                                Trapesium luasTrapesium = new Trapesium(alasATrap,alasBTrap,tinggiTrap);
                                System.out.println("Luas Trapesium: " + luasTrapesium.hitungLuas());
                                break;
                                
                            case 8:
                                System.out.println("==MENGHITUNG LUAS LINGKARAN==");
                                System.out.println();
                                System.out.print("Masukkan Jari-Jari Lingkaran: ");
                                double jariJariLingkaran = scanner.nextDouble();
                                Lingkaran luasLingkaran = new Lingkaran(jariJariLingkaran);
                                System.out.println("Luas Lingkaran: " + luasLingkaran.hitungLuas());
                                break;
                                
                            case 0:
                                break;
                                
                            default:
                                System.out.println("Pilihan tidak valid");
                                break;
                            }
                            
                            if (pilihan != 0) {
                            System.out.println();
                            System.out.print("Kembali ke Menu Sebelumnya (y/t) : ");
                            ulang = scanner.next().charAt(0);
                        }
                    } while (pilihan != 0);
                    break;
                    
                case 2:
                    do{
                        System.out.println();
                        System.out.println("Menu Menghitung Volume Geometri 3D");
                        System.out.println("1. Hitung Volume Bola");
                        System.out.println("2. Hitung Volume Tabung");
                        System.out.println("3. Hitung Volume Kerucut");
                        System.out.println("4. Hitung Volume Prisma");
                        System.out.println("5. Hitung Volume Limas Persegi");
                        System.out.println("6. Hitung Volume Limas Persegi Panjang");
                        System.out.println("7. Hitung Volume Juring Bola");
                        System.out.println("8. Hitung Volume Tembereng Bola");
                        System.out.println("9. Hitung Volume Cincin Bola");
                        System.out.println("0. Kembali");
                        System.out.println();
                        System.out.print("Pilih Menu : ");
                        pilihan = scanner.nextInt();

                        switch (pilihan){
                            case 1:
                                System.out.println("==MENGHITUNG VOLUME BOLA==");
                                System.out.println();
                                System.out.print("Masukkan Jari-Jari Bola: ");
                                double jariBola = scanner.nextDouble();
                                Bola volBola = new Bola(jariBola);
                                System.out.println("Volume Bola: " + volBola.hitungVolume());
                                break;
                                
                            case 2:
                                System.out.println("==MENGHITUNG VOLUME TABUNG==");
                                System.out.println();
                                System.out.print("Masukkan Jari-Jari Tabung: ");
                                double jariTabung = scanner.nextDouble();
                                System.out.println("Masukkan Tinggi Tabung");
                                double tinggiTabung = scanner.nextDouble();
                                Tabung volTabung = new Tabung(jariTabung, tinggiTabung);
                                System.out.println("Volume Tabung: " + volTabung.hitungVolume());
                                break;
                                
                            case 3:
                                System.out.println("==MENGHITUNG VOLUME KERUCUT==");
                                System.out.println();
                                System.out.print("Masukkan Jari-Jari Kerucut: ");
                                double jariKerucut = scanner.nextDouble();
                                System.out.print("Masukkan Tinggi Kerucut: ");
                                double tinggiKerucut = scanner.nextDouble();
                                Kerucut volKerucut = new Kerucut(jariKerucut, tinggiKerucut);
                                System.out.println("Volume Kerucut: " + volKerucut.hitungVolume());
                                break;
                                
                            case 4:
                                System.out.println("==MENGHITUNG PRISMA SEGITIGA==");
                                System.out.println();
                                System.out.print("Masukkan Alas Segitiga: ");
                                double alasSegitiga = scanner.nextDouble();
                                System.out.print("Masukkan Tinggi Segitiga: ");
                                double tinggiSegitiga = scanner.nextDouble();
                                System.out.print("Masukkan Tinggi Prisma: ");
                                double tinggiPrisma = scanner.nextDouble();
                                Prisma volPrisma = new Prisma(alasSegitiga, tinggiSegitiga, tinggiPrisma);
                                System.out.println("Volume Prisma: " + volPrisma.hitungVolume());
                                break;
                                
                            case 5:
                                System.out.println("==MENGHITUNG VOLUME PRISMA PERSEGI==");
                                System.out.println();
                                System.out.print("Masukkan Sisi Limas Persegi: ");
                                double sisiLimasPersegi = scanner.nextDouble();
                                System.out.print("Masukkan Tinggi Limas Persegi: ");
                                double tinggiLimasPersegi = scanner.nextDouble();
                                LimasPersegi volLimasPersegi = new LimasPersegi(sisiLimasPersegi, tinggiLimasPersegi);
                                System.out.println("Volume Prisma: " + volLimasPersegi.hitungVolume());
                                break;
                                
                            case 6:
                                System.out.println("==MENGHITUNG VOLUME LIMAS PERSEGI PANJANG==");
                                System.out.println();
                                System.out.print("Masukkan Panjang Alas Limas Persegi Panjang: ");
                                double panjangLimasPP = scanner.nextDouble();
                                System.out.print("Masukkan Lebar Alas Limas Persegi Panjang: ");
                                double lebarLimasPP = scanner.nextDouble();
                                System.out.print("Masukkan Tinggi Limas Persegi Panjang: ");
                                double tinggiLimasPP = scanner.nextDouble();
                                LimasPP volLimasPP = new LimasPP(panjangLimasPP, lebarLimasPP, tinggiLimasPP);
                                System.out.println("Volume Limas Persegi Panjang: " + volLimasPP.hitungVolume());
                                break;
                                
                            case 7:
                                System.out.println("==MENGHITUNG VOLUME JURING BOLA==");
                                System.out.println();
                                System.out.print("Masukkan Jari-Jari Bola: ");
                                double jariJuringBola = scanner.nextDouble();
                                System.out.print("Masukkan Tinggi Juring Bola: ");
                                double tinggiJuringBola = scanner.nextDouble();
                                Juring volJuringBola = new Juring(jariJuringBola, tinggiJuringBola);
                                System.out.println("Volume Juring Bola: " + volJuringBola.hitungVolume());
                                break;
                                
                            case 8:
                                System.out.println("==MENGHITUNG VOLUME TEMBERENG BOLA==");
                                System.out.println();
                                System.out.print("Masukkan Jari-Jari Bola: ");
                                double jariTemberengBola = scanner.nextDouble();
                                System.out.print("Masukkan Tinggi Tembereng Bola: ");
                                double tinggiTemberengBola = scanner.nextDouble();
                                Tembereng volTemberengBola = new Tembereng(jariTemberengBola, tinggiTemberengBola);
                                System.out.println("Volume Tembereng Bola: " + volTemberengBola.hitungVolume());
                                break;
                                
                            case 9:
                                System.out.println("==MENGHITUNG VOLUME CINCIN BOLA==");
                                System.out.println();
                                System.out.print("Masukkan Jari-Jari Bola: ");
                                double jariJariBola = scanner.nextDouble();
                                System.out.print("Masukkan Jari-Jari Cincin Bola: ");
                                double jariCincinBola = scanner.nextDouble();
                                CincinBola volCincinBola = new CincinBola(jariJariBola, jariCincinBola);
                                System.out.println("Volume Cincin Bola: " + volCincinBola.hitungVolume());
                                break;
                                
                            case 0:
                                break;
                                
                            default:
                                System.out.println("Pilihan tidak valid");
                                break;
                            }
                        
                            if (pilihan != 0) {
                            System.out.println();
                            System.out.print("Kembali ke Menu Sebelumnya (y/t) : ");
                            ulang = scanner.next().charAt(0);
                        }
                    }while (pilihan != 0);
                    break;
                
                case 3:
                    System.out.println("Keluar Dari Program....");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
            
            System.out.println();
            
            if (pilihMenu != 3) {
                System.out.print("Kembali ke Menu Utama (y/t) : ");
                ulang = scanner.next().charAt(0);
            }
            
        } while (ulang == 'y' || ulang == 'Y');
        
        scanner.close();
    }
}
