package com.tsakirogf.peopleapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_people")
public class People
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;
    private String Name;
    private int Age;
    private double Balance;
    private String Email;
    private String Address;

    public People(String name, int age, double balance, String email, String address)
    {
        Name = name;
        Age = age;
        Balance = balance;
        Email = email;
        Address = address;
    }
}
