package br.net.abner.garcon.service.impl;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.net.abner.garcon.dao.CategoriaDao;
import br.net.abner.garcon.dao.MesaDao;
import br.net.abner.garcon.dao.PedidosDao;
import br.net.abner.garcon.model.Categoria;
import br.net.abner.garcon.model.Mesa;
import br.net.abner.garcon.model.Pedido;
import br.net.abner.garcon.service.MesaService;
import br.net.abner.garcon.spring.Container;

public class MesaServiceImpl implements MesaService {
	PedidosDao pedidosDao = (PedidosDao) Container.getInstancia().getBean("pedidosDao");
	MesaDao mesaDao = (MesaDao) Container.getInstancia().getBean("mesaDao");
	CategoriaDao categoriaDao = (CategoriaDao) Container.getInstancia().getBean("categoriaDao");
	
	@Override
	@GET
	@Path("/mesa/{numeroMesa}")
	public Mesa visualizarConta(@PathParam("numeroMesa") String tokenMesa) {
		StringBuilder sb = new StringBuilder();

		sb.append("\t\tBurger King\n");
		sb.append("BGNE REST. E COM. DE ALIM. SA*AV WASHINTON\n");
		sb.append("SOARES, 433, SUC 413 EDSON QUEIROZ FORT-CE\n");
		sb.append("-------------------------------------------\n");
		sb.append("\t\tCOMANDA\n");
		sb.append("-------------------------------------------\n");
		sb.append("ITEM CODIGO DESCRIACAO QTD UN ITEM (R$)\n");
		sb.append("-------------------------------------------\n");
		Integer numeroMesa = mesaDao.obtemNumMesa(tokenMesa);
		Collection<Pedido> pedidos = pedidosDao.listarPedidosDeUmaMesa(numeroMesa);
		int i = 0;
		float total = 0;
		if(pedidos != null){
			for (Pedido pedido : pedidos) {
				sb.append(String.format("%s %s %s %sUN T1\t %s\n", i++, pedido
						.getProduto().getCodigo(), pedido.getProduto()
						.getDescricao(), pedido.getQtd(), pedido.getTotal()));
				total += pedido.getTotal();
			}
		}else{
			sb.append("\t\tMESA NAO ENCONTRADA\n");
		}
		sb.append("-------------------------------------------\n");
		sb.append("TOTAL \t\t\t\t " + total + "\n");
		Mesa mesa = new Mesa(numeroMesa, sb.toString(), pedidos);
		return mesa;
	}


	@Override
	@GET
	@Path("/mesa/{numeroMesa}/garcon")
	public String chamarGarcon(@PathParam("numeroMesa") String numeroMesa) {
		System.out.println("Mesa "+mesaDao.obtemNumMesa(numeroMesa)+" está solicitando o garçon.");	
		return "Mesa "+numeroMesa+" está solicitando o garçon.";
	}


	@Override
	@GET
	@Path("/categorias")
	public List<Categoria> listarCategorias() {		
		return categoriaDao.listarCategorias();
	}

}
