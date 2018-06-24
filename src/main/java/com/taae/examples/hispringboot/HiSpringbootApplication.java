package com.taae.examples.hispringboot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.taae.examples.hispringboot.dao.TeamDao;
import com.taae.examples.hispringboot.model.Player;
import com.taae.examples.hispringboot.model.Team;


@SpringBootApplication
public class HiSpringbootApplication extends SpringBootServletInitializer {

	/**
	 * Used when run as a jar
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HiSpringbootApplication.class, args);
	}

	/**
	 * Used when run war
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HiSpringbootApplication.class);
	}
	
	
	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<Player>();
		players.add(new Player("Brown", "pitcher"));
		players.add(new Player("Snopdog", "blocker"));
		
		java.util.List<Team> teams = new ArrayList<Team>();
		teams.add(new Team("Peanuts", "US", players));
		teams.add(new Team("Coco", "Thailand", null));
		
		teamDao.saveAll(teams);
	}
	
	@Autowired private TeamDao teamDao;


}
