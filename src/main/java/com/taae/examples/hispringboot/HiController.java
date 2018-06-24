package com.taae.examples.hispringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taae.examples.hispringboot.dao.TeamDao;
import com.taae.examples.hispringboot.model.Team;

@Controller
public class HiController {
	
	@Autowired TeamDao teamDao;
	
	@RequestMapping(value= "/cteam/{name}")
	public @ResponseBody Team hiThere(@PathVariable String name){
		Team team = teamDao.findByName(name);
		return team;
	}
	
	@RequestMapping("/cteams")
	public @ResponseBody List<Team> teams(){
		return teamDao.findAll();
	}
}
