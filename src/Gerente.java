public class Gerente extends Funcionario {
    private String departamento;
    
    public Gerente(String n, String m, String d){
        super(n,m);
        this.setDepartamento(d);
    }
    
    public void setDepartamento(String d){
        this.departamento=d;
    }
    
    public String getDepartamento(){
        return departamento;
    }
}
