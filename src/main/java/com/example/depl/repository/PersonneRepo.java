package com.example.depl.repository;

import com.example.depl.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepo extends JpaRepository<Personne,Integer> {
}
