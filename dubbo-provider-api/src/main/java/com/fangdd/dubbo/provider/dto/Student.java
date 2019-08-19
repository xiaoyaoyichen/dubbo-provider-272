package com.fangdd.dubbo.provider.dto;

import java.io.Serializable;

/**
 * This is Description
 *
 * @author wwg
 * @date 2019/08/16
 */
public class Student implements Serializable {

    private String name;

    private Integer age;

    private Byte gender;

    public Student() {
    }

    public Student(String name, Integer age, Byte gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
