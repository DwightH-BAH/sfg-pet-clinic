package services;

public interface OwnerService extends CrudService <Owner, Long>{
    
    Owner findByLastName(Long id);
    
}
