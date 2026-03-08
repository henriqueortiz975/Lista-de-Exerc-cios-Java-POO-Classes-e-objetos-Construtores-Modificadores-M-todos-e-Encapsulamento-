package exercicio9_classe_restaurantepedido;

public class PedidoRestaurante {
    private String nomeCliente;
    private String prato;
    private String bebida;
    private double valorTotal;
    
    public PedidoRestaurante(String nomeCliente, String prato, String bebida, double valorTotal){
        this.nomeCliente = nomeCliente;
        this.prato = prato;
        this.bebida = bebida;
        this.valorTotal = valorTotal;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public void setPrato(String prato){
        this.prato = prato;
    }
    
    public void setBebida(String bebida){
        this.bebida = bebida;
    }
    
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public String getPrato(){
        return prato;
    }
    
    public String getBebida(){
        return bebida;
    }
    
    public double getValorTotal(){
        return valorTotal;
    }
}
