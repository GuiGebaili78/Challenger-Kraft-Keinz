package br.com.fiap.challenger.bean;

public class Fabrica {
	
	private int cd_fabrica;
	private String nm_fabrica;
	private String nr_cnpj;
	private String ds_produtos;
	private String ds_continente;
	private String ds_pais;
	private String ds_estado;
	private String ds_cidade;
	private String ds_endereco;
	private int nr_nivel_risco;
	private String ds_descricao;
	
	
	public Fabrica() {
		super();
	}


	public Fabrica(int cd_fabrica, String nm_fabrica, String nr_cnpj, String ds_produtos, String ds_continente,
			String ds_pais, String ds_estado, String ds_cidade, String ds_endereco, int nr_nivel_risco,
			String ds_descricao) {
		super();
		this.cd_fabrica = cd_fabrica;
		this.nm_fabrica = nm_fabrica;
		this.nr_cnpj = nr_cnpj;
		this.ds_produtos = ds_produtos;
		this.ds_continente = ds_continente;
		this.ds_pais = ds_pais;
		this.ds_estado = ds_estado;
		this.ds_cidade = ds_cidade;
		this.ds_endereco = ds_endereco;
		this.nr_nivel_risco = nr_nivel_risco;
		this.ds_descricao = ds_descricao;
	}


	public int getCd_fabrica() {
		return cd_fabrica;
	}


	public void setCd_fabrica(int cd_fabrica) {
		this.cd_fabrica = cd_fabrica;
	}


	public String getNm_fabrica() {
		return nm_fabrica;
	}


	public void setNm_fabrica(String nm_fabrica) {
		this.nm_fabrica = nm_fabrica;
	}


	public String getNr_cnpj() {
		return nr_cnpj;
	}


	public void setNr_cnpj(String nr_cnpj) {
		this.nr_cnpj = nr_cnpj;
	}


	public String getDs_produtos() {
		return ds_produtos;
	}


	public void setDs_produtos(String ds_produtos) {
		this.ds_produtos = ds_produtos;
	}


	public String getDs_continente() {
		return ds_continente;
	}


	public void setDs_continente(String ds_continente) {
		this.ds_continente = ds_continente;
	}


	public String getDs_pais() {
		return ds_pais;
	}


	public void setDs_pais(String ds_pais) {
		this.ds_pais = ds_pais;
	}


	public String getDs_estado() {
		return ds_estado;
	}


	public void setDs_estado(String ds_estado) {
		this.ds_estado = ds_estado;
	}


	public String getDs_cidade() {
		return ds_cidade;
	}


	public void setDs_cidade(String ds_cidade) {
		this.ds_cidade = ds_cidade;
	}


	public String getDs_endereco() {
		return ds_endereco;
	}


	public void setDs_endereco(String ds_endereco) {
		this.ds_endereco = ds_endereco;
	}


	public int getNr_nivel_risco() {
		return nr_nivel_risco;
	}


	public void setNr_nivel_risco(int nr_nivel_risco) {
		this.nr_nivel_risco = nr_nivel_risco;
	}


	public String getDs_descricao() {
		return ds_descricao;
	}


	public void setDs_descricao(String ds_descricao) {
		this.ds_descricao = ds_descricao;
	}




	
	
	
	
	
	
	

}
