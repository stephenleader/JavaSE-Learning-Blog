package 结构体;

import java.util.Scanner;

/**
 * @author Stephen Lan
 */
public class calculateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char opr = '/';
        double result = 0.0;

        System.out.println("请输入一个数字");
        double data1 = scanner.nextDouble();
        System.out.println("请输入第二个数字");
        double data2 = scanner.nextDouble();
        System.out.println("请输入操作符：");
        opr = scanner.next().charAt(0);
        //scanner.next().charAt(0),输入字符串

        switch (opr) {
            case '+':
                result = add(data1, data2);
                break;
            case '-':
                result = sub(data1, data2);
                break;
            case '/':
                result = div(data1, data2);
                break;
            case '*':
                result = mul(data1, data2);
                break;
        }
        System.out.println(data1 + " "+ opr + " "+ data2 + " " + "=" + " " + result);
        scanner.close();
    }

    private static double add(double data1, double data2) {
        return data1 + data2;
    }

    private static double sub(double data1, double data2) {
        return data1 - data2;
    }

    private static double div(double data1, double data2) {
        return data1 / data2;
    }

    private static double mul(double data1, double data2) {
        return data1 * data2;
    }
}

