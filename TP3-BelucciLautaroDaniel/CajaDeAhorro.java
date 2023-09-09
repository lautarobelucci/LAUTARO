
/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CajaDeAhorro
{
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    CajaDeAhorro(int p_nroCuenta,Persona p_titular){
      this.setNroCuenta(p_nroCuenta);
      this.setTitular(p_titular);
      this.setSaldo(0);
      this.setExtraccionesPosibles(10);
    }
    
    CajaDeAhorro(int p_nroCuenta,Persona p_titular,double p_saldo){
      this.setNroCuenta(p_nroCuenta);
      this.setTitular(p_titular);
      this.setSaldo(p_saldo);
      this.setExtraccionesPosibles(10);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles; 
    }
    
    public int getNruCuenta(){
       return nroCuenta;
    }
    
    public Persona getTitular(){
       return titular;
    }
    
    public double getSaldo(){
       return saldo;
    }
    
    public int getExtraccionesPosibles(){
       return extraccionesPosibles;
    }
    
    private boolean puedeExtraer(double p_importo){
       return (this.getSaldo() >= p_importo && this.getExtraccionesPosibles() <= 10); 
    }
    
    private void extraccion(double p_importe){
         this.setSaldo(this.getSaldo() - p_importe);
         this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    public void extraer(double p_importe){
         if(this.puedeExtraer(p_importe)){
             this.extraccion(p_importe);
             
            }else if(p_importe > this.getSaldo()){
                System.out.println("No puede extraer mas que el saldo!");
            }else{
                System.out.println("No tiene habilitadas mas extracciones!");
            }
    }
    
     public void depositar(double p_importe){
       this.setSaldo(this.getSaldo() + p_importe);
    }
    
    public void mostrar(){
       System.out.println("\n- Caja De Ahorro –"+
                        "\nNro. Cuenta:"+ this.getNruCuenta()+ " - " +"Saldo:"+ this.getSaldo() +
                        "\nTitular:" + this.getTitular().nomYApe()+
                        "\nDescubierto:"+ this.getExtraccionesPosibles()+("\n"));
    } 
    
}
