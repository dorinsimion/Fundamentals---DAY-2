package com.company;

import java.util.Scanner;
/*
Exemplul comentat:
afisam corespondentul notei 10 - A, 8-9 - B, 6-7 - C,1-5 -D
Al 2 lea exemplu:
Afisam anotimpul corespunzator lunii citite de la tastatura .
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti nota:");
//        int nota = scanner.nextInt();
//        char c='!';
//        switch(nota){
//            case 10:
//                c='A';
//                break;
//            case 9:
//            case 8:
//                c='B';
//                break;
//            case 7:
//            case 6:
//                c='C';
//                break;
//            case 5: case 4: case 3: case 2: case 1:
//                c='D';
//                break;
//        }
//        System.out.println("Nota ta este " + c);

        System.out.println("Introduceti anotimpul:");
        int anotimp = scanner.nextInt();
        switch (anotimp){
            default:
                System.out.println("Nu este anotimp!");
                break;
            case 3: case 4: case 5:
                System.out.println("Primavara");
                break;
            case 6: case 7: case 8:
                System.out.println("Vara");
                break;
            case 9: case 10: case 11:
                System.out.println("Toamna");
                break;
            case 12: case 1: case 2:
                System.out.println("Iarna");
                break;
        }

    }
}
