package com.fangdd.dubbo.provider.service;

import com.fangdd.common.basic.CommonResponse;
import com.fangdd.dubbo.provider.dto.Student;

/**
 * dubbo接口
 *
 * @author chenruifeng
 * @date 2019/08/16
 */
public interface ProviderService {

    // --------------------无返回值--------------------

    /**
     * 参数：无
     * 返回值：无
     */
    void print();

    /**
     * 参数：一个基础类型
     * 返回值：无
     * @param a
     */
    void print(int a);

    /**
     * 参数：多个基础类型
     * 返回值：无
     * @param a
     * @param b
     * @param c
     */
    void print(int a, int b, int c);

    /**
     * 参数：一个包装类型
     * 返回值：无
     * @param a
     */
    void print(Integer a);

    /**
     * 参数：多个包装类型
     * 返回值：无
     * @param a
     * @param b
     * @param c
     */
    void print(Integer a, Integer b, Integer c);

    /**
     * 参数：一个对象
     * 返回值：无
     * @param student
     */
    void print(Student student);

    /**
     * 参数：多个对象
     * 返回值：无
     * @param student1
     * @param student2
     */
    void print(Student student1, Student student2);

    /**
     * 参数：基本类型、包装类型、对象
     * 返回值：无
     * @param a
     * @param b
     * @param student
     */
    void print(int a, Integer b, Student student);

    // --------------------基础类型--------------------

    /**
     * 参数：无
     * 返回值：包装类型
     * @return
     */
    int getInt();

    /**
     * 参数：一个基础类型
     * 返回值：基础类型
     * @param a
     * @return
     */
    int getAndAdd(int a);

    /**
     * 参数：多个基础类型
     * 返回值：基础类型
     * @param a
     * @param b
     * @param c
     * @return
     */
    int getAndAdd(int a, int b, int c);

    /**
     * 参数：一个包装类型
     * 返回值：基础类型
     * @param a
     * @return
     */
    int getFromInteger(Integer a);

    /**
     * 参数：多个包装类型
     * 返回值：基础类型
     * @param a
     * @param b
     * @param c
     * @return
     */
    int getAndAddFromInteger(Integer a, Integer b, Integer c);

    /**
     * 参数：一个对象
     * 返回值：基础类型
     * @param student
     * @return
     */
    int getStudentAge(Student student);

    /**
     * 参数：多个对象
     * 返回值：基础类型
     * @param student1
     * @param student2
     * @return
     */
    int getAndAddStudentAge(Student student1, Student student2);

    /**
     * 参数：基本类型、包装类型、对象
     * 返回值：基本类型
     * @param a
     * @param b
     * @param student
     * @return
     */
    int getAndAddBaseAndPackageAndStudentAge(int a, Integer b, Student student);

    // --------------------包装类型--------------------

    /**
     * 参数：无
     * 返回值：包装类型
     * @return
     */
    Integer getInteger();

    /**
     * 参数：一个基础类型
     * 返回值：包装类型
     * @param a
     * @return
     */
    Integer getFromInt(int a);

    /**
     * 参数：多个基础类型
     * 返回值：包装类型
     * @param a
     * @param b
     * @param c
     * @return
     */
    Integer getAndAddFromInt(int a, int b, int c);

    /**
     * 参数：一个包装类型
     * 返回值：包装类型
     * @param a
     * @return
     */
    Integer getAndAdd(Integer a);

    /**
     * 参数：多个包装类型
     * 返回值：包装类型
     * @param a
     * @param b
     * @return
     */
    Integer getAndAdd(Integer a, Integer b);

    /**
     * 参数：一个对象
     * 返回值：包装类型
     * @param student
     * @return
     */
    Integer getStudentAgeReturnInteger(Student student);

    /**
     * 参数：多个对象
     * 返回值：包装类型
     * @param student1
     * @param student2
     * @return
     */
    Integer getAndAddStudentAgeReturnInteger(Student student1, Student student2);

    /**
     * 参数：基本类型、包装类型、对象
     * 返回值：包装类型
     * @param a
     * @param b
     * @param student
     * @return
     */
    Integer getAndAddBaseAndPackageAndStudentAgeReturnInteger(int a, Integer b, Student student);

    // --------------------对象类型--------------------

    /**
     * 参数：无
     * 返回值：对象
     * @return
     */
    CommonResponse<Void> getSuccessResponse();

    /**
     * 参数：一个基本类型
     * 返回值：对象
     * @param a
     * @return
     */
    CommonResponse<Integer> getAndAddInt(int a);

    /**
     * 参数：多个基本类型
     * 返回值：对象
     * @param a
     * @param b
     * @param c
     * @return
     */
    CommonResponse<Integer> getAndAddAllInt(int a, int b, int c);

    /**
     * 参数：一个包装类型
     * 返回值：对象
     * @param a
     * @return
     */
    CommonResponse<Integer> getAndAddInteger(Integer a);

    /**
     * 参数：多个包装类型
     * 返回值：对象
     * @param a
     * @param b
     * @param c
     * @return
     */
    CommonResponse<Integer> getAndAddAllInteger(Integer a, Integer b, Integer c);

    /**
     * 参数：一个对象
     * 返回值：对象
     * @param student
     * @return
     */
    CommonResponse<Integer> getStudentAgeReturnObject(Student student);

    /**
     * 参数：多个对象
     * 返回值：对象
     * @param student1
     * @param student2
     * @return
     */
    CommonResponse<Integer> getAndAddStudentAgeReturnObject(Student student1, Student student2);

    /**
     * 参数：多种类型
     * 返回值：对象
     * @param a
     * @param b
     * @param student
     * @return
     */
    CommonResponse<Integer> getAndAddBaseAndPackageAndStudentAgeReturnObject(int a, Integer b, Student student);

}
