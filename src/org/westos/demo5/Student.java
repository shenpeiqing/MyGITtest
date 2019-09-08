package org.westos.demo5;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 11:11
 * @Description:西部开源教育科技有限公司
 */
public class Student {
    private Student() {
    }

    public void show(){
        System.out.println("空参数的show方法执行了");
    }

    public void test(String name,int age) {
        System.out.println("两个参数的 test方法执行了"+name+"==="+age);
    }

    public String hehe(double num) {
        System.out.println("有返回值的方法执行了"+num);
        return "呵呵";
    }

    private String haha(){
        System.out.println("私有的方法执行了");
        return "哈哈";
    }
}
