package ecommerce.repository;

import ecommerce.model.Loja;

public interface EcommerceRepository {

	// CRUD da Conta
	public void listarTodas();

	public void Cadastrar(Loja Cadastrar);

	public void Atualizar(Loja Atualizar);

	public void Deletar(int numero);

}
