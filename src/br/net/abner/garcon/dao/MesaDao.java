package br.net.abner.garcon.dao;

public interface MesaDao {
	/**
	 * Medoto responsavel por informar o numero da mesa atraves de um token.
	 * Essa funcionalidade é usada caso o fornecedor do serviço queira uma segurança maior,
	 * escondendo do usuário o número da mesa
	 * @param token Token relacionado a mesa
	 * @return Retona um número correspondente á mesa.
	 */
	public Integer obtemNumMesa(String token);
}
