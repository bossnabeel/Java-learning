class person{
    public int id;
    public String name;
    public void info(){
        System.out.print(name);
        System.out.print(id);
    }
}
public class main{
     public static void main(String[] args){
        person p1=new person();
        p1.id=1;
        p1.name="Nabeel";
        p1.info();
    }
}