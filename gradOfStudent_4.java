import java.util.Scanner;

public class gradOfStudent_4 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int marks = sc.nextInt();

            
            if (marks>=90) {
                System.out.println("Grade:EX");
            }else if(marks >= 80){
                System.out.println("Grade:A");
            }else if(marks >= 70){
                System.out.println("Grade:B");
            }else if(marks >= 60){
                System.out.println("Grade:C");
            }else{
                System.out.println("Grade:F");
            }
        }
    }
}
