package br.com.fiap.challenger.bean;

import java.sql.Date;

public class Produto {

	private int cd_produto;
	private String nm_produto;
	private Date dt_validade;
	private Date dt_fabrica;
	private int nr_lote;
	private String ds_ingrediente;
	private String ds_categoria;
	private String ds_embalagem;
	private String ds_descricao;
	private int t_fabrica_cd_fabrica;

	public Produto() {
		super();
	}

	public Produto(int cd_produto, String nm_produto, Date dt_validade, Date dt_fabrica, int nr_lote,
			String ds_ingrediente, String ds_categoria, String ds_embalagem, String ds_descricao,
			int t_fabrica_cd_fabrica) {
		super();
		this.cd_produto = cd_produto;
		this.nm_produto = nm_produto;
		this.dt_validade = dt_validade;
		this.dt_fabrica = dt_fabrica;
		this.nr_lote = nr_lote;
		this.ds_ingrediente = ds_ingrediente;
		this.ds_categoria = ds_categoria;
		this.ds_embalagem = ds_embalagem;
		this.ds_descricao = ds_descricao;
		this.t_fabrica_cd_fabrica = t_fabrica_cd_fabrica;
	}

	public int getCd_produto() {
		return cd_produto;
	}

	public void setCd_produto(int cd_produto) {
		this.cd_produto = cd_produto;
	}

	public String getNm_produto() {
		return nm_produto;
	}

	public void setNm_produto(String nm_produto) {
		this.nm_produto = nm_produto;
	}

	public Date getDt_validade() {
		return dt_validade;
	}

	public void setDt_validade(Date dt_validade) {
		this.dt_validade = dt_validade;
	}

	public Date getDt_fabrica() {
		return dt_fabrica;
	}

	public void setDt_fabrica(Date dt_fabrica) {
		this.dt_fabrica = dt_fabrica;
	}

	public int getNr_lote() {
		return nr_lote;
	}

	public void setNr_lote(int nr_lote) {
		this.nr_lote = nr_lote;
	}

	public String getDs_ingrediente() {
		return ds_ingrediente;
	}

	public void setDs_ingrediente(String ds_ingrediente) {
		this.ds_ingrediente = ds_ingrediente;
	}

	public String getDs_categoria() {
		return ds_categoria;
	}

	public void setDs_categoria(String ds_categoria) {
		this.ds_categoria = ds_categoria;
	}

	public String getDs_embalagem() {
		return ds_embalagem;
	}

	public void setDs_embalagem(String ds_embalagem) {
		this.ds_embalagem = ds_embalagem;
	}

	public String getDs_descricao() {
		return ds_descricao;
	}

	public void setDs_descricao(String ds_descricao) {
		this.ds_descricao = ds_descricao;
	}

	public int getT_fabrica_cd_fabrica() {
		return t_fabrica_cd_fabrica;
	}

	public void setT_fabrica_cd_fabrica(int t_fabrica_cd_fabrica) {
		this.t_fabrica_cd_fabrica = t_fabrica_cd_fabrica;
	}

}
