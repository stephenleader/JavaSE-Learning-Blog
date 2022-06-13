/*
输入多个数字，并且求其综合与平均值，每输入一个数字回车确认
 */
package firstTest;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args){

        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m+1;
            sum = sum + x;
            if (x == 0)
            {
                System.out.println(m+"个数和为："+sum);
                System.out.println(m+"平均值是："+(sum/m));
                System.exit(0);
            }
        }
        System.out.println("请输入数字！");
        System.out.println("目前有"+m+"个数和为："+sum);
        System.out.println("目前有"+m+"平均值是："+(sum/m));

    }
}
