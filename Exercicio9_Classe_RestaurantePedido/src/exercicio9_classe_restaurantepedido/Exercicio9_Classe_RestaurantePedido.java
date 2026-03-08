package exercicio9_classe_restaurantepedido;

public class Exercicio9_Classe_RestaurantePedido {

    public static void main(String[] args) {
        PedidoRestaurante objcliente = new PedidoRestaurante("Henrique Ibarra",
        "Arroz, feijão, batata frita e pedaço de carne bovina assada", "suco de laranja", 43.50);
        objcliente.setBebida("Coca cola");
        
        System.out.println("nome do cliente: " + objcliente.getNomeCliente());
        System.out.println("prato pedido: " + objcliente.getPrato());
        System.out.println("bebida: " + objcliente.getBebida());
        System.out.println("valor total: " + objcliente.getValorTotal());
        
        

    }
    
}
