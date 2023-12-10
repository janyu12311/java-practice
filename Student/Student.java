package Student;

public class Student {
    private String name;
    private int age;
    private int index;

    public Student(){
        System.out.println("看看我执行了没");
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
   public String getName(){
        return name;
   }
    public int getAge(){
        return age;
    }

}
