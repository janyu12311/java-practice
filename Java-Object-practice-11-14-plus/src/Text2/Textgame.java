package Text2;

public class Textgame {
    public static void main(String[] args) {
          Text role1=new Text("乔峰",100,'男');
          Text role2=new Text("修泽志",100,'男');
          role1.getCharacter();
          role2.getCharacter();

//        while(true){
//            role1.attack(role2);
//            if(role2.getBlood()==0){
//                System.out.println(role1.getName()+"KO了"+role2.getName());
//                break;
//            }
//            role2.attack(role1);
//            if(role1.getBlood()==0){
//                System.out.println(role2.getName()+"KO了"+role1.getName());
//                break;
//            }
//        }

    }

}
