package sangali.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import sangali.springframework.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
