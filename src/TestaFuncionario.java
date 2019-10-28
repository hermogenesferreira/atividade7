public class TestaFuncionario {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Jose","Rua Teste","0000-0000");
        Fornecedor f1 = new Fornecedor("Joao","Rua Teste2","0001-0001",1000.0,500.0);
        Empregado e1 = new Empregado("Maria","Rua Teste3", "0002-0002","001",994.0,8.0);
        Administrador a1 = new Administrador("Joana","Rua Teste4","0003-0003","002",5000.0,8.0,2000.0);
        Operario o1 = new Operario("Patricia", "Rua Teste5","0004-0004","003",994.0,8.0,10000.0,5.0);
        
        System.out.println(f1.obterSaldo());
        System.out.println(e1.calcularSalario());
        System.out.println(a1.calcularSalario());
        System.out.println(o1.calcularSalario());
    }
}
