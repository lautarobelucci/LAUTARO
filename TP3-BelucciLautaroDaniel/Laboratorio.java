
/**
  * La clase Laboratorio permite obtener y mostrar los datos de un laboratorio que produce medicamentos. Los datos que se muestran son: 
 * Nombre del lab, Domicilio y telefono.
 * 
 * @author (Lautaro Daniel Belucci) 
 * @version (1.0)
 */
public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    public Laboratorio(String p_nombre,String p_domicilio, String p_telefono,int p_compraMin,int p_diaEnt){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(p_compraMin);
        this.setDiaEnt(p_diaEnt);
    }
    
    public Laboratorio(String p_nombre,String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(0);
        this.setDiaEnt(0);
    }
    
   private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    
     private void setCompraMin(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    
    private void setDiaEnt(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public int getCompraMin(){
        return this.compraMinima;
    }

    public int getDiaEnt(){
        return this.diaEntrega;
    }
    
   /**
     * Permite cambiar en cualquier momento que desee el usuario cual sera la nueva compra minima. 
     * @param p_compraMin contiene la compra minima.
     */
    public void nuevaCompraMinima(int p_compraMin){
          this.compraMinima = p_compraMin;
    }
    
     /**
     * Permite cambiar en cualquier momento que desee el usuario cual sera el nuevo dia de entrega.
     * @param p_diaEnt contiene el dia de entrega.
     */
    public void nuevoDiaEntrefa(int p_diaEnt){
          this.diaEntrega = p_diaEnt;
    }
    
    /**
     * Permite mostrar los datos del laboratorio: Nombre del lab, Domicilio y Telefono.
     * @param no contiene.
     */
    public String mostrar(){
      return "Laboratorio:" + this.nombre +"\nDomicilio:" + this.domicilio + " - Telefono:" + this.telefono;
    }
    
}
