package br.com.fiap.challenger.bean;

public class Fornecedor {

	private int cd_fornecedor;
	private String nm_fornecedor;
	private String nr_cnpj;
	private String ds_categoria_producao;
	private String ds_endereco;
	private String nr_telefone;
	private int nr_nivel_susten;
	private String ds_descricao;

	public Fornecedor() {
		super();
	}

	public Fornecedor(int cd_fornecedor, String nm_fornecedor, String nr_cnpj, String ds_categoria_producao,
			String ds_endereco, String nr_telefone, int nr_nivel_susten, String ds_descricao) {
		super();
		this.cd_fornecedor = cd_fornecedor;
		this.nm_fornecedor = nm_fornecedor;
		this.nr_cnpj = nr_cnpj;
		this.ds_categoria_producao = ds_categoria_producao;
		this.ds_endereco = ds_endereco;
		this.nr_telefone = nr_telefone;
		this.nr_nivel_susten = nr_nivel_susten;
		this.ds_descricao = ds_descricao;
	}

	public int getCd_fornecedor() {
		return cd_fornecedor;
	}

	public void setCd_fornecedor(int cd_fornecedor) {
		this.cd_fornecedor = cd_fornecedor;
	}

	public String getNm_fornecedor() {
		return nm_fornecedor;
	}

	public void setNm_fornecedor(String nm_fornecedor) {
		this.nm_fornecedor = nm_fornecedor;
	}

	public String getNr_cnpj() {
		return nr_cnpj;
	}

	public void setNr_cnpj(String nr_cnpj) {
		this.nr_cnpj = nr_cnpj;
	}

	public String getDs_categoria_producao() {
		return ds_categoria_producao;
	}

	public void setDs_categoria_producao(String ds_categoria_producao) {
		this.ds_categoria_producao = ds_categoria_producao;
	}

	public String getDs_endereco() {
		return ds_endereco;
	}

	public void setDs_endereco(String ds_endereco) {
		this.ds_endereco = ds_endereco;
	}

	public String getNr_telefone() {
		return nr_telefone;
	}

	public void setNr_telefone(String nr_telefone) {
		this.nr_telefone = nr_telefone;
	}

	public int getNr_nivel_susten() {
		return nr_nivel_susten;
	}

	public void setNr_nivel_susten(int nr_nivel_susten) {
		this.nr_nivel_susten = nr_nivel_susten;
	}

	public String getDs_descricao() {
		return ds_descricao;
	}

	public void setDs_descricao(String ds_descricao) {
		this.ds_descricao = ds_descricao;
	}

	

}
