package com.example.android.viewsuses;

/**
 * Created by Android on 6/27/2017.
 */

public class Contact {
    String name;
    String age;
    String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(String name, String age, String phone) {

        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}
