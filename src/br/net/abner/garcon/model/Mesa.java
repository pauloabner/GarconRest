package br.net.abner.garcon.model;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Mesa")
public class Mesa {
	private Integer numeroMesa;
	private String conta;
	private String obs = "Observação";
	private Collection<Pedido> pedidos;
	
	public Mesa() {	}
	public Mesa(Integer numeroMesa, String conta, Collection<Pedido> pedidos) {
		super();
		this.numeroMesa = numeroMesa;
		this.conta = conta;
		this.pedidos = pedidos;
	}
	public Integer getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Collection<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(Collection<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}
