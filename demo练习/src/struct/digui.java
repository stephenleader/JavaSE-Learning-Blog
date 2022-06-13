/*
递归学习
和函数的循环调用差不多
 */
package struct;

import java.util.Scanner;

/**
 * 如果调用太多了，反而会影响功能
 */
public class digui {
    public static void main(String[] args){
        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(f(a));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }
}
