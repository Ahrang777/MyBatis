package com.study.mybatis.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"createDate", "modifiedDate"})
@NoArgsConstructor
public class Post {
    private Long id;
    private String writerId;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;
    private Long views;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.views = 0L;
    }

    public Post(String writerId, String title, String content) {
        this.writerId = writerId;
        this.title = title;
        this.content = content;
        this.views = 0L;
    }
}
