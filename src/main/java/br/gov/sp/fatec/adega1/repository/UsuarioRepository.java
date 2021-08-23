package br.gov.sp.fatec.adega1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.adega1.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    

}
