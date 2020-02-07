package br.com.indra.caixa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.indra.caixa.models.CadastroDeServidor;
import br.com.indra.caixa.repositories.CadastroDeServidorRepository;

@Service
public class CadastroDeServidorService {
	
	@Autowired
	private CadastroDeServidorRepository repo;
	
	public CadastroDeServidor finder(Long id) {
		Optional<CadastroDeServidor> obj = repo.findById(id);
		return null;
		//return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + "Host Name: "+ CadastroDeServidor.class.getName()));
	}
	
}
