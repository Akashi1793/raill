package com.example.depl.services;

import com.example.depl.entity.Personne;
import com.example.depl.repository.PersonneRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class PersonneServices {
    private final PersonneRepo persss;

    public List<Personne> Getallpersonne() {
        return persss.findAll();
    }
}
