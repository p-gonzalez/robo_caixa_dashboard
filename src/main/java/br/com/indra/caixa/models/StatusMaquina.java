package br.com.indra.caixa.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StatusMaquina implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long processamento;
	private Long PingAtividade;
	private Long statusJVM;
	
	public StatusMaquina() {
		
	}

	public StatusMaquina(Long id, Long processamento, Long pingAtividade, Long statusJVM) {
		super();
		this.id = id;
		this.processamento = processamento;
		PingAtividade = pingAtividade;
		this.statusJVM = statusJVM;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProcessamento() {
		return processamento;
	}

	public void setProcessamento(Long processamento) {
		this.processamento = processamento;
	}

	public Long getPingAtividade() {
		return PingAtividade;
	}

	public void setPingAtividade(Long pingAtividade) {
		PingAtividade = pingAtividade;
	}

	public Long getStatusJVM() {
		return statusJVM;
	}

	public void setStatusJVM(Long statusJVM) {
		this.statusJVM = statusJVM;
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
		StatusMaquina other = (StatusMaquina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
