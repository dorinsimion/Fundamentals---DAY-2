package com.company;

import java.util.Scanner;
//divizorii unui numar
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i=1;
        while(i<=number/2){
            if(number%i==0)
                System.out.println(i);
            i++;
        }
        System.out.println(number);

    }
}
