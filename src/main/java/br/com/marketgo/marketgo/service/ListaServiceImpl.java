package br.com.marketgo.marketgo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.marketgo.marketgo.model.ItemLista;
import br.com.marketgo.marketgo.model.Lista;
import br.com.marketgo.marketgo.repo.ListaRepo;

@Component
public class ListaServiceImpl implements IListaService{

	@Autowired
	private ListaRepo repo;
	
	
	@Override
	public Lista criarNovaLista(Lista nova) {
		// TODO Auto-generated method stub
		return repo.save(nova);
	}

	@Override
	public void removerLista(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Lista fecharLista(Integer id) {
		Lista l = repo.findById(id).get();
		double total = 0.0;
		for (ItemLista item: l.getItens()) {
			total += l.getValorTotal();
		}
		l.setValorTotal(total);
		l.setStatus(1);
		return repo.save(l);
	}

	@Override
	public Lista buscarPorId(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Lista> buscarTodas() {
		return (List<Lista>) repo.findAll();
	}
}
