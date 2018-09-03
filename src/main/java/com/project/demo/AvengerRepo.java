package com.project.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.demo.model.Avenger;

@RepositoryRestResource(collectionResourceRel="avengers",path="avengers")
public interface AvengerRepo extends JpaRepository<Avenger, Integer>
{

}
 	