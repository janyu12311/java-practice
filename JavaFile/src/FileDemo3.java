import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File f=new File("D:\\桌面\\手术室\\aaa");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
