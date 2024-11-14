package ecommerce.model;

public abstract class Estoque {

	private String produto;
	private int quantidade;
	private int tipo;
	private int lista;
	private int numero;

	public Estoque(String produto, int quantidade, int tipo, int lista, int numero) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.tipo = tipo;
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	public void Pagamento() {

		String tipo = " ";

		switch (this.tipo) {
		case 1 -> System.out.println("Débito Selecionado");
		case 2 -> System.out.println("Crédito Selecionado");
		}

	}

	public void visualizar() {
		System.out.println("****************************************************************");
		System.out.println("           PRODUTOS            |              VALOR             ");
		System.out.println("           PRODUTOS            |              VALOR             ");
		System.out.println("           PRODUTOS            |              VALOR             ");
		System.out.println("           PRODUTOS            |              VALOR             ");
		System.out.println("           PRODUTOS            |              VALOR             ");
		System.out.println("           PRODUTOS            |              VALOR             ");

	}

}
