package com.example.tuna.repostory;

import com.example.tuna.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User,String> {
}
