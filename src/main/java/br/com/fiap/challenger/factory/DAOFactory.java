package br.com.fiap.challenger.factory;

import br.com.fiap.challenger.dao.FabricaDAO;
import br.com.fiap.challenger.dao.impl.OracleFabricaDAO;
import br.com.fiap.challenger.dao.FornecedorDAO;
import br.com.fiap.challenger.dao.impl.OracleFornecedorDAO;
import br.com.fiap.challenger.dao.InstitucionalDAO;
import br.com.fiap.challenger.dao.impl.OracleInstitucionalDAO;
import br.com.fiap.challenger.dao.InsumoDAO;
import br.com.fiap.challenger.dao.impl.OracleInsumoDAO;
import br.com.fiap.challenger.dao.ProdutoDAO;
import br.com.fiap.challenger.dao.impl.OracleProdutoDAO;
import br.com.fiap.challenger.dao.ResiduoDAO;
import br.com.fiap.challenger.dao.impl.OracleResiduoDAO;

public class DAOFactory {

	public static FabricaDAO getFabricaDAO() {
		return new OracleFabricaDAO();
	}
	public static FornecedorDAO getFornecedorDAO() {
		return new OracleFornecedorDAO();
	}
	public static InstitucionalDAO getInstitucionalDAO() {
		return new OracleInstitucionalDAO();
	}
	public static InsumoDAO getInsumoDAO() {
		return new OracleInsumoDAO();
	}
	public static ProdutoDAO getProdutoDAO() {
		return new OracleProdutoDAO();
	}
	public static ResiduoDAO getResiduoDAO() {
		return new OracleResiduoDAO();
	}



}