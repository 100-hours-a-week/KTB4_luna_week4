package com.example.community.post.draft.repository;

import com.example.community.post.draft.entity.PostDraft;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PostDraftRepository {
    private final Map<Long, PostDraft> drafts = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(0);
    public void save(long userId, PostDraft postDraft) {
        drafts.put(userId, postDraft);
    }
    public void delete(long userId){
        drafts.remove(userId);
    }
    public Optional<PostDraft> findCurrentByUserId(long userId) {
        return Optional.ofNullable(drafts.get(userId));
    }
    public long nextDraftId(){
        return idGenerator.incrementAndGet();
    }
}
