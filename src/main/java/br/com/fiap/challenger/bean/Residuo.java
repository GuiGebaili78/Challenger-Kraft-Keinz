package br.com.fiap.challenger.bean;

import java.sql.Date;
import java.util.Calendar;

public class Residuo {

	private int cd_residuo;
	private String ds_categoria;
	private String ds_carecteristica;
	private int nr_lote;
	private Date data = new Date(Calendar.getInstance().getTimeInMillis());
	private double nr_quantidade;
	private String ds_descricao;
	private int t_produtos_cd_produto;

	public Residuo() {
		super();
	}

	public Residuo(int cd_residuo, String ds_categoria, String ds_carecteristica, int nr_lote, double nr_quantidade, String ds_descricao, int t_produtos_cd_produto) {
		super();
		this.cd_residuo = cd_residuo;
		this.ds_categoria = ds_categoria;
		this.ds_carecteristica = ds_carecteristica;
		this.nr_lote = nr_lote;
		this.nr_quantidade = nr_quantidade;
		this.ds_descricao = ds_descricao;
		this.t_produtos_cd_produto = t_produtos_cd_produto;
		
		
	}

	public int getCd_residuo() {
		return cd_residuo;
	}

	public void setCd_residuo(int cd_residuo) {
		this.cd_residuo = cd_residuo;
	}

	public String getDs_categoria() {
		return ds_categoria;
	}

	public void setDs_categoria(String ds_categoria) {
		this.ds_categoria = ds_categoria;
	}

	public String getDs_carecteristica() {
		return ds_carecteristica;
	}

	public void setDs_carecteristica(String ds_carecteristica) {
		this.ds_carecteristica = ds_carecteristica;
	}

	public int getNr_lote() {
		return nr_lote;
	}

	public void setNr_lote(int nr_lote) {
		this.nr_lote = nr_lote;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getNr_quantidade() {
		return nr_quantidade;
	}

	public void setNr_quantidade(double nr_quantidade) {
		this.nr_quantidade = nr_quantidade;
	}

	public String getDs_descricao() {
		return ds_descricao;
	}

	public void setDs_descricao(String ds_descricao) {
		this.ds_descricao = ds_descricao;
	}

	public int getT_produtos_cd_produto() {
		return t_produtos_cd_produto;
	}

	public void setT_produtos_cd_produto(int t_produtos_cd_produto) {
		this.t_produtos_cd_produto = t_produtos_cd_produto;
	}
}

	