import java.util.Scanner;
/**
 * Write a description of class CrearEmpleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrearEmpleado
{
    // instance variables - replace the example below with your own
    public static void main(String []args){  
       Scanner texto= new Scanner(System.in);
        
        System.out.println("Ingrese su cuil: ");
        long cuil=texto.nextLong();
        System.out.println("Ingrese su Apellido: ");
        String apellido=texto.next();
        System.out.println("Ingrese su Nombre: ");
        String nombre=texto.next();
        System.out.println("Ingrese su Sueldo Basico: ");
        double sueldoBasico=texto.nextDouble();
        System.out.println("Ingrese su año de ingreso: ");
        int anioIngreso=texto.nextInt();
        
        Empleado unEmpleado= new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
        
        unEmpleado.mostrar();
        
       unEmpleado.mostrarLinea();
    }
}
