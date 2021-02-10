package com.tsakirogf.peopleapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest
{
    class TestValues
    {
        long Id;
        String Name;
        int Age;
        double Balance;
        String Email;
        String Address;

        public TestValues(long id, String name, int age, double balance, String email, String address)
        {
            Id = id;
            Name = name;
            Age = age;
            Balance = balance;
            Email = email;
            Address = address;
        }
    }

    TestValues uninderestingTestValues =
            new TestValues(5,
                           "Name Lastname",
                           170,
                           1.18,
                           "lastname@email.com",
                           "5a streetname, BT4 XXX, City");

    People TestPeopleFactory()
    {
        return new People(uninderestingTestValues.Name,
                          uninderestingTestValues.Age,
                          uninderestingTestValues.Balance,
                          uninderestingTestValues.Email,
                          uninderestingTestValues.Address);
    }
}