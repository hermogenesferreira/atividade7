public class Funcionario {

    private String Nome;
    private String Matricula;
    
    public Funcionario(String n, String m){
       this.setNome(n);
       this.setMatricula(m);
    }
    
    public void setNome(String n){
        this.Nome=(n);
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public void setMatricula(String m){
        this.Matricula=m;
    }
    
    public String getMatricula(){
        return this.Matricula;
    }
}
