package com.postresql.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="post")
public class Post {
	
	@Id
	@GeneratedValue
	private int id;
	private String post;
//	public Post() {
//		
//	}
//	public Post(int id, String post) {
//		this.id = id;
//		this.post =post;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public void setPost(String post) {
//		this.post = post;
//	}
//	public String getPost() {
//		return post;
//	}
//	@Override
//	public String toString() {
//		return "Post : "+post;
//	}
	
}
