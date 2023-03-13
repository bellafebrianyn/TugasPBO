/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung_bangunRuang;

/**
 *
 * @author hp
 */

public class KerucutTerpancung extends Kerucut {
    private double rAtas;

    public KerucutTerpancung(double rAtas, double tinggi, float r) {
        super(tinggi, r);
        this.rAtas = rAtas;
    }

    public double getrAtas() {
        return rAtas;
    }

    public void setrAtas(double rAtas) {
        this.rAtas = rAtas;
    }
    
    @Override
    public double hitungSisi() {
        sisi = (double) Math.sqrt((Math.pow(getR() - this.rAtas, 2)) + (Math.pow(getTinggi(), 2)));
        return sisi;
    }
    
    @Override
    public double hitungVolumeKerucut() {
        return (0.67*Math.PI*getTinggi()*(getR()*this.rAtas + Math.pow(getR(), 2) + (Math.pow(this.rAtas, 2))));
    }
    
    public double hitungSelimutKerucut() {
        return Math.PI * (getR() + this.rAtas) * hitungSisi();
    }

}
