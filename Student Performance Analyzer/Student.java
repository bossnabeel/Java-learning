public class Student{
   public int id;
   public String name;
   public int age;
   public double marks;
   public char grade;

   public Student(int id, String name, int age, double marks){
    this.id=id;
    this.name=name;
    this.age=age;
    this.marks=marks;
   }

   public void assign_grade(){
      if(marks >= 80){ grade='A';}
      else if (marks/5 <= 79 && marks/5 >= 60) {grade='B';}
      else if (marks/5 <=59 && marks/5 >=40) {grade='C';}
      else if (marks/5 <40) {grade='F';}
      else {}
   }

   public void show_info(){
    System.out.println("ID: "+id+" Name: "+name+" Age: "+age+ " Marks : "+marks+" Grade : "+grade);
   }

}