package com.study.mybatis.domain.service.impl;

import com.study.mybatis.domain.dto.request.SearchRequest;
import com.study.mybatis.domain.entity.Post;
import com.study.mybatis.domain.repository.PostRepository;
import com.study.mybatis.domain.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Override
    public Long save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> findAll(SearchRequest request) {
        return postRepository.findAll(request);
    }
}
