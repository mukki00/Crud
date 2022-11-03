package com.postresql.crud.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.postresql.crud.dao.PostService;
import com.postresql.crud.model.Post;

@RestController
@RequestMapping("/")
public class PostController {
	@Autowired
	private PostService postSevice;
	private Logger logger = LoggerFactory.getLogger(PostController.class);
	
	
	@GetMapping("/get")
	public List<Post> GetPosts(@RequestParam String rows) {
		logger.info("Rows {} ",rows);
		return postSevice.getPosts();
	}
	
	@PostMapping("/save")
	public String savePost(@RequestBody Post post) {
		postSevice.savePost(post);
		return "saved";
	}
	
	@PostMapping("/saveAll")
	public String savePosts(@RequestBody List<Post> post) {
		postSevice.savePosts(post);
		return "saved";
	}
}
