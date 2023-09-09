
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo; 
    private int existMinima;
    private Laboratorio laboratorio;
    
    Producto(int p_codigo,String p_rubro,String p_desc,double p_costo,double p_porcPtoRepo,int p_existMinima,Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }
    
     Producto(int p_codigo,String p_rubro,String p_desc,double p_costo,Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setLaboratorio(p_lab);
        this.setPorcPtoRepo(0);
        this.setExistMinima(0);
        this.setStock(0);
    }
    
    private void setCodigo(int p_codigo){
      this.codigo = p_codigo;
    }
    
    private void setRubro(String p_rubro){
      this.rubro= p_rubro;    
    }
    
    private void setDesc(String p_desc){
      this.descripcion= p_desc;
    }

    private void setCosto(double p_costo){
      this.costo = p_costo;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo){
      this.porcPtoRepo = p_porcPtoRepo;
    }
    
    private void setExistMinima(int p_existMinima){
      this.existMinima = p_existMinima;
    }
    
    private void setLaboratorio(Laboratorio p_lab){
      this.laboratorio= p_lab;
    }
    
    public void setStock(int p_stock){
      this.stock = p_stock;
    }
    
    public int getCodigo(){
      return this.codigo;
    }
    
    public String getRubro(){
      return this.rubro;    
    }
    
    public String getDesc(){
      return this.descripcion;
    }
    
    public double getCosto(){
      return this.costo;
    }
    
    public double getPorcPtoRepo(){
      return this.porcPtoRepo;
    }
    
    public int getExistMinima(){
      return this.existMinima;
    }
    
    public Laboratorio getLaboratorio(){
      return this.laboratorio;
    }
    
    public int getStock(){
      return this.stock;
    }
    
    public void ajuste(int p_cantidad){
       this.setStock(this.getStock() + p_cantidad);
    }
    
    public double precioLista(){
      return (12 * this.getCosto()/ 100);
    }
    
    public double precioContado(){
      return (this.precioLista()-(5 * this.precioLista()/ 100));
    }
    
    public double stockValorizado(){
      return (12 * (this.getCosto() * this.getStock()) / 100);
    }
    
    public void ajustarPtoRepo(double p_porce){
      this.setPorcPtoRepo(p_porce);;
    }
    
    public void ajustarExistMin(int p_cantidad){
      this.setExistMinima(p_cantidad);
    }
    
    public void mostrar(){
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println("Rubro: " + this.getRubro() + 
                           "\nDescripcion: " + this.getDesc() +
                           "\nPrecio costo: " + this.getCosto() +
                           "\nStock: " + this.getStock() + "-" + "Stock Valorizado: " + this.stockValorizado());
        
    }
    
    public String mostrarLinea(){
        return this.getDesc() + " " + this.precioLista() + " " + this.precioContado();
    }
    
}
