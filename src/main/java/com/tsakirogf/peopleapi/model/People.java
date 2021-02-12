package com.tsakirogf.peopleapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class People
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String Name;
    @JsonProperty("age")
    private int Age;
    @JsonProperty("balance")
    private double Balance;
    @JsonProperty("email")
    private String Email;
    @JsonProperty("address")
    private String Address;

    public People(long id, String name, int age, double balance, String email, String address)
    {
        this.id = id;
        Name = name;
        Age = age;
        Balance = balance;
        Email = email;
        Address = address;
    }

    public People()
    {
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int age)
    {
        Age = age;
    }

    public double getBalance()
    {
        return Balance;
    }

    public void setBalance(double balance)
    {
        Balance = balance;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String email)
    {
        Email = email;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        Address = address;
    }
}
