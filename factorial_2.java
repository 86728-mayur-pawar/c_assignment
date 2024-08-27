import java.util.Scanner;

public class factorial_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 1;
            for (int i = 1; i <= n; i++) {
                sum  = sum * i;
            }

            System.out.println(sum);
        }
    }
}
