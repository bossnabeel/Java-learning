public class Person{
   public int id;
   public String name;
   public int age;
   public double marks;
   public Person(int id, String name, int age, double marks){
    this.id=id;
    this.name=name;
    this.age=age;
    this.marks=marks;
   }
   public void get_info(){
    System.out.println("ID: "+id+" Name: "+name+" Age: "+age+ " Marks : "+marks);
   }
}