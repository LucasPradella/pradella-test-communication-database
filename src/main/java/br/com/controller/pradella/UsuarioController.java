package br.com.controller.pradella;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pradella.dois.domain.UsuarioDois;
import br.com.pradella.dois.repo.DoisRepository;
import br.com.pradella.um.domain.UsuarioUm;
import br.com.pradella.um.repo.UmRepository;

@RestController
public class UsuarioController {

	@Autowired
	private UmRepository umRepo;
	
	@Autowired
	private DoisRepository doisRepo;

	@Autowired
	UsuarioController(UmRepository umRepo, DoisRepository doisRepo) {
	    this.umRepo = umRepo;
	    this.doisRepo = doisRepo;
	  }

	
	
	@RequestMapping("/usuario/{id}")
	public String fooBar(@PathVariable("id") Long id) {
	    UsuarioUm um = umRepo.findById(id);
	    UsuarioDois dois = doisRepo.findById(id);

		return "Usuario um [ " + um + "] \n Usuario dois  [" + dois + " ]";
	}

}
