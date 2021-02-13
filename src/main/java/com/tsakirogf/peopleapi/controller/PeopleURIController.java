package com.tsakirogf.peopleapi.controller;

import com.tsakirogf.peopleapi.model.People;
import com.tsakirogf.peopleapi.service.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * This is a more "resty" controller opposed to the strict part1 one url endpoint
 */
@RestController
@RequestMapping("api/v2/people")
public class PeopleURIController
{

    @Autowired
    private PeopleServiceImpl peopleService;

    public PeopleURIController(PeopleServiceImpl peopleService)
    {
        this.peopleService = peopleService;
    }

    @GetMapping(value = { "/list"})
    public Iterable<People> getListOfPeople()
    {
        return peopleService.getListOfPeople();
    }

    @GetMapping("/search")
    public Iterable<People> findByName(@RequestParam("name") String name,
                                       @RequestParam(required = false) boolean caseSensitive)
    {
        if (caseSensitive)
        {
            return peopleService.findByName(name, caseSensitive);
        }
        else
        {
            return peopleService.findByName(name);
        }
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
