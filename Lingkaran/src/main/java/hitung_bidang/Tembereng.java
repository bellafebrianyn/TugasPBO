/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung_bidang;

/**
 *
 * @author hp
 */
public class Tembereng extends Bola {
    private double sudut, tinggi;

    public Tembereng(double sudut, float r) {
        super(r);
        this.sudut = sudut;
        this.tinggi = getR()- getR()* Math.cos(getSudut()/2);
    }

    private double getSudut() {
        return sudut;
    }

    public void setSudut(double sudut) {
        this.sudut = sudut;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double hitungLuasTembereng() {
        return (double) ((Math.pow(getR(), 2)/2)*(sudut-Math.sin(sudut)));
    }
    
    public double hitungVolumeTembereng() {
        return (double) ((2/3)*Math.PI*Math.pow((getR()/2), 2)*getTinggi());
    }
}
