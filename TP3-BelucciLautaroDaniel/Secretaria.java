
public class Secretaria
{
    public static void main(String []args){
        Docente unDocente= new Docente("Eliza Sanchez" , "Quinto", 1600, 1290);
        
        Escuela unaEscuela= new Escuela("Manuel Belgrano", "Irigoyen 1580" , "Leopoldo Juez");
        
        unaEscuela.imprimirRecibo(unDocente);
    
    }
}
