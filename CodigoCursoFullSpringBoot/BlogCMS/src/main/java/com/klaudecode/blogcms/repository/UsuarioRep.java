package com.klaudecode.blogcms.repository;

import com.klaudecode.blogcms.model.Usuario;

public interface UsuarioRep extends BaseRep<Usuario> {
    public Usuario findByCorreo(String correo);
}
