import java.util.Scanner;

public class mesageDisplay_5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().charAt(0);

            if (ch >= 65 && ch <= 90) {
                System.out.println(ch + " is Uppercase letter");
            }else  if(ch >= 97 && ch <= 122){
                System.out.println(ch + " is lowercase letter");
            }else if(ch >= 48 && ch <= 57){
                System.out.println(ch + " is a number");
            }else {
                System.out.println(ch + " is other char");
            }
        }
    }
}
