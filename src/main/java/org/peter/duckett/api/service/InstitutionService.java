package org.peter.duckett.api.service;

import org.peter.duckett.api.repository.ReactiveInstitutionRepository;
import org.springframework.stereotype.Service;

@Service
public class InstitutionService {

    private final ReactiveInstitutionRepository institutionRepository;

    public InstitutionService(ReactiveInstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }
}
