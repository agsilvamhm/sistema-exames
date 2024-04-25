package com.sistema.exame.controller;

import com.sistema.exame.entity.Role;
import com.sistema.exame.entity.Usuario;
import com.sistema.exame.entity.UsuarioRole;
import com.sistema.exame.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario salvarUsuario(@RequestBody Usuario usuario) throws Exception{
        usuario.setPerfil("default.png");
        Set<UsuarioRole> roles = new HashSet<>();
        Role role = new Role();
        role.setId(2L);
        role.setNome("NORMAL");

        UsuarioRole usuarioRole = new UsuarioRole();
        usuarioRole.setUsuario(usuario);
        usuarioRole.setRole(role);

        return usuarioService.salvar(usuario, roles);
    }

    @GetMapping("/{userName}")
    public Usuario read(@PathVariable("userName") String userName){
        return usuarioService.read(userName);
    }

    @DeleteMapping("/{usuarioId}")
    public void delete(@PathVariable("usuarioId") Long usuarioId){
       usuarioService.delete(usuarioId);
    }
}