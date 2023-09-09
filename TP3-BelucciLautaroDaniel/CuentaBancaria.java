
    public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    CuentaBancaria(int p_nroCuenta,Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    CuentaBancaria(int p_nroCuenta,Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    private void setTitular(Persona p_titular){
        this.titular=p_titular;
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta=p_nroCuenta;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo=p_saldo;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }

    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }
    
    public void mostrar(){
        System.out.println("Titular: " + this.titular.nomYApe() + "(" + this.titular.edad() + ")" + 
                            "\nSaldo: " + this.getSaldo());
    }

    public String toString(){
        return this.getNroCuenta() + this.getTitular().nomYApe() + this.getSaldo();
    }
    
}

