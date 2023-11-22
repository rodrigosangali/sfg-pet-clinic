package sangali.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import sangali.springframework.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
