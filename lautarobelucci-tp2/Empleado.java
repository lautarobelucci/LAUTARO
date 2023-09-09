import java.util.*;
/**
 * La clase Empleado muestra los datos del usuario como ser: Nombre, Apellido, Cuil, los años de antiguedad y su sueldo.
 * 
 * @author (Lautaro Daniel Belucci) 
 * @version (1.0)
 */
public class Empleado{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    
    public Empleado(long p_cuil,String p_apellido,String p_nombre,double p_importe,int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this .setAnioIngreso(p_anio);
    }
    
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    
   private void setApellido(String p_apellido){
       this.apellido= p_apellido;
    }
    
   private void setNombre(String p_nombre){
       this.nombre= p_nombre;
    } 
    
   private void setSueldoBasico(double p_importe){
    this.sueldoBasico= p_importe ;
    }
    
   private void setAnioIngreso(int p_anio){
     this .anioIngreso= p_anio;
    }
    
   public long getCuil(){
    return this.cuil;
    }
    
   public String getApellido(){
    return this.apellido;
    } 
    
   public String getNombre(){
    return this.nombre;
    } 
    
    public double getSueldoBasico(){
    return this.sueldoBasico;
    } 
    
    public int getAnioIngreso(){
     return this .anioIngreso;
    }
    
     /**
     * Calcula los años de antiguedad del usuario en la empresa restando el año actual con su año de ingreso.
     * @param no contiene.
     * @return el año de antiguedad en la empresa del usuario.
     */
    public int antiguedad(){
    Calendar fechaHoy= new GregorianCalendar();
    int añoHoy=fechaHoy.get(Calendar.YEAR);
        
    return añoHoy - this.getAnioIngreso();
    }
    
    /**
     * Realiza una asignacion del sueldo dependiendo de la antiguedad del usuario en la empresa, si la antiguedad es menor que 2 se le asigna 2%,
     * de 2 hasta 9 un 4%, y si es 10 o mas un 6.
     * @param no contiene
     * @return la asignacion correspondiente
     */
    private double adicional(){
       if(this.antiguedad()<2){
            return (2 * this.getSueldoBasico() / 100);
        
        }else if(this.antiguedad()>=2 && this.antiguedad()<10){
            return (4 * this.getSueldoBasico() / 100);
            
        }else{
            return (6 * this.getSueldoBasico() / 100);
        }
        
    } 
    
     /**
     * Aplica el 2% de descuento al sueldo basico y agrega $1500 de seguro de vida.
     * @param no contiene.
     * @return El descuento aplicado.
     */
    private double descuento(){
       return ((2 * this.getSueldoBasico() / 100)+ 1500);
    }
    
     /**
     * Calcula el sueldo neto del usuario, sumando el sueldo basico mas el adicional menos el descuento.
     * @param no contiene
     * @return el sueldo neto del usuario
     */
    public double sueldoNeto(){
       return (this.getSueldoBasico()+ this.adicional()-this.descuento());
    }
    
      /**
     * Permite obtener el nombre y apellido del usuario. 
     * @param No contiene.
     * @return El nombre y apellido.
     */
     public String nomYApe(){
       return this.getNombre() + " " + this.getApellido();
    }
    
     /**
     * Permite obtener el apellido y nombre del usuario. 
     * @param no contiene 
     * @return El apellido y nombre 
     */
    public String apeYNom(){
       return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Muestra los datos personales del usuario: Nombre, apellido, cuil, antiguedad y el sueldo neto.
     */
    public void mostrar(){
     System.out.println("Nombre y Apellido:"+ this.nomYApe()+ "\nCUIL:"+ this.getCuil() + " " + "Antiguedad:"+ this.antiguedad());
     System.out.println("Sueldo Neto:"+ this.sueldoNeto());
    }
    
    /**
     * Muestra los datos personales del usuario: cuil, apellido, nombre y el suedo neto.
     */
    public void mostrarLinea(){
     System.out.println("\n"+ this.getCuil() + "  " +  this.apeYNom()+"  ........... $"+ this.sueldoNeto());
    }
}
    

