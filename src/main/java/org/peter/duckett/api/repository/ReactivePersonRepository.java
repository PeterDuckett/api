package org.peter.duckett.api.repository;

import org.peter.duckett.api.entity.Address;
import org.peter.duckett.api.entity.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactivePersonRepository extends
        ReactiveSortingRepository<Person, Long>,
        ReactiveCrudRepository<Person, Long> {
}
