/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung_bidang;

/**
 *
 * @author hp
 */
public class Lingkaran {

    public double kelilingLingkaran;
    public double luasLingkaran;
    private float r;

    public Lingkaran(float r) {
        this.r = r;
        menghitungKelilingLingkaran(r);
        menghitungLuasLingkaran(r);
    }

    private double menghitungKelilingLingkaran(float r) {
        kelilingLingkaran = (double) (2 * Math.PI * r);
        return kelilingLingkaran;
    }

    private double menghitungLuasLingkaran(float r) {
        luasLingkaran = (double) (Math.PI * r * r);
        return luasLingkaran;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

}
