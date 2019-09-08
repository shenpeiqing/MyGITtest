package org.westos.demo3;

import java.lang.reflect.Constructor;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 10:32
 * @Description:西部开源教育科技有限公司
 */
public class MyTest2 {
    public static void main(String[] args) throws Exception{
        //如果你只想用空参构造，创建一个类的对象，那么反射的方式有两种
        Class<?> aClass = Class.forName("org.westos.demo3.Cat");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance();
        //方式2
        Object o1 = aClass.newInstance();
        System.out.println(o1);
    }
}
