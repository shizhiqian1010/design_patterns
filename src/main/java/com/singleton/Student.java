package com.singleton;

/**
 * @ClassName Student
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/6 22:12
 **/
public class Student {

    private Integer id;

    private String name;

    private String sex;

    private Student(){}
    public static Student getInstance(){
        return Singleton.INSTANCE.newInstance();
    }

    /**
     * 枚举单例
     */
    private enum Singleton {
        INSTANCE;

        private Student student;

        Singleton() {
            student = new Student();
        }

        public Student newInstance() {
            return student;
        }
    }
}
