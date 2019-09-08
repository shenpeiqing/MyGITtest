package org.westos.demo4;

import com.sun.media.sound.SoftTuning;

import java.lang.reflect.Field;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 10:36
 * @Description:西部开源教育科技有限公司
 */
public class MyTest {
    public static void main(String[] args) throws NoSuchFieldException {
        //Field 字段类型
        Class<Student> studentClass = Student.class;
        //获取所有的公共字段对象
        Field[] fields = studentClass.getFields();
        for (Field field : fields) {
            System.out.println(field.toString());
        }
        System.out.println("----------------------");
        //获取所有的字段对象，包括私有的
        Field[] declaredFields = studentClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        //获取单个公共字段对象
        Field name = studentClass.getField("name");
        System.out.println(name);

        //获取单个的私有字段对象
        Field money = studentClass.getDeclaredField("money");
        System.out.println(money);


    }
}
