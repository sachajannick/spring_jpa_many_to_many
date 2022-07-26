package com.example.jpamanytomany.repository;

import com.example.jpamanytomany.model.Viewer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewerRepository extends CrudRepository<Viewer, Long> {
}
