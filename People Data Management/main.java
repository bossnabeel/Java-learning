import java.util.Scanner;
import java.util.ArrayList;

public class main{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Person> People = new ArrayList<>();
        System.out.println("Enter the num of People : ");
        int n=scanner.nextInt();
        for( int i = 0; i<n; i++){
            scanner.nextLine();
            System.out.println("Enter your Name : ");
            String name=scanner.nextLine();

            System.out.println("Enter you Age : ");
            int age=scanner.nextInt();

            System.out.println("Enter the marks of "+name+" : ");
            double marks=scanner.nextDouble();

            People.add(new Person(i+1, name,age,marks));

        }
        double sum=0;
        double max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;

        for( Person p : People){
            sum+=p.marks;
            if (min>p.marks) min=p.marks;
            if (max<p.marks) max=p.marks;


        }
        double avg=sum/n;

        System.out.println("Sum : "+sum+" Max : "+max+" Min : "+min+" Average : "+avg);
        scanner.close();
    }
}