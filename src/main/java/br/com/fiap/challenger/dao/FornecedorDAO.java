package br.com.fiap.challenger.dao;

import br.com.fiap.challenger.bean.Fornecedor;
import br.com.fiap.challenger.exception.DBException;



public interface FornecedorDAO {
	
	void cadastrar(Fornecedor fornecedor) throws DBException;

}