public class ProfessorIntegral extends Professor {
    private double salario;
    
    public ProfessorIntegral(String n, int i, String m, double s){
        super(n,i,m);
        this.setSalario(s);
    }
    
    public void setSalario(double s){
        this.salario = s;
    }
    
    public double getSalario(){
        return this.salario;
    }
}