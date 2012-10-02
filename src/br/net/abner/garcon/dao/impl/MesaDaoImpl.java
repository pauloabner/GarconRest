package br.net.abner.garcon.dao.impl;

import br.net.abner.garcon.dao.MesaDao;

public class MesaDaoImpl implements MesaDao {

	@Override
	public Integer obtemNumMesa(String token) {
		if(token.equals("a1s2d3f4")){
			return 1;
		}
		return -1;
	}

}
