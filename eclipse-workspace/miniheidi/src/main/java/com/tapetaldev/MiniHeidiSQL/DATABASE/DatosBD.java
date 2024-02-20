package com.tapetaldev.MiniHeidiSQL.DATABASE;

import java.io.Serializable;

public class DatosBD implements Serializable{
	private String bdserver;
	private String port;
	private String usuario;
	private String contra;
	
	public DatosBD() {
		super();
		this.bdserver = bdserver;
		this.port = port;
		this.usuario = usuario;
		this.contra = contra;
	}

	public String getBdserver() {
		return bdserver;
	}

	public void setBdserver(String bdserver) {
		this.bdserver = bdserver;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	@Override
	public String toString() {
		return "DatosBD [bdserver= " + bdserver + ", port= " + port + ", usuario= " + usuario
				+ ", contra= " + contra + "]";
	}
	
	
	
	
}
