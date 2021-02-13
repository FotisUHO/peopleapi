package com.tsakirogf.peopleapi.service;

import com.tsakirogf.peopleapi.model.People;
import com.tsakirogf.peopleapi.repository.iPeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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

    @Override
    public void deletePeopleById(long id)
    {
        this.peopleRepository.deleteById(id);
    }

    @Override
    public Iterable<People> findByName(String name)
    {
        List<People> listOfPeople = new LinkedList<People>();
        Iterator<People> peopleCollection = this.peopleRepository.findAll().iterator();
        while (peopleCollection.hasNext())
        {
            People element = peopleCollection.next();
            if (element.getName().equals(name))
            {
                listOfPeople.add(element);
            }
        }
        return (Iterable<People>) listOfPeople;
    }

    @Override
    public Iterable<People> findByName(String name, boolean caseSensitivity)
    {
        List<People> listOfPeople = new LinkedList<People>();
        Iterator<People> peopleCollection = this.peopleRepository.findAll().iterator();
        if (caseSensitivity)
        {
            while (peopleCollection.hasNext())
            {
                People element = peopleCollection.next();
                if (element.getName().equalsIgnoreCase(name))
                {
                    listOfPeople.add(element);
                }
            }
        }
        else
        {
            while (peopleCollection.hasNext())
            {
                People element = peopleCollection.next();
                if (element.getName().equals(name))
                {
                    listOfPeople.add(element);
                }
            }
        }
        return (Iterable<People>) listOfPeople;
    }
}
