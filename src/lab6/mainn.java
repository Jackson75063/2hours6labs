package lab6;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;

public class mainn {

    public static void main(String[] args) {


        boolean exit = true;
        while (exit) {
            System.out.println("Menu:");
            System.out.println("Виберіть 1 щоб ввести значення ребра куба та виводу площі");
            System.out.println("Виберіть 2 щоб ввести значення для паралелелепіпеда  та виводу площі");
            System.out.println("Виберіть 3 щоб вийти");
            System.out.println(" ");

            Scanner sc = new Scanner(System.in);

            int s =  Integer.parseInt(sc.nextLine());


            switch (s) {

                case 1: {
                    System.out.println("Введіть значення ребра");
                    double r = Double.parseDouble(sc.nextLine());
                    Cube c = new Cube(r);
                    System.out.println("Ребро куба: " +r);
                    System.out.println("Площа куба:"  + c.getVolume());
                }
                break;

                case 2: {
                    System.out.println("Введіть значення C");
//                    C D H
                    double c = Double.parseDouble(sc.nextLine());

                    System.out.println("Введіть значення D");
                    double d = Double.parseDouble(sc.nextLine());

                    System.out.println("Введіть значення H");
                    double h = Double.parseDouble(sc.nextLine());
                    RectSolid rc = new RectSolid(c,d,h);
                    System.out.println("Сторони паралелепіпеда C: "+ rc.C +" D: "+ rc.D +" H: "+ rc.H +" ");
                    System.out.println("Площа паралелепіпеда:"  + rc.getVolume());
                }
                break;

                case 3:{
                    System.out.println("bye");
                    exit = false;
                }break;

                default:{
                    System.out.println("Введено некоректні значення!!!!!");
                }
           }
        }
        System.out.println("end");
    }
}
