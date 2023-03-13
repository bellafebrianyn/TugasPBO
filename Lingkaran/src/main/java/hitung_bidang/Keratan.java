/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung_bidang;

/**
 *
 * @author hp
 */
public class Keratan extends Bola {
    private double d, tinggi;

    public Keratan(double d, float r) {
        super(r);
        this.d = d;
        tinggi = (double) (getR()-Math.sqrt(Math.pow(getR(), 2))-(Math.pow(d, 2)/4));
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double hitungLuasKeratan() {
        return (double) ((2*Math.PI*getR())*getTinggi());
    }
    
    public double hitungVolumeKeratan() {
        return (double) ((0.33*Math.PI*Math.pow(getTinggi(), 2))*(3*getR()-getTinggi()));
    }

}
