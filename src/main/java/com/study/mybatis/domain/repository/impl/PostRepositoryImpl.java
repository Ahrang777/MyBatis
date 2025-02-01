package com.study.mybatis.domain.repository.impl;

import com.study.mybatis.domain.dto.request.SearchRequest;
import com.study.mybatis.domain.entity.Post;
import com.study.mybatis.domain.mapper.PostMapper;
import com.study.mybatis.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepository {
    private final PostMapper postMapper;


    @Override
    public Long save(Post post) {
        post.setCreateDate(LocalDateTime.now());
        post.setModifiedDate(LocalDateTime.now());
        postMapper.save(post);
        return post.getId();
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postMapper.findById(id);
    }

    @Override
    public Post update(Long id, Post updateParam) {
        updateParam.setModifiedDate(LocalDateTime.now());
        postMapper.updatePost(id, updateParam);
        return findById(id).get();
    }

    @Override
    public void delete(Long postId) {
        postMapper.deletePost(postId);
    }

    @Override
    public List<Post> findAll(SearchRequest request) {
        return postMapper.findAll(request);
    }
}
