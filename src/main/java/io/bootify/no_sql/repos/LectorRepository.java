package io.bootify.no_sql.repos;

import io.bootify.no_sql.domain.Lector;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LectorRepository extends MongoRepository<Lector, Long> {
}
