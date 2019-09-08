package org.westos.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 10:49
 * @Description:西部开源教育科技有限公司
 */
public class MyTest3 {
    public static void main(String[] args) throws Exception {
        //Student student = new Student();
        //student.name="aaa";
        //student.age=100;
        //student.money=3.2;

        Class<?> aClass = Class.forName("org.westos.demo4.Student");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object obj = declaredConstructor.newInstance();

        Field money = aClass.getDeclaredField("money");
        money.setAccessible(true); //给私有字段设置值，取消权限检查
        money.setDouble(obj,3.14);

        Double o = (Double) money.get(obj);
        System.out.println(o);

    }
}
