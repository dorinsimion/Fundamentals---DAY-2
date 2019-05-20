package com.company;

import java.util.Scanner;
//tabla inmultirii pana la N
// Output pt N=4:
//           \   1   2   3   4
//           1   1   2   3   4
//           2   2   4   6   8
//           3   3   6   9  12
//           4   4   8  12  16
public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
	    int number = scanner.nextInt();

	    for (int i=0;i<=number;i++){
	        for(int j=0;j<=number;j++){
	            // daca suma i+j=0,adica suntem coltul stanga sus afisam simbolul \
	            if(i+j==0) {
                    System.out.printf("%4s","\\");
                    //daca suntem pe prima linie sau coloana afisam numarul insusi
                } else if(i==0 || j==0){
                    System.out.printf("%4d",i+j);
                    //altfel afisam produsul numarului din prima coloana cu a numarului
                    //din prima linie
                } else{
                    System.out.printf("%4d",i*j);
                }
            }
            System.out.println();
        }
    }
}
