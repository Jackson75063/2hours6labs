package com.company;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class FirstLab {


    public void firstExpression(double x, double y,double step) {


        double result = 0;

        while (x <= y) {


            result = Math.pow(4 * Math.pow(x,3) + Math.pow(x,2), 1.0 / 4);

            System.out.println("Result is: "+result + "\n step: " + x);
            x+=step;
        }

    }

    public void second(double x, double y, double h){


        double res=0;
        while(x <= y){

            if(x < 0){

                res = sin(cos(x));
            }else{
                if(x >= 0){
                    res = cos(sin(x));
                }
                else{
                    System.out.println("eror");
                }
            }
            System.out.println("res = "+ res+"\n x = "+ x);
            System.out.println("----------------------");
            x+=h;
        }


    }

}
