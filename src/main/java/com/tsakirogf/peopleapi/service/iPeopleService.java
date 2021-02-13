package com.tsakirogf.peopleapi.service;

import com.tsakirogf.peopleapi.model.People;

public interface iPeopleService
{
    /**
     * @brief Function to return a list of all the entities
     * @return Iteratable of People
     */
    Iterable<People> getListOfPeople();

    /**
     * @brief Function to save a single People
     * @param people An instance of People
     * @return An copy of the object just saved
     */
    People savePeople(People people);

    /**
     * @brief Function to delete a single People
     * @param people An instance of People
     */
    void deletePeople(People people);

    /**
     * @brief Function to delete a single People
     *        depending on the id
     * @param id The id of the record
     */
    void deletePeopleById(long id);

    /**
     * @brief Overloaded function that search for people
     *        elements with a specific name parameter.
     * @param name Query param in a GET Request
     *             (i.e. /api/v2/people/search?name=xxx)
     * @return an iterable of peoples matching the search criteria
     */
    Iterable<People> findByName(String name);

    /**
     * @brief Overloaded function that search for people
     *        elements with a specific name parameter.
     *
     * @param name  Query param in a GET Request
     *            (i.e. /api/v2/people/search?name=xxx&caseSensitive=true)
     * @param caseSensitivity  Query param in a GET Request
     * @return  an iterable of peoples matching the search criteria
     */
    Iterable<People> findByName(String name, boolean caseSensitivity);
}
