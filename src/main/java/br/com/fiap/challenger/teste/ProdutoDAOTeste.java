package br.com.fiap.challenger.teste;



import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.factory.DAOFactory;
import br.com.fiap.challenger.dao.*;

import java.sql.Date;
import java.util.Calendar;

import br.com.fiap.challenger.bean.*;

public class ProdutoDAOTeste {

	public static void main(String[] args) {
		ProdutoDAO dao = (ProdutoDAO) DAOFactory.getProdutoDAO();
		
		//Cadastrar um produto
		Date dt_vencimento = new Date(Calendar.getInstance().getTimeInMillis());
		Date dt_fabrica = new Date(Calendar.getInstance().getTimeInMillis());
		Produto produto = new Produto(0,"Katchup",dt_vencimento,dt_fabrica,196545, "Tomate,açúcar, vinagre, sal", "molhos", "plastico 2", " ", 2);
		try {
			dao.cadastrar(produto);
			System.out.println("Produto cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
}
		
	
