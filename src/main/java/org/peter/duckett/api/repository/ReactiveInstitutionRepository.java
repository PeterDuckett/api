package org.peter.duckett.api.repository;

import org.peter.duckett.api.entity.Institution;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveInstitutionRepository extends
        ReactiveSortingRepository<Institution, Long>,
        ReactiveCrudRepository<Institution, Long> {
}
