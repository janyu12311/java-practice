public class 最小袋子数 {
    static public int minBagBase6(int apple){
        return apple%6 == 0? apple / 6 : -1;
    }
    static public int minF(int apples){
        if(apples < 6)return -1;
        int bag6 = -1;
        int bag8 = apples / 8;
        int res = apples - 8*bag8;
        while(res<24 && bag8 >=0){
            int resUse6 = minBagBase6(res);
            if(resUse6 != -1){
                bag6 = resUse6;
                break;
            }
            res = apples - 8*(--bag8);
        }
        return bag6 == -1 ? -1 : bag6+bag8;
    }
}
