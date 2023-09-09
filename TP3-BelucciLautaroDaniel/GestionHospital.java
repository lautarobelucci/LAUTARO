
public class GestionHospital
{
    public static void main(String []args){
      Localidad unaLocalidad = new Localidad("Monte Caseros","Corrientes");
      Hospital unHospital =  new Hospital("Garrahan","Leonardo Ruiz");
      Paciente unPaciente = new Paciente(578669,"Juan Manuel Ortigoza","Bulevar 3 de Abril",unaLocalidad,unaLocalidad);       
    
      unHospital.consultaDatosFiliatorios(unPaciente);
      
      System.out.println(unPaciente.cadenaDeDatos());
    }
}
