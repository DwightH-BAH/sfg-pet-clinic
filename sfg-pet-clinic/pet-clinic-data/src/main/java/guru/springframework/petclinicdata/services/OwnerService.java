package guru.springframework.petclinicdata.services;

import java.util.List;

import dee.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService <Owner, Long>{
    
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);

    
}
