public class AssistenteAdm extends Funcionario {
    private double adicional;
    
    public AssistenteAdm(String n, String m, double a){
        super(n,m);
        this.setAdicional(a);
    }
    
    public void setAdicional(double a){
        this.adicional = a;
    }
    public double getAdicional(){
        return this.adicional;
    }
}
