package br.com.marketgo.marketgo.service;

import java.util.List;

import br.com.marketgo.marketgo.model.Produto;

public interface IProdutoService {
	
	public Produto criarNovoProduto(Produto prod);
	public List<Produto> listarTodos();
	public List<Produto> buscarPorPalavraChave(String key);
	public Produto buscarPorID(Integer id);
	

}
