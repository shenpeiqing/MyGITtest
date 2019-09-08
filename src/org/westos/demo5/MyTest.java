package org.westos.demo5;

import com.sun.jmx.snmp.SnmpOidDatabaseSupport;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 11:14
 * @Description:西部开源教育科技有限公司
 */
public class MyTest {
    public static void main(String[] args) throws Exception{
        //Student student = new Student();
        //student.hehe(3.2);
        //student.show();
        //student.test("abc",32);
        //student.haha();
        //通过反射的反射，来剖析方法对象 Method 方法对象

        Class<?> aClass = Class.forName("org.westos.demo5.Student");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Student student = (Student) declaredConstructor .newInstance();

        //获取所有的公共的方法对象,包括他父类的公共方法 对象也获取到了
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("---------------------------");
        //获取所有的公共的方法对象包括私有的
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("------------------------");
        //获取单个的公共方法对象
        Method show = aClass.getMethod("show");
        System.out.println(show);
        //参1：方法名 参数2：该方法形参类型的class类型
        Method test = aClass.getMethod("test", String.class, int.class);
        System.out.println(test);
        //获取私有的方法
        Method haha = aClass.getDeclaredMethod("haha");
        System.out.println(haha);


    }
}
