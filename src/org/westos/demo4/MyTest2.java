package org.westos.demo4;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 10:42
 * @Description:西部开源教育科技有限公司
 */
public class MyTest2 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("org.westos.demo4.Student");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object object= declaredConstructor.newInstance();

        //以前我们给字段赋值
        //Student student = new Student();
        //student.name="张三";
        Field name = aClass.getField("name");
        name.set(object,"张三");
        Object o = name.get(object);
        System.out.println(o);



    }
}
