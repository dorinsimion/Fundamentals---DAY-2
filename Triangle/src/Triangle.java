import java.util.Scanner;
// desenam un triungi incadrat din * incadrat de #
//Output :
//        ##*##
//        #***#
//        *****
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti intaltimea ");
        int height = scanner.nextInt();

        for(int i=0;i<height;i++){
            for(int j=0;j<2*height-1;j++){
                if(j>=height-1-i && j<=height-1+i ) {
                    System.out.print("*");
                }else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
