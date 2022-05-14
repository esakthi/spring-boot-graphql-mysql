package com.sakthi.springgraphql.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakthi.springgraphql.mysql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}