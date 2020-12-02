package com.tts.tech_talent_twitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.tech_talent_twitter.model.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

    Tag findByPhrase(String phrase);
}
