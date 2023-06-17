package br.com.fiap.challenger.teste;



import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.factory.DAOFactory;
import br.com.fiap.challenger.dao.*;
import br.com.fiap.challenger.bean.*;

public class FornecedorDAOTeste {

	public static void main(String[] args) {
		FornecedorDAO dao = (FornecedorDAO) DAOFactory.getFornecedorDAO();
		
		//Cadastrar um produto
		Fornecedor fornecedor = new Fornecedor(0,"Fazenda do João","46.555.236/0001-73","Vegetais","Estrada 3 Campinas", "11 98985265", 8, "Produção 24hs");
		try {
			dao.cadastrar(fornecedor);
			System.out.println("Fornecedor cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
}
		
	
