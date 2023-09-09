import java.util.Random;

public class CreaFigura
{
    public static void main(String[] args){
        Random unNumero = new Random();
        double radio = unNumero.nextDouble() * 100.0;
        
        Punto unPunto= new Punto(0,0);
        Circulo unCirculo= new Circulo(radio, unPunto);
        
        unCirculo.desplazar(240,230);
        
        unCirculo.caracteristicas();
        
        Random otroNumero = new Random();
        double otraRadio = otroNumero.nextDouble() * 100.0;
        
        Punto otroPunto= new Punto(5.2,0.5);
        Circulo otroCirculo= new Circulo(otraRadio, otroPunto);
        
        otroCirculo.caracteristicas();
        
        System.out.println("\nLa caracteristicas del circulo mayor es de: ");
        unCirculo.elMayor(otroCirculo).caracteristicas();
        
        System.out.println("La distancia de un punto a otro es de: " + unCirculo.distanciaA(otroCirculo));
        
        Random numero1 = new Random();
        double alto1 = numero1.nextDouble() * 100.0;
        
        Random numero2 = new Random();
        double ancho1 = numero2.nextDouble() * 100.0;
        
        Punto puntoRectangulo= new Punto(0,0);
        Rectangulo unRectangulo= new Rectangulo(puntoRectangulo, ancho1, alto1);
        
        unRectangulo.desplazar(40, 20);
        
        unRectangulo.caracteristicas();
        
         Random numero3 = new Random();
        double alto2 = numero3.nextDouble() * 100.0;
        
        Random numero4 = new Random();
        double ancho2 = numero4.nextDouble() * 100.0;
        
        Punto puntoRectangulo2= new Punto(7.4,4.5);
        Rectangulo otroRectangulo= new Rectangulo(puntoRectangulo2, ancho2, alto2);
        
        otroRectangulo.caracteristicas();
        
        System.out.println("\nLa caracteristicas del RECTANGULO mayor es de: ");
        unRectangulo.elMayor(otroRectangulo).caracteristicas();
        
        System.out.println("La distancia de un rectangulo a otro es de: " + unRectangulo.distanciaA(otroRectangulo));
    }
}
