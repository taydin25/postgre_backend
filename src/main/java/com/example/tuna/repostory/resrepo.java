package com.example.tuna.repostory;
import com.example.tuna.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface resrepo extends JpaRepository<Restaurant,Long> {

}
