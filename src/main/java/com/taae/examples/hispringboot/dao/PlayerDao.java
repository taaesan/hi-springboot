package com.taae.examples.hispringboot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taae.examples.hispringboot.model.Player;

public interface PlayerDao extends CrudRepository<Player, Long>{
	List<Player> findAll();
}
