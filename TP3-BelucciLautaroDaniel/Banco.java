import java.util.Scanner;

public class Banco
{
    public static void main(String []args){
      
    Scanner dato = new Scanner(System.in);
          
    System.out.println(" Desea ingresando datos 1 ´SI´ 0 ´NO´:");
    int continuar = dato.nextInt();
          
    Persona unaPersona = new Persona(232342,"Juan", "Perez", 2001);
    CuentaCorriente unaCuenta = new CuentaCorriente(300,unaPersona,800);
    CajaDeAhorro unaCaja = new CajaDeAhorro(4323423,unaPersona,700);
    
    while(continuar != 0){
               System.out.println("  -------Cuenta Corrientes-------");
               System.out.println(" 1-Depositar en Cuenta Corrientes:");
               System.out.println(" 2-Extraccion en Cuenta Corrientes:");
               System.out.println(" 3-motrar datos Cuentas Corientes:");
               System.out.println(" -----------------------------------");
               System.out.println("  -------Caja De Ahorro-------");
               System.out.println(" 4-Depositar en Caja De Ahorro:");
               System.out.println(" 5-Extraccion en Caja De Ahorro:");
               System.out.println(" 6-motrar datos Caja De Ahorro:");
               System.out.println("  ---------------------------------");
               System.out.println(" 7- Es el cumpleaño de la persona? ");
               
               continuar = dato.nextInt(); 
               switch(continuar){
                   case 1:
                        System.out.println("Depositar:");
                        int depo = dato.nextInt();
                        unaCuenta.depositar(depo);
                       break;
                   case 2:
                        System.out.println("Extraccion:");
                        double extra = dato.nextInt();
                        unaCuenta.extraer(extra);
                       break;
                   case 3:
                       unaCuenta.mostrar();
                       break;
                   case 4:
                        System.out.println("Depositar:");
                        int dep = dato.nextInt();
                        unaCaja.depositar(dep);
                       break;
                   case 5:
                        System.out.println("Extraccion:");
                        double extr = dato.nextInt();
                        unaCaja.extraer(extr);
                       break;
                   case 6:
                       unaCaja.mostrar();
                       break;
                   case 7:
                       System.out.println(("\n")+unaPersona.esCumpleaños()+("\n"));
                       break;
                   default:
                       System.out.println("opcion invalida");
                }
               
        }
        
    
    }
}
