public class Dimension2Practice1 {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3},{4,5,6,7}};
        int[][] arr2={
                {1,2,3},
                {4,5,6,7}
        };
        for (int i = 0; i < arr2.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.print(arr[i][i1]+" ");
            }
            System.out.println();
        }
        int[][] arr3=new int[2][3];
        arr3[0][0]=10;
        for (int i = 0; i < arr3.length; i++) {
            for (int i1 = 0; i1 < arr3[i].length; i1++) {
                System.out.print(arr3[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
