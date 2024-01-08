package Class9;

public class Manacher {
    public static char[] manacherString(String str) {
        int index = 0;
        char[] charArr = str.toCharArray();
        char[] res = new char[charArr.length * 2 + 1];
        for (int i = 0; i < res.length; i++) {
            //i为偶数则加入#，为奇数就插入数据
            res[i] = (i & 1) == 0 ? '#' : charArr[index++];
        }
        return res;
    }
    public static int maxLcpsLength(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        int C=-1;
        int R=-1;
        char[] str=manacherString(s);
        int[] pArr=new int[str.length];
        int max=Integer.MIN_VALUE;
        //每个都要判断
        for(int i=0;i!=str.length;i++){
            //不用判断就可以放进去的大小
            //如果是在外面，就直接为本身1，如果在里面，取两种情况的最小值
            pArr[i]=R>i?Math.min(pArr[2*C-i],R-i):1;
            while(i+pArr[i]<str.length&&i-pArr[i]>-1){
                //虽然知道有两种不需要判断，但写成这样符合所有的情况
                if(str[i+pArr[i]]==str[i-pArr[i]]){
                    pArr[i]++;
                }else{
                    break;
                }
            }
            if(i+pArr[i]>=R){
                //如果i+pArr[i]大了,则更新数据
                R=i+pArr[i];
                C=i;
            }
            //取最大值
            max=Math.max(max,pArr[i]);
        }
        //最大值-1可以换个有#的图看看
        return max-1;
    }

    public static void main(String[] args) {
        System.out.println(maxLcpsLength("csadfdsfsdf"));
    }

}
