/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung_bangunRuang;

import hitung_bangunDatar.*;

/**
 *
 * @author hp
 */
public class Kerucut extends Lingkaran {
    private double tinggi;
    public double sisi;

    public Kerucut(double tinggi, float r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public double hitungSisi() {
        sisi = (double) Math.sqrt((Math.pow(getR(), 2)) + (Math.pow(tinggi, 2)));
        return sisi;
    }
    
    public double hitungLuasKerucut() {
        return 0.33*super.getMenghitungLuasLingkaran()*tinggi;
    }
    
    public double hitungVolumeKerucut() {
        return super.getMenghitungLuasLingkaran() + Math.PI * getR() * sisi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
