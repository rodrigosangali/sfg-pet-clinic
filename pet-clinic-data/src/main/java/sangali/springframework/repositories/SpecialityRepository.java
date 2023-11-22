package sangali.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import sangali.springframework.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
