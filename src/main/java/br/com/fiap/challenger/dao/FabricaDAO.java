package br.com.fiap.challenger.dao;

import java.util.List;

import br.com.fiap.challenger.bean.Fabrica;
import br.com.fiap.challenger.exception.DBException;



public interface FabricaDAO {
	
	void cadastrar(Fabrica fabrica) throws DBException;
	void atualizar(Fabrica fabrica) throws DBException;
	void remover(int codigo) throws DBException;
	Fabrica buscar(int id);
	List<Fabrica> listar();
}