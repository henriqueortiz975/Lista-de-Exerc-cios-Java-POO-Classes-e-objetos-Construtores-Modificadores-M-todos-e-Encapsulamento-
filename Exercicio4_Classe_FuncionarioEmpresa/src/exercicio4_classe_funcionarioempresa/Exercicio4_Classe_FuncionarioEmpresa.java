package exercicio4_classe_funcionarioempresa;

public class Exercicio4_Classe_FuncionarioEmpresa {

    public static void main(String[] args) {
        FuncionarioEmpresa objfuncionario1 = new FuncionarioEmpresa(
        "Henrique Ibarra","assistente", 2000.50,"Assistente de Departamento Pessoal");
        System.out.println("Nome do funcionario: " + objfuncionario1.getNome());
        System.out.println("Cargo: " + objfuncionario1.getCargo());
        System.out.println("");
        
        FuncionarioEmpresa objfuncionario2 = new FuncionarioEmpresa(
        "Arthur da Silva", "analista", 1530.75, "Analista de Departamento Pessoal");
        System.out.println("Nome do funcionario: " + objfuncionario2.getNome());
        System.out.println("Cargo: " + objfuncionario2.getCargo());
        System.out.println("");
        
        FuncionarioEmpresa objfuncionario3 = new FuncionarioEmpresa(
        "Miguel Morais", "coordenador", 2300.15, "Coordenador de Departamento Pessoal");
        System.out.println("Nome do funcionario: " + objfuncionario3.getNome());
        System.out.println("Cargo: " + objfuncionario3.getCargo());
        

    }
    
}
