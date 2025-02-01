package com.study.mybatis.domain.mapper;

import com.study.mybatis.domain.dto.request.SearchRequest;
import com.study.mybatis.domain.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {
    void save(Post post);

    Optional<Post> findById(Long id);

    void updatePost(@Param("id") Long id, @Param("updateParam") Post updateParam);

    void deletePost(Long postId);

    List<Post> findAll(SearchRequest request);
}
