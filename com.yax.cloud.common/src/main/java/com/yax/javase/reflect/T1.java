package com.yax.javase.reflect;

import java.io.FileDescriptor;
import java.lang.annotation.*;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @className: T1
 * @description:
 * @author: yangxin
 * @date 2020-09-03
 */
public class T1 {

    public static void main(String[] args) throws Exception {

        Class c1 = Class.forName("com.yax.javase.reflect.User");
//        Object o = c1.newInstance();
//        o.toString();

   /*     //创建对象时间比较
        int count = 100000000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            User user = new User();
        }
        long end = System.currentTimeMillis();
        System.out.println("时间1:" + String.valueOf(end - start));

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Class c1 = Class.forName("com.yax.javase.reflect.User");
            Object o = c1.newInstance();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("时间2:" + String.valueOf(end1 - start1));

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Class c1 = Class.forName("com.yax.javase.reflect.User");
            Constructor constructor = c1.getConstructor(null);
            constructor.setAccessible(true);
            constructor.newInstance(null);;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("时间3:" + String.valueOf(end2 - start2));
*/

/*
        //获取对象方法
        Object o1 = c.newInstance();
        o1.toString();

        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            //System.out.println(method);
        }
        Method[] methods1 = c1.getMethods();
        for (Method method : methods1) {
            //System.out.println(method);
        }
*/
/*        //方式一通过对象的.class 获取Class 对象
        Class<User> clz = User.class;
        MyTable annotation1 = clz.getAnnotation(MyTable.class);
        System.out.println(annotation1.value());

        //方式二 获取注解
        MyTable annotation2 = (MyTable) c1.getAnnotation(MyTable.class);
        System.out.println(annotation2.value());

        //获取字段注解
        Field myField = c1.getDeclaredField("name");
        MyField myField1 = myField.getAnnotation(MyField.class);
        System.out.println(myField1.value());*/

    }
}

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyField {
    String value() default "0";

}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyTable{
    String value() default "0";

}

class Person {
    static {
        //System.out.println("父类静态代码块");
    }

    {
        //System.out.println("父类代码块");
    }

    public String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Person() {
        //System.out.println("父类无参构造器");
    }

    public void test(){}

}

@MyTable("db_user")
class User extends Person {
    @MyField("db_age")
    private int age;
    @MyField("db_name")
    private String name;
    @MyField("db_sex")
    private String sex;

    static {
        //System.out.println("子类静态代码块");
    }

    {
        //System.out.println("子类代码块");
    }

    public User(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        //System.out.println("子类有参数构造函数");
    }

    public User() {
        //System.out.println("子类无参数构造函数");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
