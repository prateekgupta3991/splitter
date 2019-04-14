package com.splitter.repositories;

import com.splitter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByEmailIn(List<String> emails);

    User findByEmail(String email);
}
