
/**
 * La clase Alumno contiene los datos personales y la situacion actual del usuario.
 * 
 * @author (Lautaro Daniel Belucci) 
 * @version (1.0)
 */
public class Alumno{
   
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    public Alumno(int p_lu,String p_nombre,String p_apellido){
     this.setLu(p_lu);
     this.setNombre(p_nombre);
     this.setApellido(p_apellido);
     this.setNota1(0);
     this.setNota2(0);
    }
    
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    
    private void setNombre(String p_nombre){
      this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
      this.apellido= p_apellido;
    }
    
   public void setNota1(double p_nota1){
       this.nota1 = p_nota1;
    }
    
   public void setNota2(double p_nota2){
       this.nota2 = p_nota2;
    }
    
    public int getLu(){
        return this.lu;
    }
    
    public  String getNombre(){
      return this.nombre;
    }
    
    public  String getApellido(){
      return this.apellido;
    }
    
    public  double getNota1(){
       return this.nota1;
    }
    
    public double getNota2(){
       return this.nota2;
    }

    /**
     * Calcula el promedio del usuario teniendo en cuenta sus notas (suma de las notas y dividido la cantidad de notas).
     * @param No contiene.
     * @return el promedio final.
     */
    public double promedio(){
       return (this.getNota1() + this.getNota2()) / 2;
    }

    /**
     * Verifica si el usuario aprobo teniendo en cuenta el promedio y si las notas son mayor o igual que 6.
     * @param No contiene.
     * @return retorna verdadero en el caso que se apruebe o falso en el caso contrario.
     */
    private boolean aprueba(){
      return (this.promedio() > 7.0 && this.getNota1() >= 6.0 && this.getNota2() >= 6.0 );
    }
    
    /**
     * Muestra si el usuario aprobo teniendo en cuenta el promedio y si las notas son mayor o igual que 6.
     * @param No contiene.
     * @return retorna verdadero en el caso que se apruebe o falso en el caso contrario.
     */
    private String leyendaAprueba(){
       if(this.aprueba()){
         return "APROBADO";
        }else{
         return "DESAPROBADO";
        }
    }
    
     /**
     * Permite obtener el nombre y apellido del usuario. 
     * @param No contiene 
     * @return El nombre y apellido del usuario.
     */
    public String nomYApe(){
       return this.getNombre() + " " + this.getApellido();
    }
    
     /**
     * Permite obtener el apellido y nombre del usuario. 
     * @param no contiene 
     * @return El apellido y nombre del usuario.
     */
    public String apeYNom(){
       return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Muestra los datos personales de cada alumno como ser: Nombre, Apellido, LU, sus notas, y su promedio.
     * @param no contiene
     */
    public void mostrar(){
       System.out.printf("\nNombre y Apellido:" + this.nomYApe() + "\nLU:"+ this.getLu() +" "+ "Notas:"+this.getNota1()+"-"+this.getNota2());
       System.out.printf("\nPromedio:"+ this.promedio() + "-" + this.leyendaAprueba()+"\n");
    }
}
