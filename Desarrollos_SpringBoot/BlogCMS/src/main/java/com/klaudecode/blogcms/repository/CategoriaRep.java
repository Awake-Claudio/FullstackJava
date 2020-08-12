package com.klaudecode.blogcms.repository;

import com.klaudecode.blogcms.model.Categoria;

public interface CategoriaRep extends BaseRep<Categoria> {
    public boolean deleteById(long id);
}
