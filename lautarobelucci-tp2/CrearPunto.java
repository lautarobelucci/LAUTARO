import java.util.Scanner;
/**
 * Write a description of class CrearPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrearPunto
{
    // instance variables - replace the example below with your own
   public static void main(String []args){
     Scanner cre = new Scanner(System.in);
     
     System.out.println("ingresar la abscisa:");
     double x=cre.nextDouble();
     System.out.println("ingresar la ordenada:");
     double y=cre.nextDouble();
     
     Punto ingresar = new Punto(x,y);
     
     ingresar.mostrar();
     System.out.println(ingresar.coordenadas());
    
    }
}
