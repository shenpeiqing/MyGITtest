package org.westos.demo2;

import java.lang.reflect.Constructor;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 09:41
 * @Description:西部开源教育科技有限公司
 */
public class MyTest {
    public static void main(String[] args) throws Exception{
        //反射:
        //就是在运行状态中的一种动态调用方法或者属性的一种机制.
        //        - 就是获取字节码文件对象, 然后剖析改类中存在哪些构造方法, 哪些成员变量, 哪些成员方法
        //类的构成：
        //构造方法， Constructor
        // 成员变量 ，Field
        // 成员方法,Method

        //获取该类的字节码文件对象
        Class aClazz = Class.forName("org.westos.demo2.Student");
        //获取该类的构造方法对象
        //获取该类所有的构造方法对象
        //getConstructors()获取该类的所有的公共的构造方法对象
        Constructor[] constructors = aClazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("------------------------------------------");
        Constructor[] declaredConstructors = aClazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("-------------------------------------------");
        //获取单个的构造方法对象
        Constructor constructor = aClazz.getConstructor();
        Constructor constructor1 = aClazz.getConstructor(String.class);
        Constructor constructor2 = aClazz.getConstructor(String.class, int.class);
        System.out.println(constructor);
        System.out.println(constructor1);
        System.out.println(constructor2);
        //获取单个的私有构造方法对象
        Constructor declaredConstructor = aClazz.getDeclaredConstructor(String.class, char.class);
        System.out.println(declaredConstructor);


    }
}
