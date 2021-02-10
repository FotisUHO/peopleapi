package com.tsakirogf.peopleapi.controller;

import com.tsakirogf.peopleapi.model.People;
import com.tsakirogf.peopleapi.service.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/people")
public class PeopleController
{
    @Autowired
    private PeopleServiceImpl peopleService;

    public PeopleController(PeopleServiceImpl peopleService)
    {
        this.peopleService = peopleService;
    }

    @GetMapping(value = { "/app/people"})
    public Iterable<People> getListOfPeople()
    {
        return peopleService.getListOfPeople();
    }
}
