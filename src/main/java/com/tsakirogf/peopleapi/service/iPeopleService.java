package com.tsakirogf.peopleapi.service;

import com.tsakirogf.peopleapi.model.People;
import org.springframework.http.ResponseEntity;

public interface iPeopleService
{
    Iterable<People> getListOfPeople();

    People savePeople(People people);

    void deletePeople(People people);
}
