import java.util.*;

// Task :PIZZA - din modulul Java Fundamentals
class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //citim nr persoane de la tastatura
        int number = scanner.nextInt();
        scanner.nextLine();
        //initializam numarul de persoane care mananca 1/4,1/2 sau 3/4 pizza
        double i1=0,i2=0,i3=0;
        // citim de la tastatura pentru fiecare persoana cata pizza mananca
        // si incrementam counterii respectivi
        for(int i=0;i<number;i++){
            String s= scanner.nextLine();
            switch (s){
                case "1/4":i1++;break;
                case "1/2":i2++;break;
                case "3/4":i3++;break;
            }
        }
        //initializam nr pizza cu 1.(O pizza o mananca sarbatoritul)
        int result = 1;
        //adaugam pizza necesare pt cei care mananca 3/4
        result+=i3;
        //adaugam pizza necesare pt cei care mananca 1/2
        result+=Math.ceil(i2/2);
        //scadem din nr de pers care mananca 1/4 nr de felii care raman de la
        //cei care mananca 3/4 sau 1/2. Pentru fiecare pers care mananca 3/4
        //ramane 1 felie de 1/4 si daca nr de pers care mananca 1/2 este impar
        // mai raman 2 felii de 1/4
        i1-=i3+(i2%2)*2;
        //daca sunt mai multe persoane care mananca 1/4 decat felii ramase
        //cumparam si pt acestea pizza necesare
        if(i1>0) {
            result += Math.ceil(i1/4);
        }
        System.out.print(result);
    }
}
