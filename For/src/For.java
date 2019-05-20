import java.util.Scanner;
//
public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //divizorii unui numar
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.println(i);
        }


        //doar pt a exemplifica for cu mai multe initializari si incrementari
        for(int i=n,j=0;i>=0 && j<10 ;i++ ,j--){
            System.out.println(i);
        }
    }
}
