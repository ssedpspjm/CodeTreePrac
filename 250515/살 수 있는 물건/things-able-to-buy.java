import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 3000) {
            System.out.printf("book");
        }
        else if (n >= 1000) {
            System.out.printf("mask");
        }
        else {
            System.out.printf("no");
        }
    }
}