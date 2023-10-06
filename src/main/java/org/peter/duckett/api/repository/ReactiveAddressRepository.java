package org.peter.duckett.api.repository;

import org.peter.duckett.api.entity.Address;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveAddressRepository extends
        ReactiveSortingRepository<Address, Long>,
        ReactiveCrudRepository<Address, Long> {
}
