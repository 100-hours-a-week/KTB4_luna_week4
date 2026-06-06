package com.example.community.post.factory;

import com.example.community.post.dto.PostRequestDTO;
import com.example.community.post.entity.Post;
import com.example.community.post.entity.PostStatus;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PostFactory {
    public Post create(Long postId, Long authorId, PostRequestDTO requestDTO) {
        return new Post(
                postId,
                authorId,
                requestDTO.getTitle(),
                requestDTO.getPostBody(),
                requestDTO.getPostImageUrl(),
                LocalDateTime.now(),
                false,
                null,
                1,
                PostStatus.ACTIVE,
                0,
                0,
                0
        );
    }

    public Post create(Long postId, long authorId, @NotBlank String title, @NotBlank String postBody, String postImageUrl) {
        return new Post(
                postId,
                authorId,
                title,
                postBody,
                postImageUrl,
                LocalDateTime.now(),
                false,
                null,
                1,
                PostStatus.ACTIVE,
                0,
                0,
                0
        );
    }
}
