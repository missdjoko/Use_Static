package net.missdjoko.usestatic;

/**
 * Created by Miss_ on 15.01.2016.
 */
public class Test {
       static int a = 3;
       static int b;


    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    static{
        System.out.println("Static is initialized");
        b = a * 4;

    }



}
