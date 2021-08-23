package br.gov.sp.fatec.adega1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.adega1.entity.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long>{
  
    public Autorizacao findByNome(String nome);

    public List<Autorizacao> findByUsuariosLogin(String usuario);
}
