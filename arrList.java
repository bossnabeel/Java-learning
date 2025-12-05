import java.util.Scanner;
import java.util.ArrayList;
class Person{
    public String name;
    public int id,age;
    public Person (int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public void get_info(){
        System.out.println("ID: "+id+" Name: "+name+" Age: "+age);
    }

}
public class arrList{
    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("number of people: ");
        int size=scanner.nextInt();
        
        for(int i=0; i<size; i++){
            scanner.nextLine();
            System.out.println("Enter your Name: ");
            String name=scanner.nextLine();

            System.out.println("Enter your Age: ");
            int age=scanner.nextInt();

            people.add(new Person(i+1,name,age));
        }
        for(Person person : people){
            person.get_info();
        }
        scanner.close();
    }
}