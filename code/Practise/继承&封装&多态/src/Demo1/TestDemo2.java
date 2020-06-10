package Demo1;

/*
 *  Description: 接口
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 7:50
 */

import java.util.Arrays;

public class TestDemo2 {
    public static void main(String[] args)
    {
        Student[] stu = new Student[]{
                new Student("张三", 99),
                new Student("李四", 100),
        };

        if(stu[0].compareTo(stu[1]) > 0)
            System.out.println(stu[0].name + "成绩低于" + stu[1].score);

        Arrays.sort(stu);
        System.out.println(Arrays.toString(stu));
    }
}

class Student implements Comparable<Student>{
    public String name;
    public int score;

    public Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        if(this.score > s.score)
            return -1;
        else if(this.score < s.score)
            return 1;
        else
            return 0;
    }

}












