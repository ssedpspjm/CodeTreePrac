import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int amath = sc.nextInt();
        int aeng = sc.nextInt();

        int bmath = sc.nextInt();
        int beng = sc.nextInt();

        if ( amath > bmath && aeng > beng) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}