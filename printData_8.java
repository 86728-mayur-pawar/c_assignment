import java.util.Scanner;


class data{
    String name;
    String rollnumber;
    int marks;

    public data(String name, String rollnumber, int marks) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }

    void printData(){
        System.out.println("Name is : "+name + "\nRollNumber : "+rollnumber + "\nMarks :"+marks);
    }
    

}
public class printData_8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            String roll = sc.nextLine();
            int marks = sc.nextInt();
            data d = new data(name, roll, marks);
            d.printData();
        }
    }
}
