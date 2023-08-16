package br.com.marketgo.marketgo.service;

import java.util.List;

import br.com.marketgo.marketgo.model.ItemLista;
import br.com.marketgo.marketgo.model.Lista;

public interface IListaService {

	public Lista criarNovaLista(Lista nova);
	public void removerLista(Integer id);
	public Lista fecharLista(Integer id);
	public Lista buscarPorId(Integer id);
	public List<Lista> buscarTodas();
}
