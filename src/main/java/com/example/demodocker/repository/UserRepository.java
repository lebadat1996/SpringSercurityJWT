package com.example.demodocker.repository;

import com.example.demodocker.user.User;
import com.example.demodocker.user.UserEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "UEmailRepository")
public interface UserRepository extends JpaRepository<UserEmail,Long> {
}
