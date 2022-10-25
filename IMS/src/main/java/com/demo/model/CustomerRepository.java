package com.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("From Customer where name =:name")
    List<Customer> findCustomerByName(@Param("name") String name);

    @Query("From Customer where id =:id")
    List<Customer> findCustomerById(@Param("id") Long id);
}