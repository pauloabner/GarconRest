package br.net.abner.garcon.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Categoria")
public class Categoria {
	
	private Integer id;
	private String descricao;
	
	private List<Produto> produtos;
	
	public Categoria(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
