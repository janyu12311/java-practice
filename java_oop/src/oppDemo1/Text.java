package oppDemo1;

public class Text {
    public static void main(String[] args) {
        Student s=new Student("张三",18);
        Teacher t=new Teacher("纳西妲",12);
        Administrator a=new Administrator("芙芙",18);
        register(s);
        register(t);
        register(a);

    }

    public static void register(Person p){
       p.show();
    }
}
