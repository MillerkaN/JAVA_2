package Lesson_3;

import java.util.ArrayList;

public class Person {
    private String surname;
    private String name;
    private String phoneNum;
    private String mail;

    public Person(String surname, String name, String phoneNum, String mail) {
        this.surname = surname;
        this.name = name;
        this.phoneNum = phoneNum;
        this.mail = mail;
    }

    public Person() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String eMail) {
        this.mail = mail;
    }


    @Override
    public String toString() {
        return String.format("Person(%s, %s, %s, %s", surname, name, phoneNum, mail);
    }
}
