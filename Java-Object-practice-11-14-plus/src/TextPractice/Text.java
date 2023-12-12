package TextPractice;

import java.util.Random;

public class Text {
    private String name;
    private int blood;

    public Text(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    //定义一个方法去攻击别人
    public void attack(Text role){
        Random r=new Random();
        int hurt=r.nextInt(20)+1;
        int remainBlood= role.getBlood()-hurt;
        //判断是否血量大于0
        remainBlood=remainBlood<0?0:remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName()+"举起了拳头,打了"
        +role.getName()+"一拳,造成了"+hurt+","+role.getName()+"还剩下"+role.getBlood()+"血量");
    }

}
