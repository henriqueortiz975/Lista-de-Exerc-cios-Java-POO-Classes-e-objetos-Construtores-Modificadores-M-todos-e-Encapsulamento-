package exercicio8_classe_carroaluguel;

public class Exercicio8_Classe_CarroAluguel {

    public static void main(String[] args) {
        CarroAluguel objcarro = new CarroAluguel("Chevrolet", "Onix ", 2025, 200.50);
        objcarro.setValorDiaria(140);
        
        System.out.println("Modelo do carro: " + objcarro.getModelo());
        System.out.println("Marca: " + objcarro.getMarca());
        System.out.println("Ano do lançamento: " + objcarro.getAno());
        System.out.println("Diaria do carro: " + objcarro.getValorDiaria());

    }
    
}
