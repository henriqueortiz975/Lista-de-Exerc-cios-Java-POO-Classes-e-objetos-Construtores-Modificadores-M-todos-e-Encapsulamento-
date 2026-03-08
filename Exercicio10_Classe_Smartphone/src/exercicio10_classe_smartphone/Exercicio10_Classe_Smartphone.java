package exercicio10_classe_smartphone;

public class Exercicio10_Classe_Smartphone {

    public static void main(String[] args) {
        Smartphone objtelefone1 = new Smartphone("Motorola Edge 60 Fusion", "Motorola", 256, 6200.50);
        objtelefone1.setArmazenamento(512);
        
        System.out.println("Modelo do Smartphone: " + objtelefone1.getModelo());
        System.out.println("Fabricante: " + objtelefone1.getFabricante());
        System.out.println("Armazenamento de " + objtelefone1.getArmazenamento() + "GB");
        System.out.println("preço: " + objtelefone1.getPreco());
        
        System.out.println("");
        
        Smartphone objtelefone2 = new Smartphone("iPhone 17 Pro", "Apple", 256, 10200.50);
        
        System.out.println("Modelo do Smartphone: " + objtelefone2.getModelo());
        System.out.println("Fabricante: " + objtelefone2.getFabricante());
        System.out.println("Armazenamento de " + objtelefone2.getArmazenamento() + "GB");
        System.out.println("preço: " + objtelefone2.getPreco());

    }
    
}
