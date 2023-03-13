/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung_bidang;

/**
 *
 * @author hp
 */

public class Juring extends Bola {
    private double sudut;

    public Juring(double sudut, float r) {
        super(r);
        this.sudut = sudut;
    }

    public double getSudut() {
        return sudut;
    }

    public void setSudut(double sudut) {
        this.sudut = sudut;
    }
    
    public double hitungLuasJuring() {
        return (double) (sudut*(4*Math.PI*Math.pow(getR(), 2)));
    }
    
    public double hitungVolumeJuring() {
        return (double) (sudut*(1.33*Math.PI*Math.pow(getR(), 3)));
    }
}
