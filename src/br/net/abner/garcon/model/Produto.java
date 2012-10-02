package br.net.abner.garcon.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Produto")
public class Produto {
	
	private String descricao;
	private float valorUnitario;
	private Integer codigo;
	
	public Produto() {}
	public Produto(String descricao, float valorUnitario, Integer codigo) {
		super();
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
