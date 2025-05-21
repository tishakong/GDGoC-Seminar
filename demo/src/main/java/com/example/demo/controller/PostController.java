package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "서버가 작동 중입니다.";
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return service.getAllPosts();
    }

    @PostMapping("/posts")
    public String createPost(@RequestBody Post post) {
        service.savePost(post);
        return "ok";
    }
}
