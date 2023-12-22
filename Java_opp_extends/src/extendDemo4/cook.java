package extendDemo4;

public class cook extends worker{
    public cook() {
    }

    public cook(String id, String name, int wage) {
        super(id, name, wage);
    }

    @Override
    public void work() {
        System.out.println("在做饭");
    }
}
