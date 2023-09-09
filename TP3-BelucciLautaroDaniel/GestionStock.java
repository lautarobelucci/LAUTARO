import java.util.Scanner;

/**
 * Write a description of class GestionStock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionStock
{
    public static void main(String []args){
          
          Scanner dato = new Scanner(System.in);
          
          System.out.println(" Desea ingresando datos:");
          int continuar = dato.nextInt();
          
          Laboratorio unLaboratorio = new Laboratorio("Colgate S.A", "Scalabrini Ortiz 5524", "54-11-4239-8447");
    
          Producto unProducto = new Producto(111, "Perfumeria", "Jabón Deluxe", 5.25, unLaboratorio);
          
          while(continuar != 0){
               System.out.println(" 1 ingresar Stock:");
               System.out.println(" 2 ingresar ajuste:");
               System.out.println(" 3 mostrar:");
               
               continuar = dato.nextInt(); 
               switch(continuar){
                   case 1:
                        System.out.println("Ingrese Stock:");
                        int stock = dato.nextInt();
                        unProducto.setStock(stock);
                       break;
                   case 2:
                        System.out.println("Ingrese ajuste:");
                        int ajuste = dato.nextInt();
                        unProducto.ajuste(ajuste);
                       break;
                   case 3:
                       unProducto.mostrar();
                       break;
                   default:
                       System.out.println("opcion invalida");
                }
                
        }
                 
    }
    public static void ingresarDatosLaboratorio(){
           Scanner dato = new Scanner(System.in);
           System.out.println("Ingrese Laboratorio:");
           String laboratorio = dato.next();
           System.out.println("Ingrese domicilio:");
           String domicilio = dato.next();
           System.out.println("Ingrese Telefono:");
           String telefono = dato.next();
           Laboratorio unLaboratorio = new Laboratorio(laboratorio,domicilio,telefono);
    }
    
     public static void ingresarDatosProducto(Laboratorio unLaboratorio){
          Scanner dato = new Scanner(System.in);
          
           System.out.println("Ingrese Codigo:");
           int codigo = dato.nextInt();
        
           System.out.println("Ingrese Rubro:");
           String rubro = dato.next();
        
           System.out.println("Ingrese Descripcion:");
           String descripcion = dato.next();
        
           System.out.println("Ingrese Costo:");
           double costo = dato.nextDouble();
 
           System.out.println("Ingrese PorcPtoRepo:");
           double porcPtoRepo = dato.nextDouble();
        
           System.out.println("Ingrese Exist Minima:");
           int existMinima = dato.nextInt();
        
           Producto unProducto = new Producto(codigo,rubro, descripcion, costo, porcPtoRepo, existMinima,unLaboratorio);
    }
    
    public static void ingresarStock(Producto unProducto){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese Stock:");
        int stock = dato.nextInt();
        unProducto.setStock(stock);
    }
}