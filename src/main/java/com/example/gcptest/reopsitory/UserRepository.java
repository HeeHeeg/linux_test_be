package com.example.gcptest.reopsitory;

import com.example.gcptest.domin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
