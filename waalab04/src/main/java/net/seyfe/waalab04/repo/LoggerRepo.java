package net.seyfe.waalab04.repo;

import net.seyfe.waalab04.domain.Logger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoggerRepo extends CrudRepository<Logger, Long> {
    List<Logger> findAll();
}
