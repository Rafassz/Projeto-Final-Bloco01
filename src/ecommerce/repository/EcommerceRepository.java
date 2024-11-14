package ecommerce.repository;

import ecommerce.model.Estoque; 

public interface EcommerceRepository {

	//CRUD da Conta
	public void procurarProduto(int numero);
	public void listarTodas();
	public void Cadastrar(Estoque Cadastrar);
	public void Atualizar(Estoque Atualizar);
	public void Deletar(Estoque Deletar);
	
	//MÉTODOS DE CAIXA
	public void troco(int numero, float valorproduto);
	public void deposito(int numero, float valorproduto);
	
}
