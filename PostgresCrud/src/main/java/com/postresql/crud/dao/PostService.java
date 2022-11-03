package com.postresql.crud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postresql.crud.model.Post;
@Service
public class PostService {

	@Autowired
	private PostRepository postRepo;
	
	public void savePost(Post post) {
		postRepo.save(post);
	}
	public void savePosts(List<Post> posts) {
		postRepo.saveAll(posts);
	}
	public List<Post> getPosts(){
		return (List<Post>) postRepo.findAll();
	}
}
