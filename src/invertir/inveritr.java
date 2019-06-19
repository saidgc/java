/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertir;

import java.util.Scanner;

/**
 *
 * @author Los Chidos
 */
public class inveritr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deme una cadena: ");
        String cadena = sc.nextLine();
        String[] palabras = cadena.split(" ");
        String inversa = "";
        for(String inverir: palabras){
            String reves = "";
            for(char letra: inverir.toCharArray())
                reves = letra + reves;
            inversa += reves + " ";
        }
        System.out.println("La cadena invertida por palabras es:");
        System.out.println(inversa);
    }
 
}
