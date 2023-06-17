package br.com.fiap.challenger.dao;

import java.util.List;

import br.com.fiap.challenger.bean.Institucional;
import br.com.fiap.challenger.exception.DBException;



public interface InstitucionalDAO {
	
	void cadastrar(Institucional institucional) throws DBException;
	void atualizar(Institucional institucional) throws DBException;
	void remover(int codigo) throws DBException;
	Institucional buscar(int id);
	List<Institucional> listar();
}