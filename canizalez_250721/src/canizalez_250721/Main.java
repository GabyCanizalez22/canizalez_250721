/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canizalez_250721;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("50 grados centigrados a farhrenteit " + celsius_a_fahrenheit()+ "f"); 
   System.out.println("50 grados centigrados a farhrenteit " + celsius_a_kelvin()+ "k"); 
   System.out.println ("50 grados centigrados a farhrenteit " + celsius_a_rankie()+ "r"); 
   System.out.println("30 grados centigrados a farhenteit " );
    }
    
    public static double celsius_a_fahrenheit(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) / 5)+32;
    
    } 
    public static double celsius_a_kelvin(){
        double grados_centigrados  = 50.0;
        return grados_centigrados + 273;
        
    }
    public static double celsius_a_rankie(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)) / 5 +491.67;
    }
    public static double fahrenheit_a_celsius(){
        double grados_fahrenheit= 30.0;
        return (( grados_fahrenteit - 32)) *5 / 9;
    }
    public static double fahrenheit_a_kelvin(){
        double grados_fahrenheit = 30.0;
        return ((grados_fahrenheit - 32 ) *5 / 9) + 273.15;
    }
}
