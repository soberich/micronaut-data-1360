package com.example;

import io.micronaut.data.annotation.Query;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.PageableRepository;

import java.util.Optional;
import java.util.UUID;

import static io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES;

@JdbcRepository(dialect = POSTGRES)
public interface PojoRepository extends PageableRepository<Pojo, UUID> {

    // @formatter:off
    @Query(
        "SELECT * " +
          "FROM pojo " +
         "WHERE nick_names::varchar[] && ARRAY[:nickNames] ")
    // @formatter:on
    Optional<Pojo> somethingWithCast(String[] nickNames);
}
