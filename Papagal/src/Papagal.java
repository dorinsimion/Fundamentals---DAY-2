import java.util.Scanner;

/**
 *  Class Papagal
 */
public class Papagal {
    /**
     *
     * @param args aada
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String echo;
        do {
            echo = scanner.nextLine();
            // add skip if text AAA
            if(echo.equals("QUIT")) break;
            System.out.println(echo);
        } while(true);
/*
        for(;;){
            echo = scanner.nextLine();
            if(echo.equals("AAA")) continue;
            if(echo.equals("QUIT")) break;
            System.out.println(echo);
        }
 */
    }
}
