import java.util.Scanner;
//afisam numele de n ori.
public class PrintName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numele ");
        String nume = scanner.nextLine();
        System.out.print("n: ");
        int n = scanner.nextInt();
        int i=1;
        do {
            System.out.println(nume);
            i++;
        } while(i<=n);
    }
}
