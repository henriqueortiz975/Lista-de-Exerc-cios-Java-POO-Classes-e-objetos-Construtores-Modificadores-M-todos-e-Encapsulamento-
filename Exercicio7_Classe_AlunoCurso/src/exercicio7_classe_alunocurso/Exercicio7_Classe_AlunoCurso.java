package exercicio7_classe_alunocurso;

public class Exercicio7_Classe_AlunoCurso {

    public static void main(String[] args) {
        AlunoCurso aluno1 = new AlunoCurso("Henrique", "Informatica", 5, 375379);
        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("");
        
        AlunoCurso aluno2 = new AlunoCurso("Luiz", "engenharia", 3, 4758457);
        System.out.println("Nome do aluno: " + aluno2.getNome());
        System.out.println("Curso: " + aluno2.getCurso());

    }
    
}
