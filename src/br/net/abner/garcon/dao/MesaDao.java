package br.net.abner.garcon.dao;

public interface MesaDao {
	/**
	 * Medoto responsavel por informar o numero da mesa atraves de um token.
	 * Essa funcionalidade � usada caso o fornecedor do servi�o queira uma seguran�a maior,
	 * escondendo do usu�rio o n�mero da mesa
	 * @param token Token relacionado a mesa
	 * @return Retona um n�mero correspondente � mesa.
	 */
	public Integer obtemNumMesa(String token);
}
