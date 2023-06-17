package br.com.fiap.challenger.dao;

import java.util.List;

import br.com.fiap.challenger.bean.Insumo;
import br.com.fiap.challenger.exception.DBException;



public interface InsumoDAO {
	
	void cadastrar(Insumo insumos) throws DBException;
	void atualizar(Insumo insumos) throws DBException;
	void remover(int codigo) throws DBException;
	Insumo buscar(int id);
	List<Insumo> listar();
}