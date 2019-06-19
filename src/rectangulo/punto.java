/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

public class punto {
    double x, y;
    
    public punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public punto(){}
   
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    double distancia(punto p1, punto p2){
        return(Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2)));
    }
    
    punto puntoMedio(punto p1, punto p2){
        punto medio = new punto(
                (p1.getX() + p2.getX()) / 2, 
                (p1.getY() + p2.getY()) / 2
        );
        return(medio);
    }
    
    public void ToString(){
        System.out.println("x: " + this.x + ", y: " + this.y);
    }
    
}
