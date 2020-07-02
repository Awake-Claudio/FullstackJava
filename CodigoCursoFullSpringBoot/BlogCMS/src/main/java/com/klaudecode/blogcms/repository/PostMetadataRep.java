package com.klaudecode.blogcms.repository;

import java.util.List;

import com.klaudecode.blogcms.model.PostMetadata;

public interface PostMetadataRep extends BaseRep<PostMetadata> {
    public List<PostMetadata> findByIdPost(long idPost);
}
