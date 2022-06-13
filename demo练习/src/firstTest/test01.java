package firstTest;

import java.util.Scanner;

public class test01{
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("使用next的方式为：");
            //判断用户是否输入字符串
            if(scanner.hasNext()){
                String str = scanner.next();
                //程序会等待你输入完毕
                System.out.println("输出内容："+str);
            }
            scanner.close();
            //IO流用完就关掉
        }
    }

