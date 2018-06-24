package com.taae.examples.hispringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.taae.examples.hispringboot.model.Player;
@RestResource(path="players", rel="players")
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
