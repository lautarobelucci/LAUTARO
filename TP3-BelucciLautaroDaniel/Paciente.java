
public class Paciente
{
   private int historiaClinica;
   private String nombre;
   private String domicilio;
   private Localidad localidadNacido;
   private Localidad localidadVive;
   
   Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
       this.setHistoria(p_historia);
       this.setNombre(p_nombre);
       this.setDomicilio( p_domicilio);
       this.setNacido(p_localidadNacido);
       this.setVive(p_localidadVive);
    } 
    
    private void setHistoria(int p_historia){
      this.historiaClinica = p_historia;
    }
    
    private void setNombre(String p_nombre){
      this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
      this.domicilio = p_domicilio;
    }
    
    private void setNacido(Localidad p_localidadNacido){
      this.localidadNacido = p_localidadNacido;
    }
    
    private void setVive(Localidad p_localidadVive){
      this.localidadVive = p_localidadVive;
    }
    
    public int getHistoria(){
       return historiaClinica;
    }
    
    public String getNombre(){
      return nombre;
    }
    
    public String getDomicilio(){
      return domicilio;
    }
    
    public Localidad getNacido(){
      return localidadNacido;
    }
    
    public Localidad getVive(){
      return localidadVive;
    }
    
    public void mostarDatosPantalla(){
      System.out.println("Paciente:" + this.getNombre()+ "   " + " Historia Clínica:"+this.getHistoria() + "   " +"Domicilio:"+ this.getDomicilio() +
                         "\n"+ getVive().mostrar()+"\n");
    }
    
    public String cadenaDeDatos(){
      return (this.getNombre()+"_________"+ this.getHistoria()+"_________"+this.getDomicilio()+ "-" +this.getNacido().getNombre()+ "-" + this.getVive().getProvincia());
    }
}
