import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        double deg = sc.nextDouble();

        if ( deg < 0 ) {
            System.out.printf("ice");
        }
        else if ( deg > 100 ) {
            System.out.printf("vapor");
        }
        else {
            System.out.printf("water");
        }
    }
}