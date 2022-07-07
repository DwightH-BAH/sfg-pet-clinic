package guru.springframework.petclinicdata.services;

import java.util.Set;

import dee.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CrudService <Vet, Long> {
    
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
