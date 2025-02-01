package com.study.mybatis.domain.controller;

import com.study.mybatis.domain.dto.request.SearchRequest;
import com.study.mybatis.domain.entity.Post;
import com.study.mybatis.domain.service.PostService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public ResponseEntity<Long> save(@RequestBody Post post) {
        return ResponseEntity.ok(postService.save(post));
    }

    @GetMapping
    public ResponseEntity<List<Post>> findAll(SearchRequest request) {
        return ResponseEntity.ok(postService.findAll(new SearchRequest()));
    }
}
