package Class7;

public class BigValueBag {
    public static int progress(int[] weight,int[] values,int alreadyWeight,int alreadyValues,int i,int bigWeight){
        if(bigWeight<alreadyWeight){
            return 0;
        }
        if(i == values.length){
            return alreadyValues;
        }
       return Math.max( progress(weight,values,alreadyWeight,alreadyValues,i+1,bigWeight),
        progress(weight,values,alreadyWeight+weight[i],
                alreadyValues+values[i],
                i+1,bigWeight));
    }
}
