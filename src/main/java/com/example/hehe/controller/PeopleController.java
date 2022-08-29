package com.example.hehe.controller;

import com.example.hehe.entity.PeopleEntity;
import com.example.hehe.service.PeopleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }
    @GetMapping
    public List<PeopleEntity> getAllPeople(){
        return peopleService.getAllPeople();
    }
    @GetMapping("{id}")
    public PeopleEntity getPeopleById(@PathVariable Long id){
        return peopleService.getPeopleById(id);
    }
    @PostMapping
    public PeopleEntity savePeople(@RequestBody PeopleEntity peopleEntity){
        return peopleService.savePeople(peopleEntity);
    }
    @PutMapping
    public PeopleEntity updatePeople(@RequestBody PeopleEntity peopleEntity){
        return peopleService.updatePeople(peopleEntity);
    }
    @DeleteMapping("{id}")
    public void deletePeople(@PathVariable Long id){
        peopleService.deletePeople(id);
    }
}
