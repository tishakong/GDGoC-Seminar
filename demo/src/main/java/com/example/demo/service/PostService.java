package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> getAllPosts() {
        return repository.findAll();
    }

    public void savePost(Post post) {
        repository.save(post);
    }
}
