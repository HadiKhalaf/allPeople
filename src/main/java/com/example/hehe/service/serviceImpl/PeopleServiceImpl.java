package com.example.hehe.service.serviceImpl;

import com.example.hehe.entity.PeopleEntity;
import com.example.hehe.repository.PeopleRepository;
import com.example.hehe.service.PeopleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeopleServiceImpl implements PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public List<PeopleEntity> getAllPeople() {
        return peopleRepository.findAll();
    }

    @Override
    public PeopleEntity getPeopleById(Long id) {
        return peopleRepository.findById(id).get();
    }

    @Override
    public PeopleEntity savePeople(PeopleEntity peopleEntity) {
        return peopleRepository.save(peopleEntity);
    }

    @Override
    public PeopleEntity updatePeople(PeopleEntity peopleEntity) {
        return peopleRepository.save(peopleEntity);
    }

    @Override
    public void deletePeople(Long id) {
        peopleRepository.deleteById(id);
    }
}
