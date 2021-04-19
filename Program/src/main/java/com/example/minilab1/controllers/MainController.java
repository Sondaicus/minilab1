package com.example.minilab1.controllers;


import com.example.minilab1.models.Kompis;
import com.example.minilab1.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MainController {
    @Autowired
    private KompisRepository kompisRepository;

    @GetMapping("/find")
    public List<Kompis> getAllFriends() {
        return (List<Kompis>) kompisRepository.findAll();
    }

    @PostMapping(path = "/add")
    public Kompis addNewKompisByPost(@RequestBody Kompis kompis) {
        return kompisRepository.save(kompis);

    }


}