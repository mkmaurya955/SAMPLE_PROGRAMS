package com.manish.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.manish.model.Customer;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{
	  List<Customer> findByAge(int age);
}
