package com.mylearning.spring5webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mylearning.spring5webapp.model.Author;
import com.mylearning.spring5webapp.model.Book;
import com.mylearning.spring5webapp.model.Publisher;
import com.mylearning.spring5webapp.repositories.AuthorRepository;
import com.mylearning.spring5webapp.repositories.BookRepository;
import com.mylearning.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootStrap implements CommandLineRunner {
	
	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private PublisherRepository publisherRepository;

	@Override
	public void run(String... args) throws Exception {
		Author a1 = new Author("Sandeep", "Kumar");
		Publisher p1 = new Publisher("ANC Publications", "Avenue Street", "Pune", "Maharastra", 321622L);
		Book b1 = new Book("Spring Data Course", "13768172", p1);
		Book b2 = new Book("Spring JPA Course", "67623488", p1);
		
		b1.getAuthors().add(a1);
		b2.getAuthors().add(a1);
		
		a1.getBooks().add(b1);
		a1.getBooks().add(b2);
		
		publisherRepository.save(p1);
		authorRepository.save(a1);
		bookRepository.save(b1);
		bookRepository.save(b2);
		
		System.out.println(bookRepository.count());
		System.out.println(authorRepository.count());
	}

}
