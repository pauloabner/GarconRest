package br.net.abner.garcon.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Pedido")
public class Pedido {
	
	private Produto produto;
	private Integer qtd;
	@SuppressWarnings("unused")
	private Float total;
	
	public Pedido() {}
	
	public Pedido(Produto produto, Integer qtd) {
		super();
		this.produto = produto;
		this.qtd = qtd;
	}

	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	public Float getTotal() {
		return produto.getValorUnitario() * qtd;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	

}
