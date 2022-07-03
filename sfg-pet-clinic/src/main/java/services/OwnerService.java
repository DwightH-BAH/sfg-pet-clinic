package services;

public interface OwnerService {
    
    Owner findByLastName(Long id);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
