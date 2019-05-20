import java.util.Scanner;
//verificam daca un numar este prim
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isPrime= true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(!isPrime)
            System.out.print("Not ");
        System.out.println("PRIME");
    }
}
