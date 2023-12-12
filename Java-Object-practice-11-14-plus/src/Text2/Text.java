package Text2;

import java.util.Random;

public class Text {
    private String name;
    private int blood;
    private char gander;
    private String face;
    String[] boyFaces={"温文尔雅","仪表不凡","气宇不凡","英俊潇洒","玉树临风","光明磊落"};
    public String getface() {
        return face;
    }
    public Text(String name, int blood, char gander) {
        this.name = name;
        this.blood = blood;
        this.gander = gander;
    }
    public void getCharacter(){
        System.out.println("姓名为"+getName());
        System.out.println("血量为为"+getBlood());
        System.out.println("性别为"+getGander());
        getFace(this.gander);
        System.out.println("容貌为"+getface());
    }

    public void getFace(char gander){
        Random r=new Random();
        if(gander=='男'){
            int index=r.nextInt(boyFaces.length);
            this.face=boyFaces[index];
        }
    }
    public char getGander() {
        return gander;
    }

    public void setGander(char gander) {
        this.gander = gander;
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
