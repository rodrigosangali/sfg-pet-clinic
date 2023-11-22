package sangali.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import sangali.springframework.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
