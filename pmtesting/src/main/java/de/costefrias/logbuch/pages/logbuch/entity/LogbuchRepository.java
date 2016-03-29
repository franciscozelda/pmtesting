package de.costefrias.logbuch.pages.logbuch.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LogbuchRepository extends CrudRepository<LogbuchEntity, Long> {

    List<LogbuchEntity> findByName(String name);
}