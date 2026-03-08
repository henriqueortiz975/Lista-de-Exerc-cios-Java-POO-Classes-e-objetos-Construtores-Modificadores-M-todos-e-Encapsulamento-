package exercicio5_classe_filme;

public class Exercicio5_Classe_Filme {

    public static void main(String[] args) {
        Filme objfilme = new Filme("Interestelar", "Christopher Nolan", 169, "12 anos");
        objfilme.setClassificacao("10 anos");
        
        System.out.println("Nome do filme: " + objfilme.getTitulo());
        System.out.println("Diretor: " + objfilme.getDiretor());
        System.out.println("duração: " + objfilme.getDuracao());
        System.out.println("Classificação: " + objfilme.getClassificacao());
        

    }
    
}
