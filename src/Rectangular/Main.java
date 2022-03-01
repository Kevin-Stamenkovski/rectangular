package Rectangular;

import java.util.*;

import java.lang.String;
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int a = input.nextInt(), b = input.nextInt();
        System.err.println("The Perimeter is: " + ((a+b)*2) + ", the Area is: " + (a*b));

    }
}
