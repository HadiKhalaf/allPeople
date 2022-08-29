package com.example.hehe.service;

import com.example.hehe.entity.PeopleEntity;

import java.util.List;

public interface PeopleService {
    List<PeopleEntity> getAllPeople();
    PeopleEntity getPeopleById(Long id);
    PeopleEntity savePeople(PeopleEntity peopleEntity);
    PeopleEntity updatePeople(PeopleEntity peopleEntity);
    void deletePeople(Long id);
}
