public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;
    
    public Operario(String n, String e, String t, String c, double s, double i,double v, double com){
        super(n,e,t,c,s,i);
        this.setValorProducao(v);
        this.setComissao(com);
    }
    
    public void setValorProducao(double v){
        this.valorProducao = v;
    }
    
    public double getValorProducao(){
        return this.valorProducao;
    }
    
    public void setComissao(double com){
        this.comissao = com;
    }
    
    public double getComissao(){
        return this.comissao;
    }
    
    public double calcularSalario(){
        return this.salarioBase - (this.salarioBase*this.imposto/100) + (this.valorProducao*this.comissao/100);
    }
}
