package arrayList;

import fengZhuang.Student;

import java.lang.management.ManagementFactory;

public class arrayDemo {
    public static void main(String[] args){
        //静态初始化
        int [] a = {1,2,3,4,5,6,7,8};
        System.out.println(a[0]);

        Student student = new Student();
        student.name = "wola";

        //动态初始化,创建空间。后期赋值
        int[] b = new int[10];
        b[0] = 10;

    }

}
