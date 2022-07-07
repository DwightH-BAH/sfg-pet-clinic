package guru.springframework.petclinicdata.services;
import java.util.Set;

import dee.springframework.sfgpetclinic.*;

public interface CrudService <T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void deleteById(ID id);
}
