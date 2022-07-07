package guru.springframework.petclinicdata.services.map;



import java.util.Set;

import dee.springframework.sfgpetclinic.model.Owner;
import guru.springframework.petclinicdata.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService <Owner, Long>{


    @Override
    Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    void delete(Owner object) {
        super.delete(object);
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }

}
