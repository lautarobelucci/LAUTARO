
public class Escuela
{
    private String nombre;
    private String domicilio;
    private String director;
    
    Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio=p_domicilio;
    }
    
    private void setDirector(String p_director){
        this.director=p_director;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: " + this.getNombre() + " " +  "Domicilio: " + this.getDomicilio() + " " + "Director: " + this.getDirector() + 
                            "\n-------------------------------------------------------------------------------------------------------------" + 
                            "\nDocente: " + p_docente.getNombre() + 
                            "\nSueldo: ..................... $" + p_docente.calcularSueldo() +
                            "\nSueldo Basico: ...............$" + p_docente.getSueldoBasico() +
                            "\nAsignacion Familiar: .........$" + p_docente.getAsignacionFamiliar());
    }
}

