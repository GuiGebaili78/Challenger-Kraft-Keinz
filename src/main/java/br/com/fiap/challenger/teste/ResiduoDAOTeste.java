package br.com.fiap.challenger.teste;



import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.factory.DAOFactory;
import br.com.fiap.challenger.dao.*;
import br.com.fiap.challenger.bean.*;

public class ResiduoDAOTeste {

	public static void main(String[] args) {
		ResiduoDAO dao = (ResiduoDAO) DAOFactory.getResiduoDAO();
		
		//Cadastrar um produto
		Residuo residuo = new Residuo(0,"Orgânico","Casca de tomate", 6545, 25000, "Material Vegetal", 1);
		try {
			dao.cadastrar(residuo);
			System.out.println("Residuo cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
}
		
	