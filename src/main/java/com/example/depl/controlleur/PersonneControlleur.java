package com.example.depl.controlleur;

import com.example.depl.services.PersonneServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/Soa")
public class PersonneControlleur {

        private final PersonneServices pers_servs;

        @GetMapping("/allpersonne")
        public ResponseEntity<?> Allpersonne(){
            return ResponseEntity.ok().body(this.pers_servs.Getallpersonne());
        }

}
