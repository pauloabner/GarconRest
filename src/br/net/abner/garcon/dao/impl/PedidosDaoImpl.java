package br.net.abner.garcon.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.net.abner.garcon.dao.PedidosDao;
import br.net.abner.garcon.model.Pedido;
import br.net.abner.garcon.model.Produto;

public class PedidosDaoImpl implements PedidosDao {

	@Override
	public List<Pedido> listarPedidosDeUmaMesa(Integer numeroMesa) {
		
		if(numeroMesa != 1){
			return null;
		}
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		Produto pr = new Produto("C WHOP DP", 7.25F, 5111);
		Pedido p = new Pedido(pr, 1);
		pedidos.add(p);

		pr = new Produto("C ANTARTICA", 8.00F, 6353);
		p = new Pedido(pr, 1);
		pedidos.add(p);

		pr = new Produto("MED CBO BATATAS", 3.70F, 20125);
		p = new Pedido(pr, 1);
		pedidos.add(p);
		return pedidos;
	}

}
