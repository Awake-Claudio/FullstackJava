package com.klaudecode.blogcms.repository;

import com.klaudecode.blogcms.model.Post;

public interface PostRep extends BaseRep<Post> {
    public Post findOnSave(Post post);
    public Post findLast();
}
