package com.sistema.exame.service;

import com.sistema.exame.entity.Usuario;
import com.sistema.exame.entity.UsuarioRole;
import com.sistema.exame.repository.RoleRepository;
import com.sistema.exame.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RoleRepository roleRepository;

    public Usuario salvar(Usuario usuario, Set<UsuarioRole> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if (usuarioLocal != null) {
            System.out.println("Usupario já cadastrado!");
            throw new Exception("Usuário já cadastrado!");
        }
        else {
            for (UsuarioRole userRole: usuarioRoles){
                roleRepository.save(userRole.getRole());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    public Usuario read(String username){
        return usuarioRepository.findByUsername(username);
    }

    public void delete(Long usuarioId){
        usuarioRepository.deleteById(usuarioId);
    }
}
