/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lingkaran;

import hitung_bangunDatar.*;
import hitung_bangunRuang.Bola;
import hitung_bangunRuang.Juring;
import hitung_bangunRuang.Keratan;
import hitung_bangunRuang.Kerucut;
import hitung_bangunRuang.KerucutTerpancung;
import hitung_bangunRuang.Tabung;
import hitung_bangunRuang.Tembereng;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Geometri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        int pilihMenu, kembali;

        do {
            System.out.println("==============================================");
            System.out.println("Menu Utama Program Menghitung Bangun Datar & Bangun Ruang");
            System.out.println("==============================================");
            System.out.println(" [1] Lingkaran \n [2] Tabung \n [3] Kerucut \n [4] Kerucut Terpancung \n [5] Bola \n [6] Juring Bola \n [7] Tembereng Bola \n [8] Keratan Bola \n [0] Exit \n");
            System.out.print("Pilih Menu : ");
            pilihMenu = menu.nextInt();

            switch (pilihMenu) {
                case 1:
                    System.out.println("Lingkaran");
                    System.out.println("Input Jari-Jari = ");
                    float rLingkaran = input.nextFloat();
                    HitungBangunDatar lk = new Lingkaran(rLingkaran);
                    lk.setR(rLingkaran);
                    System.out.println("Keliling Lingkaran : " + lk.getMenghitungKelilingLingkaran());
                    System.out.println("Luas Lingkaran : " + lk.getMenghitungLuasLingkaran());
                    break;
                case 2:
                    System.out.println("Tabung");
                    System.out.println("Input Jari-Jari = ");
                    float rTabung = input.nextFloat();
                    System.out.println("Input Tinggi = ");
                    double tTabung = input.nextDouble();
                    Tabung tb = new Tabung(tTabung, rTabung);
                    tb.setR(rTabung);
                    tb.setTinggi(tTabung);
                    System.out.println("Luas Tabung : " + tb.hitungLuasTabung());
                    System.out.println("Volume Tabung : " + tb.hitungVolumeTabung());
                    break;
                case 3:
                    System.out.println("Kerucut");
                    System.out.println("Input Jari-Jari = ");
                    float rKerucut = input.nextFloat();
                    System.out.println("Input Tinggi = ");
                    double tKerucut = input.nextDouble();
                    Kerucut kr = new Kerucut(tKerucut, rKerucut);
                    kr.setR(rKerucut);
                    kr.setTinggi(tKerucut);
                    System.out.println("Luas Kerucut : " + kr.hitungLuasKerucut());
                    System.out.println("Volume Kerucut : " + kr.hitungVolumeKerucut());
                    System.out.println("Sisi Miring Kerucut : " + kr.hitungSisi());
                    break;
                case 4:
                    System.out.println("Kerucut Terpancung");
                    System.out.println("Input Jari-Jari = ");
                    float rKTterpancung = input.nextFloat();
                    System.out.println("Input Jari-Jari Atas = ");
                    double rAtasKTterpancung = input.nextDouble();
                    System.out.println("Input Tinggi = ");
                    double tKTerpancung = input.nextDouble();
                    KerucutTerpancung kt = new KerucutTerpancung(rAtasKTterpancung, tKTerpancung, rKTterpancung);
                    kt.setR(rKTterpancung);
                    kt.setrAtas(rAtasKTterpancung);
                    kt.setTinggi(tKTerpancung);
                    System.out.println("Luas Kerucut Terpancung : " + kt.hitungSelimutKerucut());
                    System.out.println("Volume Kerucut Terpancung : " + kt.hitungVolumeKerucut());
                    System.out.println("Sisi Miring Kerucut Terpancung : " + kt.hitungSisi());
                    break;
                case 5:
                    System.out.println("Bola");
                    System.out.println("Input Jari-Jari = ");
                    float rBola = input.nextFloat();
                    Bola bl = new Bola(rBola);
                    bl.setR(rBola);
                    System.out.println("Luas Bola = " + bl.hitungLuasBola());
                    System.out.println("Volume Bola = " + bl.hitungVolumeBola());
                    break;
                case 6:
                    System.out.println("Juring");
                    System.out.println("Input Jari-Jari = ");
                    float rJuring = input.nextFloat();
                    System.out.println("Input Sudut Juring = ");
                    double sJuring = input.nextDouble();
                    Juring jr = new Juring(sJuring, rJuring);
                    jr.setR(rJuring);
                    System.out.println("Luas Juring = " + jr.hitungLuasJuring());
                    System.out.println("Volume Juring = " + jr.hitungVolumeJuring());
                    break;
                case 7:
                    System.out.println("Tembereng");
                    System.out.println("Input Jari-Jari = ");
                    float rTembereng = input.nextFloat();
                    System.out.println("Input Sudut Tembereng = ");
                    double sTembereng = input.nextDouble();
                    Tembereng tg = new Tembereng(sTembereng, rTembereng);
                    tg.setR(rTembereng);
                    tg.setSudut(sTembereng);
                    System.out.println("Luas Tembereng = " + tg.hitungLuasTembereng());
                    System.out.println("Volume Tembereng = " + tg.hitungVolumeTembereng());
                    break;
                case 8:
                    System.out.println("Keratan");
                    System.out.println("Input Jari-Jari = ");
                    float rKeratan = input.nextFloat();
                    System.out.println("Input Diagonal Tembereng = ");
                    double dKeratan = input.nextDouble();
                    Keratan kn = new Keratan(dKeratan, rKeratan);
                    kn.setR(rKeratan);
                    kn.setD(dKeratan);
                    System.out.println("Luas Keratan = " + kn.hitungLuasKeratan());
                    System.out.println("Volume Keratan = " + kn.hitungVolumeKeratan());
                    break;
                default:
                    System.out.println("Menu Tidak Ada");
            }
            System.out.println("Kembali ke Menu? (y=1, n=0)");
            kembali = input.nextInt();
            System.out.print("\033[H\033[2J");
        } while (kembali == 1);
    }
}
