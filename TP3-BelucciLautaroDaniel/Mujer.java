
public class Mujer
{
  private String nombre;
  private String apellido;
  private int edad;
  private String estadoCivil;
  private Hombre esposo;
  
  Mujer(String p_nombre, String p_apellido,int p_edad){
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEstadoCivil("soltera");
    }
    
  Mujer(String p_nombre, String p_apellido,int p_edad, Hombre p_esposo){
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEstadoCivil("Casada");
    this.setEsposo(p_esposo);
    }
    
private void setNombre(String p_nombre){
    this.nombre = p_nombre;
} 

private void setApellido(String p_apellido){
    this.apellido = p_apellido;
}

private void setEdad(int p_edad){
    this.edad = p_edad;
}

private void setEsposo(Hombre p_esposo){
    this.esposo = p_esposo;
}

private void setEstadoCivil(String p_estadoCivil){
    this.estadoCivil=p_estadoCivil;
}
    
public String getNombre(){
   return nombre;
}

public String getApellido(){
   return apellido;
}    

public int getEdad(){
   return edad;
}

public String getEstadoCivil(){
    return this.estadoCivil;
}
    
public Hombre getEsposo(){
   return esposo;
}

public void divorcio(){
      if(this.getEsposo() != null){
        Hombre unaPersona = this.getEsposo();
        this.setEsposo(null);
        unaPersona.divorcio();
         this.setEstadoCivil("Divorciada");
        }
}

public void casarseCon(Hombre p_hombre){
      if (this.getEsposo() == null){
          this.setEsposo(p_hombre);
          p_hombre.casarseCon(this);
          this.setEstadoCivil("Casada");
        }
}

public String datos(){
   return ("\n")+this.getNombre() + " " + this.getApellido() +" " + "de"+ " " + this.getEdad() + " " + "años"+("\n");
}

public void mostrarEstadoCivil(){
   System.out.println(("\n")+this.getNombre()+ "  " + this.getApellido() + " "+ "de" + " "+this.getEdad()+ "" + "años"+ " - " + this.getEstadoCivil()+("\n"));
}

public void casadaCon(){
   System.out.println(("\n")+this.getNombre() + " " + this.getApellido() +" " + "de"+ " " + this.getEdad()+ " " +  "años"+ " " +  this.getEstadoCivil() +" "+ " con " + " " + this.getEsposo().datos()+("\n"));
}
}
