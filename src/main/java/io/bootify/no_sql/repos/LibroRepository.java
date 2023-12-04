package io.bootify.no_sql.repos;

import io.bootify.no_sql.domain.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LibroRepository extends MongoRepository<Libro, Long> {
}
