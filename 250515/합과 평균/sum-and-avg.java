import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        double avr = (double)(A + B) / 2;

        System.out.printf("%d %.1f", A+B, avr);
    }
}