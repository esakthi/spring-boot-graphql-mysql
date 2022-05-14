package com.sakthi.springgraphql.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakthi.springgraphql.mysql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
