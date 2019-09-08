package org.westos.demo3;

import java.lang.reflect.Constructor;
import java.net.SocketTimeoutException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 10:26
 * @Description:西部开源教育科技有限公司
 */
public class MyTest {
    public static void main(String[] args) throws Exception {
       // Dog dog = new Dog();
        Class<?> aClass = Class.forName("org.westos.demo3.Dog"); //Dog.class---->Class
        //获取该类中的空参构造方法对象
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Dog obj = (Dog) declaredConstructor.newInstance();
        obj.eat();


    }

}
