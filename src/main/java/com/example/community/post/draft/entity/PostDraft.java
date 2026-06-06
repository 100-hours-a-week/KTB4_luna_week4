package com.example.community.post.draft.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class PostDraft {
    private long draftId;
    private long userId;

    private String title;
    private String postBody;
    private String postImageUrl;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private int version;
    public void overwrite(String title, String postBody, String postImageUrl) {
        this.title = title;
        this.postBody = postBody;
        this.postImageUrl = postImageUrl;
        this.updatedAt = LocalDateTime.now();
        this.version++;
    }
}
