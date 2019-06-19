
package rectangulo;

import java.util.Scanner;

public class rectangulo {
    static punto[] puntos = new punto[4];
    
    public static void main(String[] args) {
        int menu = 0;
        double aux1, aux2;
        Scanner sc = new Scanner(System.in);
        punto a = new punto();
        double base, altura;
        
        do{
            System.out.println("Menú");
            System.out.println("(1)\tnuevo rectángulo");
            System.out.println("(2)\tcalcular área");
            System.out.println("(3)\tclacular perímetro");
            System.out.println("(4)\timprimir puntos");
            System.out.println("(5)\tsalir");
            menu = sc.nextInt();
            
            switch(menu){
                case 1: 
                    System.out.println("Proporciona las coordenadas del rectángulo");
                    System.out.println("\'izquierda superior\'");
                    System.out.print("punto 1 X:\t");
                    aux1 = sc.nextDouble();
                    System.out.print("punto 1 Y:\t");
                    aux2 = sc.nextDouble();
                    punto p = new punto(aux1, aux2);
                    puntos[0] = p;
                    
                    System.out.println("\'derecha inferior\'");
                    System.out.print("punto 2 X:\t");
                    aux1 = sc.nextDouble();
                    System.out.print("punto 2 Y:\t");
                    aux2 = sc.nextDouble();
                    p = new punto(aux1, aux2);
                    puntos[3] = p;

                    
                    aux1 = puntos[0].getX();
                    aux2 = puntos[3].getY();
                    p = new punto(aux1, aux2);
                    puntos[1] = p;
                    
                    aux1 = puntos[3].getX();
                    aux2 = puntos[0].getY();
                    p = new punto(aux1, aux2);
                    puntos[2] = p;
                    
                    System.out.println("rectángulo creado");
                    break;
                
                case 2:
                    a = new punto();
                    base = a.distancia(puntos[2], puntos[3]);
                    altura = a.distancia(puntos[0], puntos[2]);
                    System.out.print("el área es de ");
                    System.out.println(base * altura);
                    break;
                    
                case 3: 
                    a = new punto();
                    base = a.distancia(puntos[2], puntos[3]);
                    altura = a.distancia(puntos[0], puntos[2]);
                    System.out.print("el perímetro es ");
                    System.out.println(2 * base + 2 * altura);
                    break;
                
                case 4:
                    System.out.println("los puntos son:");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(i + 1 + "\t");
                        puntos[i].ToString();
                    }
                    break;
                
                default:
                    System.out.println("opción no reconocida");
                    break;
            }
        } while(menu != 5);
    }
}

