package ecommerce.model;

public class Estoque extends Loja {

	private int lista;

	public Estoque(int numero, String produto, int quantidade) {
		super(numero, produto, quantidade);
		this.lista = lista;

	}

	public int getLista() {
		return lista;
	}

	public void setLista(int lista) {
		this.lista = lista;
	}

}
