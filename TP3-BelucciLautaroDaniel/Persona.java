
import java.util.*;
/**
 * La clase Persona muestra los datos de un usuario como ser: Dni, Nombre, Apellido y la edad. 
 * 
 * @author (Lautaro Daniel Belucci).
 * @version (1.0)
 */
public class Persona{
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    Persona(int p_dni, String p_nombre,String p_apellido,int p_anio){
       this.setDNI(p_dni);
       this.setNombre(p_nombre);
       this.setApellido(p_apellido);      
       this.setAnioNacimiento(p_anio);
    }
    
    Persona(int p_dni, String p_nombre,String p_apellido,Calendar p_fecha){
       this.setDNI(p_dni);
       this.setNombre(p_nombre);
       this.setApellido(p_apellido);      
       this.setFechaNacimiento(p_fecha);
    }
    
    private void setDNI(int p_dni){
        this.nroDni= p_dni;
    }
    
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    private void setApellido (String p_apellido){
         this.apellido = p_apellido;
    }
    
    private void setAnioNacimiento(int p_anio){
         Calendar v_fechaNacimiento= new GregorianCalendar();
         v_fechaNacimiento.set(p_anio,0,1);
         this.setFechaNacimiento(v_fechaNacimiento);
    }
    
    private void setFechaNacimiento(Calendar p_fecha){
         this.fechaNacimiento = p_fecha;
    }
    
    public int getDNI(){
         return this.nroDni;
    }
    
   public String getNombre(){
         return this.nombre;
    }
    
     public String getApellido(){
         return this.apellido;
    }
    
     public int getAnioNacimiento(){
         return  this.getFechaNacimiento().YEAR;
    }
    
     public Calendar getFechaNacimiento(){
         return fechaNacimiento;
    }
    
    /** 
     * Calcula la edad de la persona restando el año actual, menos el año de su nacimiento. 
     * @param no contiene 
     * @return La edad actual del usuario.
     */
    public int edad(){
       Calendar fechaHoy= new GregorianCalendar();
       int añoHoy=fechaHoy.get(Calendar.YEAR);
        
       return añoHoy - this.getAnioNacimiento();
    }
    
    /**
     * Permite obtener el nombre y apellido del usuario. 
     * @param No contiene 
     * @return El nombre y apellido
     */
    public String nomYApe(){
    return this.getNombre()+"  " + this.getApellido();
    
    }
    
    /**
     * Permite obtener el apellido y nombre del usuario. 
     * @param No contiene 
     * @return El apellido y nombre
     */
    public String apeYNom(){
    return this.getApellido()+ "  " + this.getNombre();
    }
    
    /**
    *Muestro por pantalla el nombre,apellido,DNI,edad del usuario.
    *@param No contiene
    */
    public void mostrar(){
       System.out.println("Nombre y Apellido :" +  this.nomYApe());
       System.out.println("DNI:" +  this.getDNI() +" "+ "Edad:" + this.edad() );
    }
    
    public boolean esCumpleaños(){
        Calendar hoy=new GregorianCalendar();
        int mesHoy=hoy.get(Calendar.MONTH);
        int diaHoy=hoy.get(Calendar.DAY_OF_MONTH);
        return mesHoy==getFechaNacimiento().get(Calendar.MONTH) && diaHoy==getFechaNacimiento().get(Calendar.DAY_OF_MONTH); 
    }
} 

