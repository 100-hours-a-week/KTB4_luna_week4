package com.example.community.post.draft.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class PostDraftResponseDTO {
    private long draftId;
    private String title;
    private String postBody;
    private String postImageUrl;
    private LocalDateTime updatedAt;
    private int version;
}
