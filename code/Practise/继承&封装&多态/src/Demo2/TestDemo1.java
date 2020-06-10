package Demo2;

/*
 *  Description: Cloneable
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 7:53
 */

import java.util.Arrays;

public class TestDemo1
{
    public static void main(String[] args) throws CloneNotSupportedException {

        Student stu1 = new Student();
        Student stu2 = (Student)stu1.clone();

        stu1.m.money = 19.9;

        System.out.println(stu1.m.money);
        System.out.println(stu2.m.money);
    }


    public static void main1(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1.clone(); // clone 是默认继承 Object 类

        arr2[1] = 1;

        System.out.println(Arrays.toString(arr1)); // arr1[1] 没有改变，clone 方法为深拷贝
        System.out.println(Arrays.toString(arr2));
    }
}

class Student implements Cloneable
{
    public String name;

    public Property m = new Property();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s =  (Student)super.clone(); // 调用父类的 clone 方法
        s.m = (Property)this.m.clone(); // 深拷贝 m
        return (Object)s; // 返回当前实例的深拷贝
    }
}

class Property implements Cloneable
{
    public double money = 12;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}












