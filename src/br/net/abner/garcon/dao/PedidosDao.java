package br.net.abner.garcon.dao;

import java.util.List;

import br.net.abner.garcon.model.Pedido;

public interface PedidosDao {
	/**
	 * Funcionalidade respons�vel por listar todos os pedidos de uma mesa.
	 * @param numeroMesa N�mero da mesa.
	 * @return Lista de pedidos.
	 */
	public List<Pedido> listarPedidosDeUmaMesa(Integer numeroMesa);

}
