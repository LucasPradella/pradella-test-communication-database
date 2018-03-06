package br.com.pradella.um.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pradella.um.domain.UsuarioUm;



/*@Repository*/
public interface UmRepository extends JpaRepository<UsuarioUm, Long> {
	UsuarioUm findById(Long id); 
  
}