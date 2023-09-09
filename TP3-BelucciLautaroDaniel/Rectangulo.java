
public class Rectangulo
{
   private Punto origen;
   private double ancho;
   private double alto;
   
   Rectangulo(Punto p_origen, double p_ancho, double p_alto){
       this.setOrigen(p_origen);
       this.setAncho(p_ancho);
       this.setAlto(p_alto);
   }

   Rectangulo(double p_ancho, double p_alto){
       this.setAncho(p_ancho);
       this.setAlto(p_alto);
   }
   
   private void setOrigen(Punto p_origen){
       this.origen=p_origen;
   }
   
   private void setAncho(double p_ancho){
       this.ancho=p_ancho;
   }
   
   private void setAlto(double p_alto){
       this.alto=p_alto;
   }
   
   public Punto getOrigen(){
       return this.origen;
   }
   
   public double getAncho(){
       return this.ancho;
   }
   
   public double getAlto(){
       return this.alto;
   }
   
   public void desplazar(double p_dx, double p_dy){
       this.getOrigen().desplazar(p_dx, p_dy);
   }
   
   public void caracteristicas(){
       System.out.println("\n****** Rectangulo ******" + 
                            "\nOrigen: " + this.getOrigen().coordenadas() + "- Alto: " + this.getAlto() + "- Ancho: " + this.getAncho() + 
                            "\nSuperficie: " + this.superficie() + "- Perimetro: " + this.perimetro());     
   }

   public double perimetro(){
        return (2 * this.getAlto() + 2 * this.getAncho());
   }
   
   public double superficie(){
       return (this.getAlto() * this.getAncho());
   }
    
   public double distanciaA(Rectangulo otroRectangulo){
       return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
   }

   public Rectangulo elMayor(Rectangulo otroRectangulo){
       if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }else{
            return otroRectangulo;
        }
   }
   
}
