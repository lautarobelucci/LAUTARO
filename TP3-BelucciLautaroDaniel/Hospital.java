
/**
 * Write a description of class Hospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital
{
    private String nombreHospital;
    private String nombreDirector;
    
    Hospital(String p_nombreHospital,String p_nombreDirector){
         this.setNomHospi(p_nombreHospital);
         this.setNomDirec(p_nombreDirector);
    }
    
    private void setNomHospi(String p_nombreHospital){
      this.nombreHospital = p_nombreHospital;
    }
    
    private void setNomDirec(String p_nombreDirector){
      this.nombreDirector = p_nombreDirector;
    }
    
    public String getNomHospi(){
      return nombreHospital;
    }
    
    public String getNomDirec(){
      return nombreDirector;
    }
    
    public void consultaDatosFiliatorios(Paciente p_paciente){
       System.out.println("Hospital:"+ this.getNomHospi() + "    " + "Directo:" + this.getNomDirec());
       System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
       p_paciente.mostarDatosPantalla();
    }
}
