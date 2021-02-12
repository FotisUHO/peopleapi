package com.tsakirogf.peopleapi.controller;

import com.tsakirogf.peopleapi.model.People;
import com.tsakirogf.peopleapi.service.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = { "/"})
    public Iterable<People> getListOfPeople()
    {
        return peopleService.getListOfPeople();
    }

    @PostMapping(value = { "/"})
    public People savePeople(@RequestBody People people)
    {
        return peopleService.savePeople(people);
    }

    @DeleteMapping(value = {"/deleteid"})
    public void deletePeopleById(@RequestParam(value = "id") long id)
    {
        peopleService.deletePeopleById(id);
    }

    @DeleteMapping(value = {"/"})
    public void deleteIndividualPeople(@RequestBody People people)
    {
        peopleService.deletePeople(people);
    }
}
