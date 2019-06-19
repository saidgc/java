/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rombo;

import java.util.Scanner;

/**
 *
 * @author Los Chidos
 */
public class rombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        
        System.out.print("Introduzca una cadena: ");
        cadena = sc.nextLine();
        
        
        int tam = cadena.length() > 10 ? 10 : cadena.length();
        
        for(int i=0; i<tam; i++){
            int n = tam - i;
            String str1 = String.format("%"+ n*2 + "c", cadena.toCharArray()[0]);
            System.out.println(str1 + " " + espacio(cadena.substring(1,i+1)) + espacio(invierte(cadena.substring(0,i))));
        }
        for(int i=(tam-2); i>=0; i--){
            int n = tam - i;
            String str1 = String.format("%"+ n*2 + "c", cadena.toCharArray()[0]);
            System.out.println(str1 + " " + espacio(cadena.substring(1,i+1)) + espacio(invierte(cadena.substring(0,i))));
        }
    }
    static String espacio(String str){
        String nueva = "";
        for(char ltr : str.toCharArray())
            nueva += ltr + " ";
        return nueva;
    }
    
    static String invierte(String str){
        String nueva = "";
        for(char ltr : str.toCharArray())
            nueva = ltr + nueva;
        return nueva;
    }
    
}
