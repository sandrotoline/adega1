package br.gov.sp.fatec.adega1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Basic;
import javax.persistence.Column;



@Entity
@Table(name = "aut_autorizacao")
public class Autorizacao {

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "aut_id")
	private Integer autId;

  @Column(name = "aut_nome")
	private String autNome;

}