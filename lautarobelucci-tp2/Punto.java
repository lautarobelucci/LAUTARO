
/**
 * La clase Punto permite crear un punto.
 * 
 * @author (Lautaro Daniel Belucci). 
 * @version (1.0).
 */
public class Punto{
    
   private double x;
   private double y;
   
 Punto(){
      this.setX(0.0);
      this.setY(0.0);
    }
   
 Punto(double p_x, double p_y){
      this.setX(p_x);
      this.setY(p_y);
    }
    
   private void setX(double p_x){
       this.x =p_x;
    }
   
   private void setY(double p_y){
       this.y =p_y;
    }
    
   public double getX(){
       return this.x;
    }
    
   public double getY(){
       return this.y;
    }
   
    /**
    * Permite cambiar la posicion del punto.
    * @param las posiciones en las que se quiere desplazar
    */
   public void desplazar(double p_dx, double p_dy){
      this.setX(this.getX() + p_dx);
      this.setY(this.getY() + p_dy);
    }
    
    /**
    * Permite mostrar las coordenadas del punto.
    * @param no contiene 
    * @return Las coordenadas actual del punto.
    */
   public String coordenadas(){
    return ("("+this.getX()+ " "+ this.getY()+")");
     
    }
    
    /**
    * Muestra los datos del punto: la posicion del punto X e Y.
    */
   public void mostrar(){
    System.out.println("X:"+ this.getX()+ "Y:" + this.getY());
    }
   
}
