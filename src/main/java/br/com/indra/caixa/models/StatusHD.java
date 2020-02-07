package br.com.indra.caixa.models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class StatusHD implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double espacoVazio;
	private double espacoUsado;
	private double espacoTotal;

	public StatusHD() {

	}

	public StatusHD(Long id, double espacoVazio, double espacoUsado, double espacoTotal) {
		super();
		this.id = id;
		this.espacoVazio = espacoVazio;
		this.espacoUsado = espacoUsado;
		this.espacoTotal = espacoTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getEspacoVazio() {
		return espacoVazio;
	}

	public void setEspacoVazio(double espacoVazio) {
		this.espacoVazio = espacoVazio;
	}

	public double getEspacoUsado() {
		return espacoUsado;
	}

	public void setEspacoUsado(double espacoUsado) {
		this.espacoUsado = espacoUsado;
	}

	public double getEspacoTotal() {
		return espacoTotal;
	}

	public void setEspacoTotal(double espacoTotal) {
		this.espacoTotal = espacoTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		StatusHD other = (StatusHD) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
