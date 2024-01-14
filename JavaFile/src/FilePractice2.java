import java.io.File;

public class FilePractice2 {
    public static void main(String[] args) {
        File f1=new File("D:\\桌面\\手术室\\aaa");
        File[] files = f1.listFiles();
        boolean is=false;
        for (File file : files) {
            if(file.toString().endsWith(".avi")){
                is=true;
                break;
            }
        }
        System.out.println(is);

    }
}
