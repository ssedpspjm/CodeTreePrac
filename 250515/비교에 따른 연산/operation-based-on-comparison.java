import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.printf("%d", a*b);
        }
        else {
            System.out.printf("%d", b/a);
        }
    }
}