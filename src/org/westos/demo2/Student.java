package org.westos.demo2;

import com.sun.media.sound.SoftTuning;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 09:27
 * @Description:西部开源教育科技有限公司
 */
public class Student {

    public Student() {
        System.out.println("空参构造执行 了");
    }

    public Student(String name) {
        System.out.println("一个参数的构造执行了");
    }

    public Student(String name,int age) {
        System.out.println("两个个参数的构造执行了"+name+"=="+age);
    }

    private Student(String name,char ch) {
        System.out.println("私有构造执行了");
    }

}
