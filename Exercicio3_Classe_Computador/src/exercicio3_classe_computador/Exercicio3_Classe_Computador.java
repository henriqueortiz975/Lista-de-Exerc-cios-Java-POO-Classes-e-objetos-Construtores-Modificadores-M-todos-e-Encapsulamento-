package exercicio3_classe_computador;

public class Exercicio3_Classe_Computador {

    public static void main(String[] args) {
        Computador objpc = new Computador("positivo", "Intel Celeron", 6, 1200.50);
        objpc.setPreco(1100);

        System.out.println("Marca: " + objpc.getMarca());
        System.out.println("Processador: " + objpc.getProcessador());
        System.out.println("Memória RAM: " + objpc.getMemoriaRAM() + "GB");
        System.out.println("Preço: " + objpc.getPreco());

    }
    
}
