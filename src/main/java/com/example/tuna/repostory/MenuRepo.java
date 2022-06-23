package com.example.tuna.repostory;

import com.example.tuna.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu,Long> {
}
