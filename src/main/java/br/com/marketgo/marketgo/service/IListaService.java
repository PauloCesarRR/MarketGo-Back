package br.com.marketgo.marketgo.service;

import br.com.marketgo.marketgo.model.ItemLista;
import br.com.marketgo.marketgo.model.Lista;

public interface IListaService {

	public Lista criarNovaLista(Lista nova);
	public void removerLista(Integer id);
	public void fecharLista(Integer id);
	public void buscarPorId(Integer id);
}
