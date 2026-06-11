package com.trainingmug.ecommerce.repository;

import com.trainingmug.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    //JpaRepository
    /*
    CRUD
    save,findById, delete, findAll

    Derived Methods
    findBy, count, exists
     */
    Optional<Customer> findByEmail(String email);
}
