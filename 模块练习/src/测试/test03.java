package 测试;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        int a = 0;

        System.out.println("请输入整数：");

        //判断输入数据
        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("整数数据："+i);
        }
        else{
            System.out.println("输入的不是整数！");
        }

        System.out.println("请输入小数：");
        //判断浮点数

        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("小数数据："+f);
        }
        else{
            System.out.println("输入的不是小数：");
        }

        System.out.println("您可以输入0来退出程序");
        if(a == 0) {
            a = scanner.nextInt();
            scanner.close();
        }
    }
}
