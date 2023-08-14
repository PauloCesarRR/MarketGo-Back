package br.com.marketgo.marketgo.service;

import br.com.marketgo.marketgo.model.ItemLista;

public interface IItemListaService {
	public ItemLista inserirItem(ItemLista novo);
	public ItemLista alterarItem(ItemLista item);
	public void removerItem(Integer numSeq);
}
