import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int y = sc.nextInt();

        if ( s == 0 ) {
            if (y >= 19) {
                System.out.printf("MAN");
            }
            else {
                System.out.printf("BOY");
            }
        }
        else {
            if (y >= 19) {
                System.out.printf("WOMAN");
            }
            else {
                System.out.printf("GIRL");
            }
        }
    }
}