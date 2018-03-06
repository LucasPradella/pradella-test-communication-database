package br.com.pradella.dois.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pradella.dois.domain.UsuarioDois;


/*@Repository*/
public interface DoisRepository  extends JpaRepository<UsuarioDois, Long> {
	UsuarioDois findById(Long id);
}

