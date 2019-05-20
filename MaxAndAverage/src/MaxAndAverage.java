import java.util.Scanner;
//afisati varsta maxima si media varstelor pentru 3 persoane.
//varstele introduse de la tastatura si vor fi introduse atat timp cat
//varsta introdusa este in afara intervalului 1-100.
public class MaxAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initializam maximul cu -1 si media varstelor cu 0
        int max = -1,average=0;
        for(int i=1;i<=3;i++){
            int n;
            //citim varsta unei persoane atat timp cat numarul introdus
            //nu este intre 1-100. Folosim do-while ca sa executam macar o
            // data.
            do {
                System.out.println("Introduceti varsta "+i);
                n=scanner.nextInt();
            }while(n<1 || n>100);
            //daca varsta persoanei este mai mare decat maximul precedent
            //asignam noua valoare
            if(n>max) max=n;
            //adunam varsta la vechea suma.
            average+=n;
        }
        System.out.println("Varsta maxima "+ max);
        //afisam media varstelor impartind suma obtinuta la 3.
        System.out.println("Media varstelor "+ average/3);
    }
}
