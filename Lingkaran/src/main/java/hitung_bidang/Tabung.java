/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung_bidang;

/**
 *
 * @author hp
 */
public class Tabung extends Lingkaran {
   private double tinggi;

    public Tabung(double tinggi, float r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public double hitungLuasTabung() {
        return this.kelilingLingkaran * tinggi;
    }
    
    public double hitungVolumeTabung() {
        return this.luasLingkaran*tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public String hitungVolumeBola() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
