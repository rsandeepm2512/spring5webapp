package com.mylearning.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.mylearning.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
