package exercicio2_classe_livrobiblioteca;

public class Exercicio2_Classe_LivroBiblioteca {

    public static void main(String[] args) {
        LivroBiblioteca livro1 = new LivroBiblioteca("Sapiens","Yuval Noah Harari",591,2011);
        livro1.setAnoPublicacao(2014);

        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de páginas: " + livro1.getNumeroPaginas());
        System.out.println("Ano de publicação: " + livro1.getAnoPublicacao());

    }
    
}
