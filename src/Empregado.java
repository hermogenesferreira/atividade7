public class Empregado extends Pessoa {
    private String codigoSetor;
    public double salarioBase;
    public double imposto;
    
    public Empregado(String n, String e, String t, String c, double s, double i){
        super(n,e,t);
        this.setCodigoSetor(c);
        this.setSalarioBase(s);
        this.setImposto(i);
    }
    public void setCodigoSetor(String c){
        this.codigoSetor = c;
    }
    
    public String getCodigoSetor(){
        return this.codigoSetor;
    }
    
    public void setSalarioBase(double s){
        this.salarioBase = s;
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
    public void setImposto(double i){
        this.imposto = i;
    }
    
    public double getImpostos(){
        return this.imposto;
    }
    
    public double calcularSalario(){
        return this.salarioBase - (this.salarioBase*this.imposto/100);
    }
}
