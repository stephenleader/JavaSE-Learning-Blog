package firstTest;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("put string: ");
        //判断是否还有输入
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("the detail is:\n" +str);
        }
        scanner.close();
    }
}
//hasNext()不可以接收空格，hasNextLine()可以接收空格