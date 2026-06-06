package com.example.community.post.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReportResponseDTO {
    private long postId;
    private long reportId;
    private boolean blinded;
}
