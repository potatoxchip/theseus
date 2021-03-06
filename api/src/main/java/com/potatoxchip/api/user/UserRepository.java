package com.potatoxchip.api.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByEmailOrHandleName(String email, String handleName);

    Optional<User> findByEmail(String email);

    Optional<User> findByHandleName(String handleName);
}
