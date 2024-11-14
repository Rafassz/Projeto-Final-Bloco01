package ecommerce.model;

public abstract class Loja {

	private int numero;
	private String produto;
	private int quantidade;

	public Loja(int numero, String produto, int quantidade) {
		this.numero = numero;
		this.produto = produto;
		this.quantidade = quantidade;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void visualizar() {

		System.out.println("****************************************************************");
		System.out.println("                            PRODUTOS                            ");
		System.out.println("****************************************************************\n\n");
		System.out.println(
				"Dados do Produto: " + this.getNumero() + "                                                      ");
		System.out.println(
				"Nome do Produto: " + this.getProduto() + "                                                      ");
		System.out.println(
				"Quantidade: " + this.getQuantidade() + "                                                        ");

	}

}
