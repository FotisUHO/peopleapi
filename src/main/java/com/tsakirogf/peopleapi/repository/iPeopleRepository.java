package com.tsakirogf.peopleapi.repository;

import com.tsakirogf.peopleapi.model.People;
import org.springframework.data.repository.CrudRepository;

public interface iPeopleRepository extends  CrudRepository<People, Long>
{
}
