package com.study.spring.udemy.lab01.com.study.spring.udemy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.study.spring.udemy.lab01.com.study.spring.udemy.model.Team;

@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long> {

}
