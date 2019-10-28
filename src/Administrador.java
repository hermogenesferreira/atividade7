public class Administrador extends Empregado{
    private double ajudaDeCusto;
    
    public Administrador(String n, String e, String t, String c, double s, double i, double a){
        super(n,e,t,c,s,i);
        this.setAjudaDeCusto(a);
    }
    
    public void setAjudaDeCusto(double a){
        this.ajudaDeCusto = a;
    }
    
    public double calcularSalario(){
        return this.salarioBase - (this.salarioBase*this.imposto/100)+this.ajudaDeCusto;
    }
}
