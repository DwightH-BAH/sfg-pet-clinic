package services;

import dee.springframework.sfgpetclinic.model.Pet;

public interface PetServices {
    
    Pet findById(Long id);
    Pet save(Pet pet);
    Set <Pet> findAll();
}
