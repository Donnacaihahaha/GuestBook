package com.example.appple.guestbook;

/**
 * Created by appple on 2/4/16.
 */
public class Person {
    String firstName;
    String lastname;
    String phonenumber;
    String emailaddress;
    public Person(String firstname,String lastname, String phonenumber,String emailaddress){
        this.firstName = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }
}
