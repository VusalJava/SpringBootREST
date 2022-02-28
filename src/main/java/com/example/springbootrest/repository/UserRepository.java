package com.example.springbootrest.repository;

import com.example.springbootrest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "select u from User u where u.login = :login")
    User findByLogin(@Param("login") String login);
}
