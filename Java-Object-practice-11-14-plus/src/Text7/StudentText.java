package Text7;

public class StudentText {
    public static void main(String[] args) {
        Student[] arr=new Student[3];
        Student stu1=new Student("张三",202335,18);
        Student stu2=new Student("李四",202334,19);
//        Student stu3=new Student("王五",202336,20);
        Student stu4=new Student("圣诞节疯狂",20230812,25);
        arr[0]=stu1;
        arr[1]=stu2;
//        arr[2]=stu3;
        boolean flag=Contains(arr,stu4.getId());
        if(flag) {
            System.out.println("当前ID重复，请修改ID后再添加");
        }
        else{
            int count=getCount(arr);
            if(count==arr.length){
                  //已经存满
                Student[] newArr=creatNewArr(arr);
                newArr[count]=stu4;
                printArr(newArr);
            }
            else{
                arr[count]=stu4;
                printArr(arr);
            }


        }



    }
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getAge());

            }
        }
    }
    public static boolean Contains(Student[] arr,int id){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    return true;
                }
            }
            else{
                break;
            }
        }
        return false;
    }
    public static int getCount(Student[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr=new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    return i;
                }
            }
            else{
                break;
            }
        }
        return -1;
    }
}
