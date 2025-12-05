import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String [] args){
        ArrayList<Student> student = new ArrayList<>();
        Scanner scanner = new  Scanner(System.in);
        System.out.println("number of student");
        int n=scanner.nextInt();
        for(int i=0; i<n; i++){
            scanner.nextLine();
            System.out.println("name of student");
            String name=scanner.nextLine();

            System.out.println("age of student");
            int age=scanner.nextInt();

            System.out.println("marks of student");
            double marks=scanner.nextDouble();

            student.add(new Student(i+1, name, age, marks));
            
        }
        double sum=0, min=Double.MAX_VALUE,max=Double.MIN_VALUE;
        String Topper="";
        String LowestScore="";
        System.out.println("\n--- Student Details ---");
        for(Student s: student){
            s.assign_grade();
            s.show_info();
            sum+=s.marks;
            if(min>s.marks) {
                min=s.marks;
                LowestScore=s.name;
            }
            if (max<s.marks){ 
                max=s.marks;
                Topper=s.name;
            }

        }
        double avg=sum/n;
        System.out.println("Topper: " + Topper +" Lowest Score : "+LowestScore+" Sum : "+sum);
        System.out.println("average : "+avg);

    }
}