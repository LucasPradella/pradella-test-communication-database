package br.com.pradella.um.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "usuarioUm")
public class UsuarioUm {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "um_id_seq")
	@SequenceGenerator(name = "um_id_seq", sequenceName = "um_id_seq", allocationSize = 1)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME_UM")
	private String nomeUm;

	
	
	
	
		
	UsuarioUm() {}

	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUm() {
		return nomeUm;
	}

	public void setNomeUm(String nomeUm) {
		this.nomeUm = nomeUm;
	}

	
	

}
