package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Estoque;
import ecommerce.model.Loja;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {

	private ArrayList<Loja> ListaProdutos = new ArrayList<Loja>();
	int numero = 0;

	@Override
	public void listarTodas() {
		for (var ID : ListaProdutos) {
			((Loja) ID).visualizar();
		}
	}

	@Override
	public void Cadastrar(Loja Cadastrar) {
		ListaProdutos.add(Cadastrar);
		System.out.println("O Produto Número: " + numero + " foi Cadastrado com Sucesso!!");
	}

	@Override
	public void Atualizar(Loja Atualizar) {
		var ID = buscarNaCollection(Atualizar.getNumero());

		if (ID != null) {
			ListaProdutos.set(ListaProdutos.indexOf(ID), Atualizar);
			System.out.println("\nO Produto Número: " + Atualizar.getNumero() + " foi atualizado com sucesso!!");
		} else {
			System.out.println("\nO produto Número: " + Atualizar.getNumero() + " não foi encontrado!!");
		}

	}

	@Override
	public void Deletar(int numero) {
		var ID = buscarNaCollection(numero);

		if (ID != null) {
			if (ListaProdutos.remove(ID) == true) {
				System.out.println("\nO produto Número: " + numero + " foi Deletado com Sucesso!!");
			} else {
				System.out.println("\nO Produto Número: " + numero + " não foi encontrado!!");
			}
		}
	}

	public int gerarNumero() {
		return ++numero;
	}

	public Loja buscarNaCollection(int numero) {
		for (var ID : ListaProdutos) {
			if (ID.getNumero() == numero) {
				return ID;
			}
		}
		return null;
	}
}
