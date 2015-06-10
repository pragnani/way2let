package com.mobjax.way2let.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mobjax.way2let.entity.User;

@RepositoryRestResource(path="user" )
public interface UserRepository extends CrudRepository<User, Integer>{

}
