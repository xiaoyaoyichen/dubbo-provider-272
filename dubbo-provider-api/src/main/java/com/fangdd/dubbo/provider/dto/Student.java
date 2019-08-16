package com.fangdd.dubbo.provider.dto;

/**
 * This is Description
 *
 * @author chenruifeng
 * @date 2019/08/16
 */
public class Student {

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
}
