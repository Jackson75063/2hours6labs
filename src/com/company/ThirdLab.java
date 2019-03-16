package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class ThirdLab {

    Random r = new Random();

    int n = 10;

    int up =1 ;
    int down =1 ;
    int right =1 ;
    int left =1 ;

    int mas [ ][ ]=new int[n][n];
    int count = 0;
    int result = 1;


    public void task() {

        for (int ii = 0; ii < n; ii++) {
            for (int j = 0; j < n; j++) {

                mas[ii][j] = r.nextInt(5) - 1;

            }
        }

//вивів матриці
        for (int[] row : mas)
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));


        System.out.println("up");
        for (int i = 0, j=0; j <n ; j++) {
            if(mas[i][j] > 0)
                count++;
//            System.out.print(mas[i][j]+" ");
        }
//        System.out.println(count);

        //        System.out.println(up);

        System.out.println("left");
        for (int j = 0, i=1; i <n ; i++) {
            if(mas[i][j] > 0)
                count++;
//            System.out.print(mas[i][j]+" ");
        }
//        System.out.println(count);

        //        System.out.println(left);

        System.out.println("down");
        for (int i = n - 1, j = 1; j < n - 1; j++) {
            if(mas[i][j] > 0)
                count++;
//            System.out.print(mas[i][j]+" ");
        }
//        System.out.println(count);

//        System.out.println(down);

        System.out.println("right");
        for (int j = n-1, i=1; i <n ; i++) {
            if(mas[i][j] > 0)
                count++;
//            System.out.print(mas[i][j]+" ");
        }
        System.out.println("count: "+count);
        System.out.println(factorial());
//        System.out.println(right);



    }

    public  BigInteger factorial()
    {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= count; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public long factorialUsingForLoop() {
        long fact = 1;
        for (int i = 2; i <= count; i++) {
            fact = fact * i;
        }
        return fact;
    }

}





