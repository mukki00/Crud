package com.postresql.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.postresql.crud.model.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
