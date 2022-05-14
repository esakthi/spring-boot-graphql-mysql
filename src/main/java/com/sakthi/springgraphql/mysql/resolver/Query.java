package com.sakthi.springgraphql.mysql.resolver;

import com.sakthi.springgraphql.mysql.repository.AuthorRepository;
import com.sakthi.springgraphql.mysql.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sakthi.springgraphql.mysql.model.Author;
import com.sakthi.springgraphql.mysql.model.Tutorial;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
	private AuthorRepository authorRepository;
	private TutorialRepository tutorialRepository;

	@Autowired
	public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
		this.authorRepository = authorRepository;
		this.tutorialRepository = tutorialRepository;
	}

	public Iterable<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

	public Author findAuthor(long id){
		return authorRepository.findById(id).orElse((new Author()));
	}
	public Iterable<Tutorial> findAllTutorials() {
		return tutorialRepository.findAll();
	}

	public Tutorial findTutorial(long id){
		return tutorialRepository.findById(id).get();
	}
	public long countAuthors() {
		return authorRepository.count();
	}

	public long countTutorials() {
		return tutorialRepository.count();
	}

}
