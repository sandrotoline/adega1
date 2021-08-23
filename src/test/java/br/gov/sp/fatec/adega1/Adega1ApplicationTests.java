package br.gov.sp.fatec.adega1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashSet;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import br.gov.sp.fatec.adega1.entity.Autorizacao;
import br.gov.sp.fatec.adega1.entity.Usuario;
import br.gov.sp.fatec.adega1.repository.AutorizacaoRepository;
import br.gov.sp.fatec.adega1.repository.UsuarioRepository;

@SpringBootTest
@Transactional
@Rollback
class Adega1ApplicationTests {

	@Autowired
	private AutorizacaoRepository autRepo;

	@Autowired
	private UsuarioRepository usuRepo;


	@Test
	void contextLoads() {
	}

	// @Test
	// void autorizacaoRepositorySaveTest(){
	// 	Autorizacao aut = new Autorizacao();
	// 	aut.setNome("Teste");
	// 	autRepo.save(aut);
	// 	assertNotNull(aut.getId());
	// }
	// @Test 
	// void autorizacaoRepositoryFindByNome(){
	// 	Autorizacao aut = new Autorizacao();
	// 	aut.setNome("Teste");
	// 	autRepo.save(aut);
	// 	assertNotNull(autRepo.findByNome("Teste"));
	// }

	
	@Test
	void usuarioRepositorySaveTest(){
		Autorizacao aut = new Autorizacao();
		aut.setNome("Teste");
		autRepo.save(aut);

		Usuario usu = new Usuario();
		usu.setNome("Sandro");
		usu.setLogin("teste");
		usu.setSenha("12345");
		usu.setAutorizacoes(new HashSet<Autorizacao>());
		usu.getAutorizacoes().add(aut);
		usuRepo.save(usu);

		assertFalse(autRepo.findByUsuariosLogin("teste").isEmpty());
	}
}
