package org.westos.demo2;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 10:01
 * @Description:西部开源教育科技有限公司
 */
public class Teacher {
    private Teacher(){
        System.out.println("这是一个私有的构造");
    }

    private Teacher(String name,int age) {
        System.out.println("这是两个参数私有的构造"+name+"==="+age);
    }
}
