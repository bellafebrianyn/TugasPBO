/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung_bangunDatar;

/**
 *
 * @author hp
 */
public class Lingkaran implements HitungBangunDatar {

    private double kelilingLingkaran;
    private double luasLingkaran;
    private float r;

    public Lingkaran(float r) {
        this.r = r;
        menghitungKelilingLingkaran(r);
        menghitungLuasLingkaran(r);
    }

    public double menghitungKelilingLingkaran(float r) {
        kelilingLingkaran = (double) (2 * Math.PI * r);
        return kelilingLingkaran;
    }

    public double menghitungLuasLingkaran(float r) {
        luasLingkaran = (double) (Math.PI * this.r * this.r);
        return luasLingkaran;
    }

    public float getR() {
        return r;
    }

    @Override
    public void setR(float r) {
        this.r = r;
    }

    public double getKelilingLingkaran() {
        return kelilingLingkaran;
    }

    public void setKelilingLingkaran(double kelilingLingkaran) {
        this.kelilingLingkaran = kelilingLingkaran;
    }
    
    @Override
    public double getMenghitungKelilingLingkaran() {
        return kelilingLingkaran;
    }
    
    @Override
    public double getMenghitungLuasLingkaran() {
        return luasLingkaran;
    }
}
