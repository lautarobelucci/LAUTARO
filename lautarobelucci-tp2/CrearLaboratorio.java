
/**
 * Write a description of class CrearLaboratorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrearLaboratorio{
   public static void main(String []args){
    Laboratorio labo1 = new Laboratorio("Colgate S.A.","Junin 5204", "394970676", 800, 14);
    System.out.println(labo1.mostrar());
    System.out.println(labo1.getCompraMin());
    }

}
