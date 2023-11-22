package sangali.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import sangali.springframework.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
