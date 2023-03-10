/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package image;

/**
 *
 * @author hp
 */
import java.awt.*;
import javax.swing.*;

class BLayout extends JFrame{
 JButton tombolSave,tombolEdit,tombolDelete,tombolOpen,tombolRandom;
 //JLabel labelGambar;
 
 public BLayout(){
    setTitle("Border Layout");
    tombolOpen = new JButton("Open");
    tombolSave = new JButton ("Save");
    tombolEdit = new JButton ("Edit");
    tombolDelete = new JButton ("Delete");
    tombolRandom = new JButton ("Random");
   // labelGambar = new Jlabel (new ImageIcon (getClass().getResource(("image/Gambar.jpg")));
    setLayout(null);
    add(tombolOpen);
    add(tombolRandom);
    add(tombolSave);
    //add(labelGambar,"Center");
    add(tombolEdit);
    add(tombolDelete);
    setSize(300, 200);
    
    tombolOpen.setBounds(10, 20, 100, 50);
    tombolEdit.setBounds(60, 20, 100, 50);
    tombolDelete.setBounds(110, 20, 100, 50);
    tombolRandom.setBounds(160, 20, 100, 50);
    tombolSave.setBounds(210, 20, 100, 50);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
}
public class CobaBorderLayout {
public static void main (String[] args){
BLayout b = new BLayout();
}
}

