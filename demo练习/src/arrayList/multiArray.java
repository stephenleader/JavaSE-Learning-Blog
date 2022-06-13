package arrayList;
//常用格式 int a[][] = new int[2][5];

import java.util.Arrays;

public class multiArray {
    public static void main(String[] args){

        /**
         * 1,2
         * 3,4
         * 4,5
         * 5,6
         */

        int[][] array = {{1,2},{3,4},{4,5},{5,6}};
        //打印数组

        for (int i = 0 ; i < array.length; i++){
            for (int j = 0 ; j<array[i].length;j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
