
/**
 * Write a description of class CrearAlumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrearAlumno
{
    public static void main(String []args){
    int lu = Integer.parseInt(args[0]);
    String nombre=(args[1]);
    String apellido=(args[2]);
    
    Alumno alu1= new Alumno(lu,nombre,apellido);
    
    alu1.setNota1(5.99);
    alu1.setNota2(10);
    alu1.mostrar();
    
   lu = Integer.parseInt(args[3]);
   nombre=(args[4]);
   apellido=(args[5]);
    
    Alumno alu2= new Alumno(lu,nombre,apellido);
    
    alu2.setNota1(7.85);
    alu2.setNota2(8.5);
    alu2.mostrar();
    }
}
