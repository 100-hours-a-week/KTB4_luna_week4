package com.example.community.post.draft.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PostDraftRequestDTO {
    @NotBlank
    private String title;
    @NotBlank
    private String postBody;

    private String postImageUrl;

    private int version;
}
