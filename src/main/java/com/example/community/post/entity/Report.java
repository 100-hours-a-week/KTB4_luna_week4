package com.example.community.post.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Report {
    private long reportId;
    private long postId;
    private long userId;
    private ReportReason reason;
    private String description;
    private LocalDateTime reportedAt;
}
