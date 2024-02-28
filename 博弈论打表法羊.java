public class 博弈论打表法羊 {
    public static String winer(int res){
        if(res<=4){
            if(res == 0 || res == 2)return "后手";
            else return "先手";
        }
        int n = 1;
        while(true){
            if(winer(res - n).equals("后手")){
                return "先手";
            }
            if(n > res / 4)break;
            n *= 4;
        }
        return "后手";
    }
    public static void main(String[] args) {
        for(int i = 1; i<=50; i++){
            System.out.println(i + " : " + winer(i));
        }
    }
}
