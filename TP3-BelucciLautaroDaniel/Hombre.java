
public class Hombre
{
  private String nombre;
  private String apellido;
  private int edad;
  private String estadoCivil;
  private Mujer esposa;
  
 Hombre(String p_nombre, String p_apellido,int p_edad){
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEstadoCivil("soltero");
    }
    
 Hombre(String p_nombre, String p_apellido,int p_edad, Mujer p_esposa){
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEsposa(p_esposa);
    this.setEstadoCivil("Casado");
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

private void setEsposa(Mujer p_esposa){
    this.esposa = p_esposa;
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
    
public Mujer getEsposa(){
   return esposa;
}

public void divorcio(){
      if(this.getEsposa() != null){
        Mujer unaPersona = this.getEsposa();
        this.setEsposa(null);
        unaPersona.divorcio();
        this.setEstadoCivil("Divorciado");
        }
}

public void casarseCon(Mujer p_mujer){
      if (this.getEsposa() == null){
          this.setEsposa(p_mujer);
          p_mujer.casarseCon(this);
          this.setEstadoCivil("Casado");
        }
}

public String datos(){
   return ("\n")+this.getNombre() + " " + this.getApellido() +" " + "de"+ " " + this.getEdad() + " " + "años"+("\n");
}

public void mostrarEstadoCivil(){
  System.out.println(("\n")+this.getNombre()+ "  " + this.getApellido() + " "+ "de" + " "+this.getEdad()+ "" + "años"+ " - " + this.getEstadoCivil()+("\n"));
}

public void casadaCon(){
  System.out.println(("\n")+this.getNombre() + " " + this.getApellido() +" " + "de"+ " " + this.getEdad()+ " " +  "años"+ " " +  this.getEstadoCivil() +" "+ " con " + " " + this.getEsposa().datos()+("\n"));
}
}