import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ((n%2 == 1 && n%3 == 0) || (n%2 == 0 && n%5 == 0) ) {
            System.out.printf("true");
        }
        else {
            System.out.printf("false");
        }
    }
}