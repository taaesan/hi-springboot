package com.taae.examples.hispringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.taae.examples.hispringboot.model.Team;
@RestResource(path="teams", rel="teams")
public interface TeamRepository extends CrudRepository<Team, Long>{

}
