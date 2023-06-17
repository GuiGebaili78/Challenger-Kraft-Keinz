package br.com.fiap.challenger.teste;



import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.factory.DAOFactory;
import br.com.fiap.challenger.dao.*;
import br.com.fiap.challenger.bean.*;

public class InsumoDAOTeste {

	public static void main(String[] args) {
		InsumoDAO dao = (InsumoDAO) DAOFactory.getInsumoDAO();
		
		//Cadastrar um produto
		Insumo insumo = new Insumo(0,"açúcar","cristal","Açucar"," ","Vegetal", 15, 8, 1, "Insumo de produção", 1, 2);
		try {
			dao.cadastrar(insumo);
			System.out.println("Insumo cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
}
		
	
