package org.peter.duckett.api.repository;

import org.peter.duckett.api.entity.Address;
import org.peter.duckett.api.entity.Comment;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveCommentRepository extends
        ReactiveSortingRepository<Comment, Long>,
        ReactiveCrudRepository<Comment, Long> {
}
