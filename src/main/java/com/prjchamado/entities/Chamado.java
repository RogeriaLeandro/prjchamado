package com.prjchamado.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chamado implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	private String cpfCliente;
	private String numSerie;
	private String descProduto;
	private String descReparo;
	private Date dataAberturaReparo;
	private Erro codErro;
	private Andamento andamento;
	private Status status;
	
	public Chamado() {
		
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public String getDescReparo() {
		return descReparo;
	}

	public void setDescReparo(String descReparo) {
		this.descReparo = descReparo;
	}

	public Date getDataAberturaReparo() {
		return dataAberturaReparo;
	}

	public void setDataAberturaReparo(Date dataAberturaReparo) {
		this.dataAberturaReparo = dataAberturaReparo;
	}

	public Erro getCodErro() {
		return codErro;
	}

	public void setCodErro(Erro codErro) {
		this.codErro = codErro;
	}

	public Andamento getAndamento() {
		return andamento;
	}

	public void setAndamento(Andamento andamento) {
		this.andamento = andamento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfCliente == null) ? 0 : cpfCliente.hashCode());
		result = prime * result + ((numSerie == null) ? 0 : numSerie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		if (cpfCliente == null) {
			if (other.cpfCliente != null)
				return false;
		} else if (!cpfCliente.equals(other.cpfCliente))
			return false;
		if (numSerie == null) {
			if (other.numSerie != null)
				return false;
		} else if (!numSerie.equals(other.numSerie))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chamado [cpfCliente=" + cpfCliente + ", numSerie=" + numSerie + ", descProduto=" + descProduto
				+ ", descReparo=" + descReparo + ", dataAberturaReparo=" + dataAberturaReparo + ", codErro=" + codErro
				+ ", andamento=" + andamento + ", status=" + status + "]";
	}
	
	
	
}
