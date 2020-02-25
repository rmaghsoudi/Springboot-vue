package com.okta.springbootvue;  
  
import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.data.rest.core.annotation.RepositoryRestResource;  
  
// Auto-generates all needed methods for a REST API
@RepositoryRestResource  
interface TodoRepository extends JpaRepository<Todo, Long> {}