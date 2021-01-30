package com.survivingcodingbootcamp.blog.storage;

import com.survivingcodingbootcamp.blog.model.Hashtag;

public interface HashtagStorage {
    Iterable<Hashtag> retrieveAllHashtags();

    void save(Hashtag hashtagToAdd);

    Hashtag retrieveHashtagById(Long id);




}
