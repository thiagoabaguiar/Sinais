/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author CS384038
 */
public class Sinais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v0 = 3; //v0 = 3
        int v1 = v0++; // v0 = 4 e v1 = 3
        //System.out.println("v0: " + v0 );
        //System.out.println("v1: " + v1 );
        
        int v2 = ++v1; // v1 = 4 e v2 = 4
        //System.out.println("v2: " + v2 );
        
        v1 += v0; // v1 = 8
        v2 += --v1; // v1 = 7 e v2 = 11
        
       // System.out.println("v0: " + v0 );
       // System.out.println("v1: " + v1 );
       // System.out.println("v2: " + v2 );
        
    }

}
