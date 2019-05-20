package com.company;
// desenam o table de sah 8x8, folosind literel B si W pt fiecare patrat.
public class Main {

    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if((i+j)%2==0){
                    System.out.print("B ");
                } else {
                    System.out.print("W ");
                }
            }
            System.out.println();
        }
    }
}
