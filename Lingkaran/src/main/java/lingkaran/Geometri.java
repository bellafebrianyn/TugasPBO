/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lingkaran;

import hitung_bidang.Bola;
import hitung_bidang.Juring;
import hitung_bidang.Keratan;
import hitung_bidang.Kerucut;
import hitung_bidang.Tabung;
import hitung_bidang.Tembereng;

/**
 *
 * @author hp
 */
public class Geometri {

    public static void main(String[] args) {
        System.out.println("Bola");
        Bola bb = new Bola(5);
        System.out.println("Luas Bola = " + bb.hitungLuasBola());
        System.out.println("Volume Bola = " + bb.hitungVolumeBola());
        
        System.out.println("Tabung");
        Tabung tb = new Tabung(20, 10);
        System.out.println("Luas Tabung = " + tb.hitungLuasTabung());
        System.out.println("Volume Tabung = " + tb.hitungVolumeTabung());
        
        System.out.println("Kerucut");
        Kerucut kr = new Kerucut(20, 10);
        System.out.println("Luas Kerucut = " + kr.hitungLuasKerucut());
        System.out.println("Volume Kerucut = " + kr.hitungVolumeKerucut());
    
        System.out.println("Juring");
        Juring jr = new Juring(90, 5);
        System.out.println("Luas Juring = " + jr.hitungLuasJuring());
        System.out.println("Volume Juring = " + jr.hitungVolumeJuring());
        
        System.out.println("Keratan");
        Keratan kt = new Keratan(10, 5);
        System.out.println("Luas Keratan = " + kt.hitungLuasKeratan());
        System.out.println("Volume Keratan = " + kt.hitungVolumeKeratan());
        
        System.out.println("Tembereng");
        Tembereng tg = new Tembereng(90, 5);
        System.out.println("Luas Tembereng = " + tg.hitungLuasTembereng());
        System.out.println("Volume Tembereng = " + tg.hitungVolumeTembereng());
    }
}
