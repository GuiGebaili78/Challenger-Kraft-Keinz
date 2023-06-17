package br.com.fiap.challenger.bean;

import java.sql.Date;
import java.util.Calendar;


public class Insumo {
	
	private int cd_insumo;
	private String nm_insumo;
	private String ds_produto;
	private String ds_categoria;
	private String ds_subcategoria;
	private String ds_origem;
	private int ds_unid_medida;
	private double qtd_consumo;
	private double qtd_residuo;
	private Date dt_data = new Date(Calendar.getInstance().getTimeInMillis());
	private String ds_descricao;
	private int t_fornecedor_cd_fornecedor;	
	private int t_fabrica_cd_fabrica;
	
	
	public Insumo() {
		super();
	}


	public Insumo(int cd_insumo, String nm_insumo, String ds_produto, String ds_categoria, String ds_subcategoria,
			String ds_origem, int ds_unid_medida, double qtd_consumo, double qtd_residuo, String ds_descricao, int t_fornecedor_cd_fornecedor, int t_fabrica_cd_fabrica) {
		super();
		this.cd_insumo = cd_insumo;
		this.nm_insumo = nm_insumo;
		this.ds_produto = ds_produto;
		this.ds_categoria = ds_categoria;
		this.ds_subcategoria = ds_subcategoria;
		this.ds_origem = ds_origem;
		this.ds_unid_medida = ds_unid_medida;
		this.qtd_consumo = qtd_consumo;
		this.qtd_residuo = qtd_residuo;
		this.ds_descricao = ds_descricao;
		this.t_fornecedor_cd_fornecedor = t_fornecedor_cd_fornecedor;
		this.t_fabrica_cd_fabrica = t_fabrica_cd_fabrica;
		
		
		
		
		
	}


	public int getCd_insumo() {
		return cd_insumo;
	}


	public void setCd_insumo(int cd_insumo) {
		this.cd_insumo = cd_insumo;
	}


	public String getNm_insumo() {
		return nm_insumo;
	}


	public void setNm_insumo(String nm_insumo) {
		this.nm_insumo = nm_insumo;
	}


	public String getDs_produto() {
		return ds_produto;
	}


	public void setDs_produto(String ds_produto) {
		this.ds_produto = ds_produto;
	}


	public String getDs_categoria() {
		return ds_categoria;
	}


	public void setDs_categoria(String ds_categoria) {
		this.ds_categoria = ds_categoria;
	}


	public String getDs_subcategoria() {
		return ds_subcategoria;
	}


	public void setDs_subcategoria(String ds_subcategoria) {
		this.ds_subcategoria = ds_subcategoria;
	}


	public String getDs_origem() {
		return ds_origem;
	}


	public void setDs_origem(String ds_origem) {
		this.ds_origem = ds_origem;
	}


	public int getDs_unid_medida() {
		return ds_unid_medida;
	}


	public void setDs_unid_medida(int ds_unid_medida) {
		this.ds_unid_medida = ds_unid_medida;
	}


	public double getQtd_consumo() {
		return qtd_consumo;
	}


	public void setQtd_consumo(double qtd_consumo) {
		this.qtd_consumo = qtd_consumo;
	}


	public double getQtd_residuo() {
		return qtd_residuo;
	}


	public void setQtd_residuo(double qtd_residuo) {
		this.qtd_residuo = qtd_residuo;
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


	public int getT_fornecedor_cd_fornecedor() {
		return t_fornecedor_cd_fornecedor;
	}


	public void setT_fornecedor_cd_fornecedor(int t_fornecedor_cd_fornecedor) {
		this.t_fornecedor_cd_fornecedor = t_fornecedor_cd_fornecedor;
	}


	public int getT_fabrica_cd_fabrica() {
		return t_fabrica_cd_fabrica;
	}


	public void setT_fabrica_cd_fabrica(int t_fabrica_cd_fabrica) {
		this.t_fabrica_cd_fabrica = t_fabrica_cd_fabrica;
	}
	
	
	
	
	
	
	
	
	

}
