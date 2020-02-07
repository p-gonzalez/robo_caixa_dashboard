package br.com.indra.caixa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.indra.caixa.models.CadastroDeServidor;
import br.com.indra.caixa.services.CadastroDeServidorService;

@RestController
@RequestMapping(value="/cadastroDeServidores")
public class CadastroDeServidorResource {
	
	@Autowired
	private CadastroDeServidorService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> finder(@PathVariable Long id){
		CadastroDeServidor obj = service.finder(id);
		return ResponseEntity.ok().body(obj);
		
	}
	

}
