package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a number to add up to it");
        int output = 0;
        int x = 1;
        int n=input.nextInt();
        while (x <= n)
        {
            output = output + x;
            x++;
        }
        System.out.println("The sum from 1 to "+n+" is "+output);
    }
}
