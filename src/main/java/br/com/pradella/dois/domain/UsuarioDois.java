package br.com.pradella.dois.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "usuarioDois")
public class UsuarioDois {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dois_id_seq")
	@SequenceGenerator(name = "dois_id_seq", sequenceName = "dois_id_seq", allocationSize = 1)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME_DOIS")
	private String nomeDois;

	
	UsuarioDois() {
	}

	
	public Long getId() {
		return id;
	} 
	
	public String getNomeDois() {
		return nomeDois;
	}

	public void setNomeDois(String nomeDois) {
		this.nomeDois = nomeDois;
	}

}
