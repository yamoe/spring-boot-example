package com.example.arti.jpa.repo;


import com.example.arti.jpa.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JpaTestRepository extends JpaRepository<Test, Long> {
}
