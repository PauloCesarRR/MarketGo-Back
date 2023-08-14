package br.com.marketgo.marketgo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.marketgo.marketgo.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{
	
	public List<Produto> findAllByNomeContaining(String PalavraChave);
	
}
