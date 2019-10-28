public class ProfessorHorista extends Professor {
    private double horas;
    
    public ProfessorHorista(String n, int i, String m, double h){
        super(n,i,m);
        this.setHoras(h);
    }
    
    public void setHoras(double h){
        this.horas = h;
    }
    
    public double getHoras(){
        return this.horas;
    }
}
