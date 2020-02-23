package com.mylearning.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mylearning.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
