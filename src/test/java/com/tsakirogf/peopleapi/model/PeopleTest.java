package com.tsakirogf.peopleapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest
{
    @Test
    void testContructor()
    {
        People testPeople = new People(uninderestingTestValues.Id,
                                       uninderestingTestValues.Name,
                                       uninderestingTestValues.Age,
                                       uninderestingTestValues.Balance,
                                       uninderestingTestValues.Email,
                                       uninderestingTestValues.Address);
        assertEquals(uninderestingTestValues.Name, testPeople.getName());
        assertEquals(uninderestingTestValues.Age, testPeople.getAge());
        assertEquals(uninderestingTestValues.Balance, testPeople.getBalance());
        assertEquals(uninderestingTestValues.Email, testPeople.getEmail());
        assertEquals(uninderestingTestValues.Address, testPeople.getAddress());
    }

    @Test
    void testSetGetName()
    {
        People testSubject = TestPeopleFactory();
        final String testName = "A random name";
        testSubject.setName(testName);
        assertEquals(testName, testSubject.getName());
    }

    @Test
    void testSetGetAge()
    {
        People testSubject = TestPeopleFactory();
        final int testAge = 607;
        testSubject.setAge(testAge);
        assertEquals(testAge, testSubject.getAge());
    }

    @Test
    void testSetGetBalance()
    {
        People testSubject = TestPeopleFactory();
        final double testBalance = 12.01;
        testSubject.setBalance(testBalance);
        assertEquals(testBalance, testSubject.getBalance());
    }

    @Test
    void testSetGetEmail()
    {
        People testSubject = TestPeopleFactory();
        final String testMail = "A random email";
        testSubject.setEmail(testMail);
        assertEquals(testMail, testSubject.getEmail());
    }

    @Test
    void testSetGetAddress()
    {
        People testSubject = TestPeopleFactory();
        final String testAddress = "A random address";
        testSubject.setAddress(testAddress);
        assertEquals(testAddress, testSubject.getAddress());
    }

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
        return new People(uninderestingTestValues.Id,
                          uninderestingTestValues.Name,
                          uninderestingTestValues.Age,
                          uninderestingTestValues.Balance,
                          uninderestingTestValues.Email,
                          uninderestingTestValues.Address);
    }
}