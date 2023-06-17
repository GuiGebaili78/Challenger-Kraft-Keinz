package br.com.fiap.challenger.dao;

import java.util.List;

import br.com.fiap.challenger.bean.Produto;
import br.com.fiap.challenger.exception.DBException;



public interface ProdutoDAO {
	
	void cadastrar(Produto produtos) throws DBException;
	void atualizar(Produto produtos) throws DBException;
	void remover(int codigo) throws DBException;
	Produto buscar(int id);
	List<Produto> listar();
}