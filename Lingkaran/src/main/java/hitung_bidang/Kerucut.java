/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung_bidang;

/**
 *
 * @author hp
 */
public class Kerucut extends Lingkaran {
    private double tinggi, sisi;

    public Kerucut(double tinggi, float r) {
        super(r);
        this.tinggi = tinggi;
        this.sisi = Math.sqrt((Math.pow(getR(), 2)) + (Math.pow(tinggi, 2)));
    }
    
    public double hitungLuasKerucut() {
        return 0.33*super.luasLingkaran*tinggi;
    }
    
    public double hitungVolumeKerucut() {
        return super.luasLingkaran + Math.PI * getR() * getSisi();
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

}
