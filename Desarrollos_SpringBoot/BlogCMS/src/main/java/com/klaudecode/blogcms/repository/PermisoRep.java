package com.klaudecode.blogcms.repository;

import java.util.List;

import com.klaudecode.blogcms.model.Permiso;

public interface PermisoRep extends BaseRep<Permiso> {
    public boolean deleteById(long idPermiso);

    public List<Permiso> findByIdGrupo(long idGrupo);
    public List<Permiso> findByNotIdGrupo(long idGrupo);
}
