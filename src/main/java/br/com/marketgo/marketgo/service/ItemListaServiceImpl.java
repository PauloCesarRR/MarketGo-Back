package br.com.marketgo.marketgo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.marketgo.marketgo.model.ItemLista;
import br.com.marketgo.marketgo.repo.ItemListaRepo;

@Component
public class ItemListaServiceImpl implements IItemListaService {

	@Autowired
	private ItemListaRepo repo;
	
	@Override
	public ItemLista inserirItem(ItemLista novo) {
		return repo.save(novo);
	}

	@Override
	public ItemLista alterarItem(ItemLista item) {
		return repo.save(item);
	}

	@Override
	public void removerItem(Integer numSeq) {
	 repo.deleteById(numSeq);
	}

}
