package ecommerce.model;

public class Caixa extends Estoque {

	private float valorproduto;
	private float saldocaixa;
	private float dinheirorecebido;
	private float troco;

	
	public Caixa(String produto, int quantidade, int lista, int numero) {
		super(produto, quantidade, lista, numero);
	}


	public float getTroco() {
		return troco;
	}


	public void setTroco(float troco) {
		this.troco = troco;
	}


	public float getDinheirorecebido() {
		return dinheirorecebido;
	}

	public void setDinheirorecebido(float dinheirorecebido) {
		this.dinheirorecebido = dinheirorecebido;
	}

	public float getValorproduto() {
		return valorproduto;
	}

	public void setValorproduto(float valorproduto) {
		this.valorproduto = valorproduto;
	}

	public float getSaldocaixa() {
		return saldocaixa;
	}

	public void setSaldocaixa(float saldocaixa) {
		this.saldocaixa = saldocaixa;
	}

	public boolean troco() {
		if (this.getSaldocaixa() < dinheirorecebido) {
			System.out.println("Esou sem Troco, aceita balinha??");
			return false;
		}
		this.setSaldocaixa(this.getSaldocaixa() + dinheirorecebido);
		troco = (dinheirorecebido - valorproduto);
		return true;

	}

	public void deposito() {
		this.setSaldocaixa(this.getSaldocaixa() + dinheirorecebido);

	}

}
