package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Estoque;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {

	private ArrayList<Estoque> ListaProdutos = new ArrayList<Estoque>();
	int numero = 0;

	@Override
	public void procurarProduto(int numero) {
		var Estoque = procurarNoEstoque(numero);
		
		if(Estoque != null) {
			Estoque.visualizar();
		}else {
			System.out.println("O produto número: " + numero + "Não foi encontrado!");
		}
	}

	@Override
	public void listarTodas() {
		for (var EcommerceModelo : ListaProdutos) {
			Estoque.visualizar();
		}
	}

	@Override
	public void Cadastrar(Estoque Cadastrar) {
		ListaProdutos.addAll(ListaProdutos);
		System.out.println("O produto Número: ");

	}

	@Override
	public void Atualizar(Estoque Atualizar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Deletar(Estoque Deletar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void troco(int numero, float valorproduto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposito(int numero, float valorproduto) {
		// TODO Auto-generated method stub

	}

	public int gerarNumero() {
		return ++numero;
	}

	public void procurarNoEstoque(int numero) {
		for (var Estoque : ListaProdutos) {
			if (Estoque.getNumero() == numero) {
				return;
			}
		}
	}
}
