import java.util.Scanner;
//desenam un dreptunghi folosing simbolul * folosind 2 for
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungimea");
        int L=scanner.nextInt();
        System.out.println("Introduceti intalimea");
        int h = scanner.nextInt();

        for(int i=1;i<=h;i++){
            for(int j=1;j<=L;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        String result ="";
        for(int i=1;i<=h;i++){
            for(int j=1;j<=L;j++){
                result+="*";
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
