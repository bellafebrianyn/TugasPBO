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
public class Bola extends Lingkaran {
    
    public Bola(float r) {
        super(r);
    }
    
    public double hitungLuasBola() {
        return 4*super.getMenghitungLuasLingkaran();
    }
    
    public double hitungVolumeBola() {
        return 1.33 * super.getMenghitungLuasLingkaran()* getR();
    }

    public String hitungKelilingBola() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
