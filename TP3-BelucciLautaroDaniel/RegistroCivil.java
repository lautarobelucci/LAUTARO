import java.util.Scanner;

public class RegistroCivil
{
    public static void main (String []args){
      Scanner dato = new Scanner(System.in);
          
    System.out.println(" Desea ingresando datos 1 ´SI´ 0 ´NO´:");
    int continuar = dato.nextInt();
    
   Hombre hombre = new Hombre("Ramon","Acosta",24);
   Mujer mujer = new Mujer ("Julieta","Zanches",23,hombre);
   
    
    while(continuar != 0){
               System.out.println("  -------Datos Mujer-------");
               System.out.println(" 1-Mostrar Datos Mujer:");
               System.out.println(" 2-Mostrar estado civil :");
               System.out.println(" 3-Motrar con quien esta casada: ");
               System.out.println(" 4-Mostrar Divorcio:");
               System.out.println(" -----------------------------------");
               System.out.println("  -------Datos Hombre-------");
               System.out.println(" 5-Mostrar Datos Hombre:");
               System.out.println(" 6-Mostrar estado civil: ");
               System.out.println(" 7-Motrar con quien esta casado:");
               System.out.println(" 4-Mostrar Divorcio:");
               System.out.println("  ---------------------------------");
               
               continuar = dato.nextInt(); 
               switch(continuar){
                   case 1:
                       System.out.println (mujer.datos());
                       break;
                   case 2:
                        mujer.mostrarEstadoCivil();
                       break;
                   case 3:
                        mujer.casarseCon(hombre);
                        mujer.casadaCon();
                       break;
                   case 4:
                        mujer.divorcio();
                        mujer.mostrarEstadoCivil();
                       break;
                   case 5:
                       System.out.println (hombre.datos());
                       break;
                   case 6:
                       hombre.mostrarEstadoCivil();
                       break;
                   case 7:
                       hombre.casarseCon(mujer);
                       hombre.casadaCon();
                       break;
                   case 8:
                       hombre.divorcio();
                       hombre.mostrarEstadoCivil();
                       break;
                   default:
                       System.out.println("opcion invalida");
                }
               
        }
    
    }
}
