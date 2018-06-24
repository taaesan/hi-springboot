package com.taae.examples.hispringboot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taae.examples.hispringboot.model.Team;

public interface TeamDao extends CrudRepository<Team, Long>{
	List<Team> findAll();
	Team findByName(String name);
}
