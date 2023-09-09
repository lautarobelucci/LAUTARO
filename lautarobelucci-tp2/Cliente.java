import java.util.*;
/**
 * La clase Cliente muestra los datos de una cuenta como ser:Numero de DNI, Nombre, Apellido del usuario y el saldo.
 * 
 * @author (Lautaro Daniel Belucci) 
 * @version (1.0)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    public Cliente(int p_dni, String p_apellido, String p_nombre,double p_importe){
       this.setNroDni(p_dni);
       this.setApellido(p_apellido);
       this.setNombre(p_nombre);
       this.setImporte(p_importe);
    } 
    
    private void setNroDni(int p_dni){
        this.nroDNI=p_dni;
    }
    
    private void setApellido(String p_apellido){
       this.apellido=p_apellido;
    }
    
    private void setNombre(String p_nombre){
       this.nombre=p_nombre;
    }
    
    private void setImporte(double p_importe){
      this.saldo=p_importe;
    }
    
    public int getNroDni(){
       return this.nroDNI;    
    }
    
    public String getApellido(){
       return this.apellido;    
    }    
    
    public String getNombre(){
       return this.nombre;    
    }
    
    public double getImporte(){
       return this.saldo;    
    }
    
     /**
     * Reemplaza el saldo actual por el que se le pasa por parametro.
     * @param p_importe recibe un importe.
     * @return el nuevo saldo.
     */
    public double nuevoSaldo(double p_importe){
        return this.saldo = p_importe;
    }
    
    /**
     * Suma el saldo actual con el que se le pasa por parametro.
     * @param p_importe recibe un nuevo importe.
     * @return el nuevo saldo resultado de la suma.
     */
    public double agregarSaldo(double p_importe){
        return this.saldo + p_importe;
    }
    
     /**
     * Permite obtener el apellido y nombre del usuario. 
     * @param no contiene 
     * @return El apellido y nombre del usuario
     */
    public String apeYNombre(){
     return this.getApellido() +" "+ this.getNombre();
    
    }
    
    /**
     * Permite obtener el nombre y apellido del usuario. 
     * @param No contiene 
     * @return El nombre y apellido del usuario
     */
    public String nombreYApe(){
     return this.getNombre() +" "+ this.getApellido();
    }
    
     /**
     * Muestra por pantalla los datos del usuario, como ser: Su nombre, apellido y su saldo.
     * @param no contiene.
     */
    public void mostrar(){
     System.out.println("-Cliente-");
     System.out.println("Nombre y Apellido:"+ this.apeYNombre()+"\nSaldo:"+ this.getImporte() );
    }
    
    
}
