package com.sistema.exame;

import com.sistema.exame.entity.Role;
import com.sistema.exame.entity.Usuario;
import com.sistema.exame.entity.UsuarioRole;
import com.sistema.exame.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class SistemaExameBackendApplication implements CommandLineRunner {
//	@Autowired
//	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExameBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	Usuario usuario = new Usuario();
	//	usuario.setNome("Adalberto Gonçalves");
	//	usuario.setUsername("adalberto.silva");
	//	usuario.setPassword("123456");
	//	usuario.setEmail("agsilva.mhm@gmail.com");
	//	usuario.setTelefone("83999752200");
	//	usuario.setPerfil("foto.png");
//
//		Role role = new Role();
//		role.setId(1L);
//		role.setNome("Admin");
//
//		Set<UsuarioRole> usuarioRoles = new HashSet<>();
//		UsuarioRole usuarioRole = new UsuarioRole();
//		usuarioRole.setRole(role);
//		usuarioRole.setUsuario(usuario);
//		usuarioRoles.add(usuarioRole);

//		Usuario usuarioSalvo = usuarioService.salvar(usuario, usuarioRoles);
//		System.out.println(usuarioSalvo.getUsername());
	}
}
