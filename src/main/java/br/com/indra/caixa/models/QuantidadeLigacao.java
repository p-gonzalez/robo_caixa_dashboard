package br.com.indra.caixa.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuantidadeLigacao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long quantidadePorDia;
	private Long quantidadePorhora;
	private Long quantidadePorMinuto;
	
	
	public QuantidadeLigacao() {
		
	}


	public QuantidadeLigacao(Long id, Long quantidadePorDia, Long quantidadePorhora, Long quantidadePorMinuto) {
		super();
		this.id = id;
		this.quantidadePorDia = quantidadePorDia;
		this.quantidadePorhora = quantidadePorhora;
		this.quantidadePorMinuto = quantidadePorMinuto;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getQuantidadePorDia() {
		return quantidadePorDia;
	}


	public void setQuantidadePorDia(Long quantidadePorDia) {
		this.quantidadePorDia = quantidadePorDia;
	}


	public Long getQuantidadePorhora() {
		return quantidadePorhora;
	}


	public void setQuantidadePorhora(Long quantidadePorhora) {
		this.quantidadePorhora = quantidadePorhora;
	}


	public Long getQuantidadePorMinuto() {
		return quantidadePorMinuto;
	}


	public void setQuantidadePorMinuto(Long quantidadePorMinuto) {
		this.quantidadePorMinuto = quantidadePorMinuto;
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
		QuantidadeLigacao other = (QuantidadeLigacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
