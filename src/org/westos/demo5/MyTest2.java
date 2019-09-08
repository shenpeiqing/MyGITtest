package org.westos.demo5;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 11:26
 * @Description:西部开源教育科技有限公司
 */
public class MyTest2 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("org.westos.demo5.Student");
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Student obj = (Student) constructor.newInstance();
       // obj.show();

        //获取方法对象
        Method show = aClass.getMethod("show");
        //通过反射的反射，来让方法执行了invoke()让方法执行
        show.invoke(obj);
        System.out.println("---------------------");
        Method test = aClass.getMethod("test", String.class, int.class);
        //参1：该类的对象，参数2：传给方法的形参要的值
        test.invoke(obj,"zhangsan",23);

        Method hehe = aClass.getMethod("hehe", double.class);
        Object invoke = hehe.invoke(obj, 3.2);
        System.out.println(invoke);

        System.out.println("-----------------------------");
        //通过反射，掉私有的方法
        Method haha = aClass.getDeclaredMethod("haha");
        haha.setAccessible(true);//调用私有方法，取消权限检查
        Object invoke1 = haha.invoke(obj);
        System.out.println(invoke1);
    }
}
