package extendDemo4;

public class worker {
    public String id;
    public String name;
    public int wage;

    public worker() {
    }

    public worker(String id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public void eat(){
        System.out.println("吃米饭");
    }
    public void work(){
        System.out.println("在工作中...");
    }
}
