package net.seyfe.waalab04.repo;

import net.seyfe.waalab04.domain.Exception;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExceptionRepo extends CrudRepository<Exception, Long> {
    List<Exception> findAll();
}
