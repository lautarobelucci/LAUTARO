
public class CuentaCorriente
{
    private int nroCuenta;
    private double saldo;
    private int limiteDescubirto;
    private Persona titular;
    
    CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubirto(500);
    }
    
    CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubirto(500);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta=p_nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular=p_titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo=p_saldo;
    }
    
    private void setLimiteDescubirto(int p_extracciones){
        this.limiteDescubirto = p_extracciones;
    }
    
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getLimiteDescubirto(){
        return this.limiteDescubirto;
    }
    
    public Persona getTitular(){
        return this.titular;
    }

    private boolean puedeExtraer(double p_importe){
        return this.getSaldo() + this.getLimiteDescubirto() >= p_importe;
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
           extraccion(p_importe);
        }else{
           System.out.println("\nEl importe de extraccion sobrepasa el límite de descubierto!");
        }
    }

    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    public void mostrar(){
        System.out.println("\n - Cuenta de Ahorro - " + 
                            "\nNro. Cuenta: " + this.getNroCuenta() + " Saldo: " + this.getSaldo() + 
                            "\nTitular: " + this.getTitular().nomYApe() + 
                            "\nExtraccione Posibles: " + this.getLimiteDescubirto()+("\n"));
    }
}