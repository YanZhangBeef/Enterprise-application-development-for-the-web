package com.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("From User where username =:username")
    User findUserByUserName(@Param("username") String username);

//    @Query("From User where username =:role_name")
//    List<User> findUserByRole(@Param("role_name") String role_name);
}