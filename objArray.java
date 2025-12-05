import java.util.Scanner;
import java.util.ArrayList;

public class objArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of people");
        int n=scanner.nextInt();
        int sum=0,max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        ArrayList <Person> people= new ArrayList<>();
        for(int i = 0; i<n; i++){
            scanner.nextLine();
            System.out.println("Enter Name of person");
            String name=scanner.nextLine();

            System.out.println("Enter Age of person");
            int age=scanner.nextInt();

            people.add(new Person(i+1, name, age));
        }
        for(Person p : people){
            sum+=p.age;
            if(p.age > max) {
                max = p.age;
                }
            if(p.age < min){ 
                min = p.age;
                }
        }
        System.out.println("Sum = "+sum+" Min = "+min+" Max = "+max);
        scanner.close();

    }
}