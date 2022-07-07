package guru.springframework.petclinicdata.services.map;

public class VetServiceMap extends AbstractMapService <Vet, Long> implements CrudService<Vet, Long>{
    @Override
    Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    void delete(Vet object) {
        super.delete(object);
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }
}
