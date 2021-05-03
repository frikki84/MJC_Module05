package com.epam.esm.repository.repository;

import java.util.List;

import com.epam.esm.repository.entity.Tag;

public interface TagRepository extends CrdOperations<Tag> {

    public List<Tag> getMostWidelyUsedUsersTag(long userId);

    public List<Tag> findByName(String tagName);
}
