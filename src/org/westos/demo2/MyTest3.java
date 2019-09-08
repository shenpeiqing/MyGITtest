package org.westos.demo2;

import java.lang.reflect.Constructor;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 10:02
 * @Description:西部开源教育科技有限公司
 */
public class MyTest3 {
    public static void main(String[] args) throws Exception{
        //创建Teacher对象
        //new Thacher();
        //通过反射来创建该类的对象
        Class<?> aClass = Class.forName("org.westos.demo2.Teacher");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);//取消权限检查
        Object o = declaredConstructor.newInstance();
        System.out.println(o);
        System.out.println("----------------------------");
        //获取两个参数的构造方法对象
        Constructor<?> declaredConstructor1 = aClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor1.setAccessible(true);//取消权限检查
        //new Theacher("wangwu",23);
        Object teacher = declaredConstructor1.newInstance("wangwu", 23);
        System.out.println(teacher);

    }
}
