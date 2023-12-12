public class Practice1 {
    public static void main(String[] args) {
        int[][] arr={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int sum=0;
        int sumjidu=0;
        for (int i = 0; i < arr.length; i++) {
            sumjidu=0;
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                sumjidu+=arr[i][i1];
                sum+=arr[i][i1];
            }
            System.out.println("第"+(i+1)+"季度的"+sumjidu);
        }
        System.out.println("总营业额为"+sum);

    }
}
