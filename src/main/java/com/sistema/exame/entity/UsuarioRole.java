package com.sistema.exame.entity;

import jakarta.persistence.*;

@Entity
public class UsuarioRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRole;
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;
    @ManyToOne
    private Role role;

    public UsuarioRole() {
    }

    public Long getUsuarioRole() {
        return usuarioRole;
    }

    public void setUsuarioRole(Long usuarioRole) {
        this.usuarioRole = usuarioRole;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
