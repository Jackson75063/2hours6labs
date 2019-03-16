package com.company;

public class FourthLab {

    char lol[] = {'N', 'L', 'T', 'U', ' ',
            'I', 'D', 'T', 'D', ' ',
            'K', 'N', 'S', '-', '1', '1', ' ',
            'd', 'e', 'v', 'e', 'l', 'o','p', 'e', 'r'};

    String рядок1 = new String(lol,0,26);
    String спеціальність = рядок1.substring(17,26);
    String рядок2 ="";
    String рядок3 = спеціальність.toUpperCase();
    String факультет = рядок1.substring(5,9);
    String рядок4 = рядок1 + рядок3;


    public void lol1(){
        System.out.println(рядок1         +" завдання 1 ");
        System.out.println(спеціальність  +" завдання 2 ");
        System.out.println(рядок2        +" завдання 3 ");
        System.out.println(рядок3        +" завдання 4 ");
        System.out.println(факультет     +" завдання 5 ");
        System.out.println(рядок4        +" завдання 6 ");
        System.out.println("Індекс першого входження 'e' " +рядок1.indexOf('e'));
        System.out.println("Індекс останнього входження 'e' " +рядок1.lastIndexOf('e'));


        //reverse
        for (int i = спеціальність.length()-1; i >= 0; i--) {
            рядок2 += спеціальність.charAt(i);
        }

        System.out.println("порівняння стрічок : ");
        System.out.println(рядок3);
        System.out.println(спеціальність == рядок3);
        System.out.println(спеціальність == рядок3);
        System.out.println(спеціальність.equals(рядок3));
        System.out.println(спеціальність.equals(спеціальність));
    }
}
