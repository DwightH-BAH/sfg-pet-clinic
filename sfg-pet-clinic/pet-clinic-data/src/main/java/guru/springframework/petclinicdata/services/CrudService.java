import java.util.Set;

import dee.springframework.sfgpetclinic.*;

public class CrudService <T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void deleteById(ID id);
}
