
public class Circulo
{
    public double radio;
    public Punto  centro;

    Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }

    Circulo(){
        this.setRadio(0);
    }

    private void setRadio(double p_radio){
        this.radio=p_radio;
    }

    private void setCentro(Punto p_centro){
        this.centro=p_centro;
    }

    public double getRadio(){
        return this.radio;
    }

    public Punto getCentro(){
        return this.centro;
    }  
    
    public void desplazar(double p_dx, double p_dy){
       this.getCentro().desplazar( p_dx, p_dy);
    }
    
    public void caracteristicas(){
         System.out.println("\n****** Circulo ******" + 
                            "\nCentro:"+ this.getCentro().coordenadas() + "-" + "Radio:" + this.getRadio() +
                            "\nSuperficie:"+ this.superficie() + "- " + "Perímetro:"+ this.perimetro());
    }
    
    public double perimetro(){
          return(2*Math.PI*this.getRadio());
    }
    
    public double superficie(){
          return(Math.PI*(Math.pow(this.getRadio(),2)));
    }
    
    public double distanciaA(Circulo otroCirculo){
          return this.getCentro().distanciaA(otroCirculo.getCentro());
    } 
    
    public Circulo elMayor(Circulo otroCirculo){
          if(this.superficie() > otroCirculo.superficie()){
            return this;
            }else{
            return otroCirculo;
            }
    }
}
    

