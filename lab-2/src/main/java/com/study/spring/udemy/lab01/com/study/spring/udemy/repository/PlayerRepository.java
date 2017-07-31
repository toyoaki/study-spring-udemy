package com.study.spring.udemy.lab01.com.study.spring.udemy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.study.spring.udemy.lab01.com.study.spring.udemy.model.Player;

@RestResource(path = "players", rel = "player")
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
