package ru.frolov.jsonpostgres1.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.frolov.jsonpostgres1.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
