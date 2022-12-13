package it.develhope.booleanOperators2;

public class Start {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = '2';

        System.out.println((55 != 55) && (false ^ true)); //it should be false
        System.out.println((!a || !b) || c == d); //it should be true
        System.out.println(false && true || false && !false); //it should be false
        System.out.println((false && true) || (false || true)); //it should be true

    }
}
