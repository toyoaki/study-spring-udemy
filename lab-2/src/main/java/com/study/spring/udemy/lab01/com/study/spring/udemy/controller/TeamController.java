package com.study.spring.udemy.lab01.com.study.spring.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.udemy.lab01.com.study.spring.udemy.model.Team;
import com.study.spring.udemy.lab01.com.study.spring.udemy.repository.TeamRepository;

@RestController
public class TeamController {

    @Autowired private TeamRepository teamRepository;

    //@RequestMapping("teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    //@RequestMapping("teams/{id}")
    public Team findById(@PathVariable(name = "id") Long id) {
        return teamRepository.findOne(id);
    }

}
