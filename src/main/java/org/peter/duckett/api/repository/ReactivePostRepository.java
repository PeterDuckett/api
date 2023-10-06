package org.peter.duckett.api.repository;

import org.peter.duckett.api.entity.Address;
import org.peter.duckett.api.entity.Post;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactivePostRepository extends
        ReactiveSortingRepository<Post, Long>,
        ReactiveCrudRepository<Post, Long> {
}
