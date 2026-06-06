package com.example.community.post.repository;

import com.example.community.post.entity.Report;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ReportRepository {
    private final Map<Long, List<Report>> reports = new HashMap<>();
    private AtomicLong counter = new AtomicLong(0);
    public void save(Report report) {
        reports.computeIfAbsent(report.getPostId(), key-> new ArrayList<>()).add(report);
    }
    public boolean existsByPostIdAndUserId(Long postId, Long userId) {
        return reports.getOrDefault(postId, List.of()).stream().anyMatch(report -> report.getUserId() == userId);
    }
    public long nextReportId(){
        return counter.incrementAndGet();
    }
    public int countByPostId(long postId){
        return reports.getOrDefault(postId, List.of()).size();
    }
}
