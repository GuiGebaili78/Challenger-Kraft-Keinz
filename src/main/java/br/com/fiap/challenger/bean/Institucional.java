package br.com.fiap.challenger.bean;

import java.sql.Date;
import java.util.Calendar;

public class Institucional {

	private int cd_institucional;
	private String nm_destinatario;
	private String nm_produto;
	private String ds_categoria;
	private int nr_quantidade;
	private Date dt_data = new Date(Calendar.getInstance().getTimeInMillis());
	private String ds_descricao;
	private int t_fabrica_cd_fabrica;
	

	public Institucional() {
		super();
	}

	public Institucional(int cd_institucional, String nm_destinatario, String nm_produto, String ds_categoria,
			int nr_quantidade, String ds_descricao, int t_fabrica_cd_fabrica) {
		super();
		this.cd_institucional = cd_institucional;
		this.nm_destinatario = nm_destinatario;
		this.nm_produto = nm_produto;
		this.ds_categoria = ds_categoria;
		this.nr_quantidade = nr_quantidade;
		this.ds_descricao = ds_descricao;
		this.t_fabrica_cd_fabrica = t_fabrica_cd_fabrica;
		
		
	}

	public int getCd_institucional() {
		return cd_institucional;
	}

	public void setCd_institucional(int cd_institucional) {
		this.cd_institucional = cd_institucional;
	}

	public String getNm_destinatario() {
		return nm_destinatario;
	}

	public void setNm_destinatario(String nm_destinatario) {
		this.nm_destinatario = nm_destinatario;
	}

	public String getNm_produto() {
		return nm_produto;
	}

	public void setNm_produto(String nm_produto) {
		this.nm_produto = nm_produto;
	}

	public String getDs_categoria() {
		return ds_categoria;
	}

	public void setDs_categoria(String ds_categoria) {
		this.ds_categoria = ds_categoria;
	}

	public int getNr_quantidade() {
		return nr_quantidade;
	}

	public void setNr_quantidade(int nr_quantidade) {
		this.nr_quantidade = nr_quantidade;
	}

	public Date getDt_data() {
		return dt_data;
	}

	public void setDt_data(Date dt_data) {
		this.dt_data = dt_data;
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
	
	

	
