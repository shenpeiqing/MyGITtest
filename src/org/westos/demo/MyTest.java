package org.westos.demo;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 09:17
 * @Description:西部开源教育科技有限公司
 */
public class MyTest {
    public static void main(String[] args) {
        //反射：通过一个类的字节码文件对象（Class）反着去剖析，这个类的构成
        //你想要使用这个反射机制，必须获取到该类的字节码文件对象
        //如果获取一个类的字节码文件对象。
        //方式1. 通过Object类中的getClass方法
        Student student = new Student(); //Student.class
        //Class 类的实例表示正在运行的 Java 应用程序中的类和接口
        Class clazz = student.getClass();

        //方式2.任何一个类，都有一个 class属性，通过这个属性就可以获取到该类的字节码文件对象
        Class<Student> studentClass = Student.class;

        System.out.println(clazz==studentClass);

        Class<? extends Student> aClass = student.getClass();
        System.out.println(studentClass==aClass);

    }
}
