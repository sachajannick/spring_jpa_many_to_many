package com.example.jpamanytomany.repository;

import com.example.jpamanytomany.model.Stream;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends CrudRepository<Stream, Long> {
}
