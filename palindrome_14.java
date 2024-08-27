import java.util.Scanner;

public class palindrome_14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String st = sc.nextLine();
            System.out.println(isPalindrome(st));
        }
    }

    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
