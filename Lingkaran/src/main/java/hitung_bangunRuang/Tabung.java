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
public class Tabung extends Lingkaran {
   private double tinggi;

    public Tabung(double tinggi, float r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public double hitungLuasTabung() {
        return super.getMenghitungKelilingLingkaran() * (getR()+this.tinggi);
    }
    
    public double hitungVolumeTabung() {
        return super.getMenghitungLuasLingkaran()* this.tinggi;
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
