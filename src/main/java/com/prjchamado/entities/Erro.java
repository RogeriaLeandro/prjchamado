package com.prjchamado.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Erro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idErro;
	private String erro;
	
	public Erro() {
		
	}

	public Erro(Integer idErro, String erro) {
		super();
		this.idErro = idErro;
		this.erro = erro;
	}

	public Integer getIdErro() {
		return idErro;
	}

	public void setIdErro(Integer idErro) {
		this.idErro = idErro;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idErro == null) ? 0 : idErro.hashCode());
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
		Erro other = (Erro) obj;
		if (idErro == null) {
			if (other.idErro != null)
				return false;
		} else if (!idErro.equals(other.idErro))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Erro [idErro=" + idErro + ", erro=" + erro + "]";
	}
	
	
}
