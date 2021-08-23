package br.gov.sp.fatec.adega1.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Set;

//import javax.persistence.Basic;
import javax.persistence.Column;



@Entity
@Table(name = "aut_autorizacao")
public class Autorizacao {

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Basic(optional = false)
	@Column(name = "aut_id")
	private Long id;

  @Column(name = "aut_nome")
	private String nome;

	@ManyToMany(mappedBy = "autorizacoes", fetch = FetchType.LAZY)
	private Set<Usuario> usuarios;


	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
}