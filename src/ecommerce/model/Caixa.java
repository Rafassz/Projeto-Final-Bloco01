package ecommerce.model;

public class Caixa extends Estoque {

	private float valorproduto;

	public Caixa(String produto, int quantidade, int tipo, int lista, int numero, float valorproduto) {
		super(produto, quantidade, tipo, lista, numero);
	}

	public float getValorproduto() {
		return valorproduto;
	}

	public void setValorproduto(float valorproduto) {
		this.valorproduto = valorproduto;
	}

}
