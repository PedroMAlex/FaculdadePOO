package aplicacao;

public class Pedido {
    private String nomeDoCliente;
    private float precoProduto = 60;
    private int codigoPedido=0;

    private float horaCompraPedido;

    private String enderecoPedido;

    private String numeroCartao;

    private boolean statusPedido=false;

    private boolean entregue = false;
    public String getNomeDoCliente(){
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente){
        this.nomeDoCliente = nomeDoCliente;
    }

    public float getPrecoPrduto(){
        return precoProduto;
    }

    public void setPrecoProduto(Float precoProduto){
        this.precoProduto = precoProduto;
    }

    public int gerarCodigoPedido(){
        codigoPedido++;
        return codigoPedido;
    }

    public float getHoraCompraPedido(){
        return horaCompraPedido;
    }

    public void setHoraCompraPedido(float horaCompraPedido){
        this.horaCompraPedido=horaCompraPedido;
    }

    public String getEnderecoPedido(){
        return enderecoPedido;
    }
    public void setEnderecoPedido(String enderecoPedido){
        this.enderecoPedido=enderecoPedido;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public boolean isStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(boolean statusPedido) {
        this.statusPedido = statusPedido;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
}



