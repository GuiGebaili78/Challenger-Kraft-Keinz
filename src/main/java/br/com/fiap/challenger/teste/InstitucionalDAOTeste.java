package br.com.fiap.challenger.teste;



import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.factory.DAOFactory;
import br.com.fiap.challenger.dao.*;
import br.com.fiap.challenger.bean.*;



public class InstitucionalDAOTeste {

	public static void main(String[] args) {
		InstitucionalDAO dao = (InstitucionalDAO) DAOFactory.getInstitucionalDAO();
		
		
		//Cadastrar um produto
		Institucional institucional = new Institucional(0,"Ong Criança Feliz","Cesta Básica","Alimento",10, "Cesta Básica Carrefour", 2);
		try {
			dao.cadastrar(institucional);
			System.out.println("Institucional cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
}
		
	