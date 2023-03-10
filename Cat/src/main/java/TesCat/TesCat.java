/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TesCat;

/**
 *
 * @author hp
 */
import Cat.Cat;
import java.util.Scanner;


public class TesCat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        int weight;
        
       
        System.out.print("Masukkan Nama : ");
        name = input.nextLine();
        System.out.print("Masukkan Umur : ");
        age = input.nextInt(); 
        System.out.print("Masukkan Berat : ");
        weight = input.nextInt();
         Cat jahil = new Cat(name, weight, age );
         jahil.setName(name);
         jahil.setAge(age);
         jahil.setWeight(weight);
         
        
        System.out.println("Cat's name is = " + jahil.getName()+ "\n" + "Cat's age is = " + jahil.getAge() + "\n" + "Cat's weight is = " + jahil.getWeight());
        
    }
}
