package ecommerce.model;

public abstract class Estoque {

	private String produto;
	private int quantidade;
	private int lista;
	private int numero;

	public Estoque(String produto, int quantidade, int lista, int numero) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.lista = lista;
		this.numero = numero;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public int getLista() {
		return lista;
	}

	public void setLista(int lista) {
		this.lista = lista;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static void visualizar() {
		
		System.out.println("           PRODUTOS            |              VALOR             ");
		

	}

}
