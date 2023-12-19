package extendDemo4;

public class manager extends worker{
    private int manageWage;

    public manager() {

    }

    public manager(String id, String name, int wage, int manageWage) {
        super(id, name, wage);
        this.manageWage = manageWage;
    }

    public int getManageWage() {
        return manageWage;
    }

    public void setManageWage(int manageWage) {
        this.manageWage = manageWage;
    }

    @Override
    public void work() {
        System.out.println("在管理别人");
    }
}
