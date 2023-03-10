/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

/**
 *
 * @author hp
 */
import javax.swing.*;
class FrameTurunan extends JFrame {
    public FrameTurunan(String judul) {
    setTitle(judul);
    setSize(300,200);
    setDefaultCloseOperation(3);
    setVisible(true);
    }
 }
public class PanggilFrameTurunan {
    public static void main (String [] args) {
    FrameTurunan f = new FrameTurunan("Ini Frame Turunan");
    }
}

