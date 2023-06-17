package br.com.fiap.challenger.dao;

import java.util.List;

import br.com.fiap.challenger.bean.Residuo;
import br.com.fiap.challenger.exception.DBException;



public interface ResiduoDAO {
	
	void cadastrar(Residuo residuo) throws DBException;
	void atualizar(Residuo residuo) throws DBException;
	void remover(int codigo) throws DBException;
	Residuo buscar(int id);
	List<Residuo> listar();
}