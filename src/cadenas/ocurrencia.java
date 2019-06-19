/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import java.util.Scanner;

/**
 *
 * @author Los Chidos
 */
public class ocurrencia {
    public static void main(String[] args) {
        int opc = 0;
        Scanner sc = new Scanner(System.in);

        String buffer;
        String cad = "Este problema es más interesante que el problema anterior.";
        String viejacad = "problema";
        String nuevacad = "programa";
        
        do{
            System.out.println("\n1\tDar una cadena");
            System.out.println("2\tDar una vieja subcadena");
            System.out.println("3\tDar una nueva subcadena");
            System.out.println("4\tMostrar la cadena resultado");
            System.out.println("5\tSalir");
            System.out.print("Seleccione una opción: ");
       
            opc = sc.nextInt();
            
            switch (opc){
                case 1:
                    System.out.println("Selecciono " + opc);
                    System.out.print("Deme la cadena: ");
                    buffer = sc.nextLine();
                    cad = sc.nextLine();
                    System.out.println("Su cadena es: " + cad);
                    break;
                case 2:
                    System.out.println("Selecciono " + opc);
                    System.out.print("Deme la vieja subcadena:");
                    buffer = sc.nextLine();
                    viejacad = sc.nextLine();
                    System.out.println("Su vieja cadena es: " + cad);
                    break;
                case 3:
                    System.out.println("Selecciono " + opc);
                    System.out.println("Deme la nueva subcadena:");
                    buffer = sc.nextLine();
                    nuevacad = sc.nextLine();
                    System.out.println("Su nueva cadena es: " + cad);
                    break;
                case 4:
                    String cadresult = cad.replaceAll(viejacad, nuevacad);
                    System.out.println(cadresult);
                    break;
            }
        }while (opc!=5);
    }
}
