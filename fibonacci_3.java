import java.util.Scanner;

public class fibonacci_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int a = 0, b = 1;
            System.out.println(a);
            System.out.println(b);
            
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }

    }
}
