package aplicacao;

public class Pedido {

	private String bairro;
	private String nomeRua;
	private float horaCompra;
	private int numeroCasa;
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getNomeRua() {
		return nomeRua;
	} 
	
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	
	public float getHoraCompra() {
		return horaCompra;
	}
	
	public void setHoraCompra(float horaCompra) {
		this.horaCompra = horaCompra;
	}
	
	public int getNumeroCasa() {
		return numeroCasa;
	}
	
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	    @Override
	    public String toString() {
	        return "Hora do pedido: " + horaCompra + ", Bairro: " + bairro + ", Nome da rua: " + nomeRua + ", Número da casa: " + numeroCasa;
	    }
}
