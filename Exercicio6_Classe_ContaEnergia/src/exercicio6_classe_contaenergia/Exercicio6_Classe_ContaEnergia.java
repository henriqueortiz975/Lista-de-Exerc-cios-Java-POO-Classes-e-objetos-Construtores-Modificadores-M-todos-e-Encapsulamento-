package exercicio6_classe_contaenergia;

public class Exercicio6_Classe_ContaEnergia {

    public static void main(String[] args) {
        ContaEnergia conta1 = new ContaEnergia("Antonio da Silva", 374523, 270, 180.50);

        conta1.setConsumoKwh(300);

        // Mostrando os dados
        System.out.println("Cliente: " + conta1.getNomeCliente());
        System.out.println("Numero da instalação: " + conta1.getNumeroInstalacao());
        System.out.println("Consumo: " + conta1.getConsumoKwh() + "Kwh");
        System.out.println("Valor: " + conta1.getValorConta());
    }
    
}
