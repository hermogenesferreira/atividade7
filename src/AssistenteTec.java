public class AssistenteTec extends Funcionario {
    private double bonus;
    
    public AssistenteTec(String n, String m, double b){
        super(n,m);
        this.setBonus(b);
    }
    public void setBonus(double b){
        this.bonus = b;
    }
    
    public double getBonus(){
        return this.bonus;
    }
}
