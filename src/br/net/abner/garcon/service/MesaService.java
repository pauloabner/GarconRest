package br.net.abner.garcon.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.net.abner.garcon.model.Categoria;
import br.net.abner.garcon.model.Mesa;
@Path("/mesaService")
@Produces("application/json")
public interface MesaService {
	@GET
	@Path("/mesa/{numeroMesa}")
	public Mesa visualizarConta(@PathParam("numeroMesa") String numeroMesa);
	@GET
	@Path("/mesa/{numeroMesa}/garcon")
	public String chamarGarcon(@PathParam("numeroMesa") String numeroMesa);
	
	@GET
	@Path("/categorias")
	public List<Categoria> listarCategorias();
}
