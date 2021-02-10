package com.tsakirogf.peopleapi.service;

import com.tsakirogf.peopleapi.model.People;
import com.tsakirogf.peopleapi.repository.iPeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements iPeopleService
{
    @Autowired
    private iPeopleRepository peopleRepository;

    @Override
    public Iterable<People> getListOfPeople()
    {
        return this.peopleRepository.findAll();
    }

    @Override
    public People savePeople(People people)
    {
        return this.peopleRepository.save(people);
    }

    @Override
    public void deletePeople(People people)
    {
        this.peopleRepository.delete(people);
    }
}
