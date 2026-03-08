package exercicio1_classe_produtotecnologia;

public class Exercicio1_Classe_ProdutoTecnologia {

    public static void main(String[] args) {
        ProdutoTecnologia objproduto1 = new ProdutoTecnologia("Telefone", "Motorola", 3290.75, 15);
        objproduto1.exibirProduto();
        
        System.out.println("");
        
        ProdutoTecnologia objproduto2 = new ProdutoTecnologia("Notebook", "Positivo", 1930.50, 10);
        objproduto2.exibirProduto();
    }
    
}
