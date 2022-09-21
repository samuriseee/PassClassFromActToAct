package com.example.passdatatoactivity;

import java.io.Serializable;

public class SinhVien implements Serializable {
    public String name,classET,school,age;

    public SinhVien(String name, String classET, String school, String age) {
        this.name = name;
        this.classET = classET;
        this.school = school;
        this.age = age;
    }
}
