package org.peter.duckett.api.controller;

import org.peter.duckett.api.entity.Institution;
import org.peter.duckett.api.repository.ReactiveInstitutionRepository;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("institution")
public class InstitutionController {

    private final ReactiveInstitutionRepository institutionRepository;

    public InstitutionController(ReactiveInstitutionRepository institutionRepository){
        this.institutionRepository = institutionRepository;
    }

    @GetMapping
    public Flux<Institution> getAllProducts(){
        return institutionRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @GetMapping("/{id}")
    public Mono<Institution> findOne(@PathVariable("id") Long id){
        return institutionRepository.findById(id);
    }

    @PutMapping
    public Mono<Institution> updateEmployee(@RequestBody Institution institution){
        return institutionRepository.save(institution);
    }

    @PostMapping
    public Mono<Institution> saveEmployee(@RequestBody Institution institution){
        return institutionRepository.save(institution);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteEmployee(@PathVariable("id") Long id){
        return institutionRepository.deleteById(id);
    }
}
