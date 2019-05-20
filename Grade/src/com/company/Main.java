package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nota:");
        int nota = scanner.nextInt();
        char result;
        if(nota==10){
            result='A';
        } else if(nota==8 || nota==9){
            result='B';
        }else if (nota==7 || nota==6){
            result='C';
        } else if(nota>=1 && nota<=5) {
            result='D';
        } else {
            result='!';
        }

        if(result=='!'){
            System.out.println("Ai introdus o nota gresita!");
        } else {
            System.out.println("Nota ta este " + result);
        }
    }
}
