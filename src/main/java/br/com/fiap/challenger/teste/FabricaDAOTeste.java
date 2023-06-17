package br.com.fiap.challenger.teste;



import br.com.fiap.challenger.exception.DBException;
import br.com.fiap.challenger.factory.DAOFactory;
import br.com.fiap.challenger.dao.*;
import br.com.fiap.challenger.bean.*;

public class FabricaDAOTeste {

	public static void main(String[] args) {
		FabricaDAO dao = (FabricaDAO) DAOFactory.getFabricaDAO();
		
		//Cadastrar um produto
		Fabrica fabrica = new Fabrica(0,"Fabrica Brasil","46555233/0001","Tomates","América do Sul", "Brasil", "São Paulo", "São Paulo", "Av.Paulista, 222", 3, "Produção 24hs");
		try {
			dao.cadastrar(fabrica);
			System.out.println("Produto cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
}
		
	

		