package com.worldwide.UkbesKitchen.repository;

import com.worldwide.UkbesKitchen.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findById(String id);
    List<User> findByUserName(String userName);
    List<User> findByIsActiveTrue();
    List<User> findByIsActiveFalse();
}
