package University.System.repo;

import University.System.model.Professor;
import org.springframework.data.repository.CrudRepository;

public interface IProfessorRepo extends CrudRepository<Professor, Long> {

}
