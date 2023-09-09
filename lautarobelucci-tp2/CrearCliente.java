
/**
 * Write a description of class CrearCliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrearCliente
{
    // instance variables - replace the example below with your ow
    public static void main(String []args){
    int nroDNI = Integer.parseInt(args[0]);
    String nombre=(args[2]);
    String apellido=(args[1]);
    double saldo=Double.parseDouble(args[3]);
    
    Cliente clie1 = new Cliente (nroDNI,nombre,apellido,saldo);
    
    clie1.mostrar();
    System.out.println("Agregar saldo: " + clie1.agregarSaldo(300));
    System.out.println("Nuevo Saldo: " + clie1.nuevoSaldo(700));
    
    }
}
