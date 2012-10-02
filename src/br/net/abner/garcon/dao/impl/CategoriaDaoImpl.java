package br.net.abner.garcon.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.net.abner.garcon.dao.CategoriaDao;
import br.net.abner.garcon.model.Categoria;

public class CategoriaDaoImpl implements CategoriaDao {

	@Override
	public List<Categoria> listarCategorias() {
		List<Categoria> categorias = new ArrayList<Categoria>();
		
		categorias.add(new Categoria(1, "Entrada"));
		categorias.add(new Categoria(2, "Pratos Executivos"));
		categorias.add(new Categoria(3, "Massas"));
		categorias.add(new Categoria(4, "Bebidas"));
		
		return categorias;
	}

}
