package com.devmaywald.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devmaywald.crud.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
