package io.bootify.no_sql.repos;

import io.bootify.no_sql.domain.Prestamo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PrestamoRepository extends MongoRepository<Prestamo, Long> {
}
