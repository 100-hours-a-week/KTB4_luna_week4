package com.example.community.post.factory;

import com.example.community.post.dto.ReportRequestDTO;
import com.example.community.post.entity.Report;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ReportFactory {
    public Report create(long reportId, long postId, long userId, ReportRequestDTO requestDTO){
        return new Report(
                reportId,
                postId,
                userId,
                requestDTO.getReason(),
                requestDTO.getDescription(),
                LocalDateTime.now()
        );
    }
}
