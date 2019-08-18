package com.fandd.dubbo.provider.service.impl;

import com.fangdd.dubbo.provider.dto.CommonResponse;
import com.fangdd.dubbo.provider.dto.Student;
import com.fangdd.dubbo.provider.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * This is Description
 *
 * @author chenruifeng 2019/08/16
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0")
@Slf4j
public class ProviderServiceImpl implements ProviderService {

    private static final int BASE_INT = 100;

    @Override
    public void print() {
        System.out.println("调用 ProviderService.print() 成功");
        log.info("调用 ProviderService.print() 成功");
    }

    @Override
    public void print(int a) {
        System.out.println("ProviderService.print(int a)接受到参数 a = " + a);
        log.info("ProviderService.print(int a)接受到参数 a = {}", a);
    }

    @Override
    public void print(int a, int b, int c) {
        System.out.println("ProviderService.print(int a, int b, int c)接受到参数 a = " + a + ", b = " + b + ", c = " + c);
        log.info("ProviderService.print(int a, int b, int c)接受到参数 a = {}, b = {}, c = {}", a, b, c);
    }

    @Override
    public void print(Integer a) {
        System.out.println("ProviderService.print(Integer a)接受到参数 a = " + a);
        log.info("ProviderService.print(Integer a)接受到参数 a = {}", a);
    }

    @Override
    public void print(Integer a, Integer b, Integer c) {
        System.out.println("ProviderService.print(Integer a, Integer b, Integer c)接受到参数 a = " + a + ", b = " + b + ", c = " + c);
        log.info("ProviderService.print(Integer a, Integer b, Integer c)接受到参数 a = {}, b = {}, c = {}", a, b, c);
    }

    @Override
    public void print(Student student) {
        System.out.println("ProviderService.print(Student student)接受到参数 student = " + student);
        log.info("ProviderService.print(Student student)接受到参数 student = {}", student);
    }

    @Override
    public void print(Student student1, Student student2) {
        System.out.println("ProviderService.print(Student student1, Student student2)接受到参数 student1 = " + student1 + ", student2 = " + student2);
        log.info("ProviderService.print(Student student1, Student student2)接受到参数 student1 = {}, student2 = {}", student1, student2);
    }

    @Override
    public void print(int a, Integer b, Student student) {
        System.out.println("ProviderService.print(int a, Integer b, Student student)接受到参数 a = " + a + ", b = " + b + ", student = " + student);
        log.info("ProviderService.print(int a, Integer b, Student student)接受到参数 a = {}, b = {}, student = {}", a, b, student);
    }

    @Override
    public int getInt() {
        return BASE_INT;
    }

    @Override
    public int getAndAdd(int a) {
        return a + BASE_INT;
    }

    @Override
    public int getAndAdd(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public int getFromInteger(Integer a) {
        return a;
    }

    @Override
    public int getAndAddFromInteger(Integer a, Integer b, Integer c) {
        return a + b + c;
    }

    @Override
    public int getStudentAge(Student student) {
        return student.getAge();
    }

    @Override
    public int getAndAddStudentAge(Student student1, Student student2) {
        return student1.getAge() + student2.getAge();
    }

    @Override
    public int getAndAddBaseAndPackageAndStudentAge(int a, Integer b, Student student) {
        return a + b + student.getAge();
    }

    @Override
    public Integer getInteger() {
        Integer integer = Integer.valueOf(BASE_INT);
        return integer;
    }

    @Override
    public Integer getFromInt(int a) {
        return Integer.valueOf(a);
    }

    @Override
    public Integer getAndAddFromInt(int a, int b, int c) {
        Integer sum = Integer.valueOf(a + b + c);
        return sum;
    }

    @Override
    public Integer getAndAdd(Integer a) {
        Integer sum = a + BASE_INT;
        return sum;
    }

    @Override
    public Integer getAndAdd(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer getStudentAgeReturnInteger(Student student) {
        return student.getAge();
    }

    @Override
    public Integer getAndAddStudentAgeReturnInteger(Student student1, Student student2) {
        return student1.getAge() + student2.getAge();
    }

    @Override
    public Integer getAndAddBaseAndPackageAndStudentAgeReturnInteger(int a, Integer b, Student student) {
        return a + b + student.getAge();
    }

    @Override
    public CommonResponse getSuccessResponse() {
        return CommonResponse.success();
    }

    @Override
    public CommonResponse<Integer> getAndAddInt(int a) {
        return CommonResponse.successWithData(a + BASE_INT);
    }

    @Override
    public CommonResponse<Integer> getAndAddAllInt(int a, int b, int c) {
        return CommonResponse.successWithData(a + b + c);
    }

    @Override
    public CommonResponse<Integer> getAndAddInteger(Integer a) {
        return CommonResponse.successWithData(a + BASE_INT);
    }

    @Override
    public CommonResponse<Integer> getAndAddAllInteger(Integer a, Integer b, Integer c) {
        return CommonResponse.successWithData(a + b + c);
    }

    @Override
    public CommonResponse<Integer> getStudentAgeReturnObject(Student student) {
        return CommonResponse.successWithData(student.getAge());
    }

    @Override
    public CommonResponse<Integer> getAndAddStudentAgeReturnObject(Student student1, Student student2) {
        return CommonResponse.successWithData(student1.getAge() + student2.getAge());
    }

    @Override
    public CommonResponse<Integer> getAndAddBaseAndPackageAndStudentAgeReturnObject(int a, Integer b, Student student) {
        return CommonResponse.successWithData(a + b + student.getAge());
    }
}
