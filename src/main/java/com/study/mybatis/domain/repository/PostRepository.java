package com.study.mybatis.domain.repository;

import com.study.mybatis.domain.dto.request.SearchRequest;
import com.study.mybatis.domain.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Long save(Post post);

    Optional<Post> findById(Long id);

    Post update(Long id, Post updateParam);

    void delete(Long postId);

    List<Post> findAll(SearchRequest request);
}
