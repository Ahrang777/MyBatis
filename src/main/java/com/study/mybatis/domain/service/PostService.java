package com.study.mybatis.domain.service;

import com.study.mybatis.domain.dto.request.SearchRequest;
import com.study.mybatis.domain.entity.Post;

import java.util.List;

public interface PostService {
    Long save(Post post);

    List<Post> findAll(SearchRequest request);
}
