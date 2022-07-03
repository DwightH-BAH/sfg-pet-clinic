package services;

import dee.springframework.sfgpetclinic.model.Vet;

public interface VetService {
    
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
