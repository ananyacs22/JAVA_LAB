import java.util.Scanner;
class Student {
    String USN;
    String Name;
    void accept(String USN, String Name) {
        this.USN =USN;
        this.Name =Name;
    }
     void display() {
        System.out.println( "Name: " + this.Name+", USN: " +this.USN );
    }
}
public class Program4_StudentDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter student's name and USN :");
        s1.Name=sc.nextLine();
        s1.USN=sc.next();
        s1.accept(s1.Name, s1.USN);
        Student s2 = new Student();
        s2.accept("Anush","1WA25CS011");
        System.out.println("--- Student Details ---");
        s1.display();
        s2.display();
    }
}