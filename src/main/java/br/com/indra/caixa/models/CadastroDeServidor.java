package br.com.indra.caixa.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroDeServidor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ip;
	private String tipoDeServidor;
	private String hostName;
	private String tipoDeAplicacao;

	public CadastroDeServidor() {
		
	}

	public CadastroDeServidor(Long id, String ip, String tipoDeServidor, String hostName, String tipoDeAplicacao) {
		super();
		this.id = id;
		this.ip = ip;
		this.tipoDeServidor = tipoDeServidor;
		this.hostName = hostName;
		this.tipoDeAplicacao = tipoDeAplicacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTipoDeServidor() {
		return tipoDeServidor;
	}

	public void setTipoDeServidor(String tipoDeServidor) {
		this.tipoDeServidor = tipoDeServidor;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getTipoDeAplicacao() {
		return tipoDeAplicacao;
	}

	public void setTipoDeAplicacao(String tipoDeAplicacao) {
		this.tipoDeAplicacao = tipoDeAplicacao;
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
		CadastroDeServidor other = (CadastroDeServidor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
