package com.rtatap.lahman.controllers;

import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController  {
    @Query()
    @GetMapping("/all")
    public List<String> getAllNotes() {
        List<String> sample = new ArrayList<>();
        sample.add("adsasd");
        sample.add("adsasd");
        sample.add("adsasd");
        sample.add("adsasd");
        sample.add("adsasd");
        return sample;
    }
}
