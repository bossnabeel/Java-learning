public class Person{
   public int id;
   public String name;
   public int age;
   public Person(int id, String name, int age){
    this.id=id;
    this.name=name;
    this.age=age;
   }
   public void get_info(){
    System.out.println("ID: "+id+" Name: "+name+" Age: "+age);
   }
}