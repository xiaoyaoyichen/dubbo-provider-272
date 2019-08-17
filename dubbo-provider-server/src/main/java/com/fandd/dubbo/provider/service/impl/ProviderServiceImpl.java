package com.fandd.dubbo.provider.service.impl;

import com.fangdd.dubbo.provider.dto.CommonResponse;
import com.fangdd.dubbo.provider.dto.Student;
import com.fangdd.dubbo.provider.service.ProviderService;
import org.springframework.stereotype.Service;

/**
 * This is Description
 *
 * @author chenruifeng 2019/08/16
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public void print() {

    }

    @Override
    public void print(int a) {

    }

    @Override
    public void print(int a, int b, int c) {

    }

    @Override
    public void print(Integer a) {

    }

    @Override
    public void print(Integer a, Integer b, Integer c) {

    }

    @Override
    public void print(Student student) {

    }

    @Override
    public void print(Student student1, Student student2) {

    }

    @Override
    public void print(int a, Integer b, Student student) {

    }

    @Override
    public int getInt() {
        return 0;
    }

    @Override
    public int getAndAdd(int a) {
        return 0;
    }

    @Override
    public int getAndAdd(int a, int b, int c) {
        return 0;
    }

    @Override
    public int getFromInteger(Integer a) {
        return 0;
    }

    @Override
    public int getAndAddFromInteger(Integer a, Integer b, Integer c) {
        return 0;
    }

    @Override
    public int getStudentAge(Student student) {
        return 0;
    }

    @Override
    public int getAndAddStudentAge(Student student1, Student student2) {
        return 0;
    }

    @Override
    public int getAndAddBaseAndPackageAndStudentAge(int a, Integer b, Student student) {
        return 0;
    }

    @Override
    public Integer getInteger() {
        return null;
    }

    @Override
    public Integer getFromInt(int a) {
        return null;
    }

    @Override
    public Integer getAndAddFromInt(int a, int b, int c) {
        return null;
    }

    @Override
    public Integer getAndAdd(Integer a) {
        return null;
    }

    @Override
    public Integer getAndAdd(Integer a, Integer b) {
        return null;
    }

    @Override
    public Integer getStudentAgeReturnInteger(Student student) {
        return null;
    }

    @Override
    public Integer getAndAddStudentAgeReturnInteger(Student student1, Student student2) {
        return null;
    }

    @Override
    public Integer getAndAddBaseAndPackageAndStudentAgeReturnInteger(int a, Integer b, Student student) {
        return null;
    }

    @Override
    public CommonResponse getSuccessResponse() {
        return null;
    }

    @Override
    public CommonResponse<Integer> getAndAddInt(int a) {
        return null;
    }

    @Override
    public CommonResponse<Integer> getAndAddAllInt(int a, int b, int c) {
        return null;
    }

    @Override
    public CommonResponse<Integer> getAndAddInteger(Integer a) {
        return null;
    }

    @Override
    public CommonResponse<Integer> getAndAddAllInteger(Integer a, Integer b, Integer c) {
        return null;
    }

    @Override
    public CommonResponse<Integer> getStudentAgeReturnObject(Student student) {
        return null;
    }

    @Override
    public CommonResponse<Integer> getAndAddStudentAgeReturnObject(Student student1, Student student2) {
        return null;
    }

    @Override
    public CommonResponse<Integer> getAndAddBaseAndPackageAndStudentAgeReturnObject(int a, Integer b, Student student) {
        return null;
    }
}
