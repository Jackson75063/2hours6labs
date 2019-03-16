package com.company;

import java.util.Random;

public class SecondLab {


    public void labaDva(){

        Random r = new Random();
/*
        Частку від ділення добутку 
        елементів масиву на суму цих елементів
        */

        int[] mas = new int[4];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(10) + 1;
        }

        double dobutok = 1;
        double suma = 0;

/*
        for (int i = 0; i <mas.length ; i++) {
            System.out.println(mas[i]);
            dobutok *=mas[i];
            System.out.println(dobutok);
        }
*/
        for (int f : mas) {
            dobutok *=  f;
            suma += f;
        }



        for (int f : mas) {
            System.out.print(f + ", ");
        }
        System.out.println("\n");
        System.out.println("dob: " + dobutok+ " suma: " +suma);

        System.out.println("Result is: "+ dobutok % suma);

//        result = dobutok % sum;
    }

}
