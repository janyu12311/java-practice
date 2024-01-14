import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\桌面\\手术室\\ccc.txt");
        System.out.println(f1.createNewFile());
        File f2=new File("D:\\桌面\\手术室\\eee\\bbb\\ccc");
        System.out.println(f2.mkdirs());
    }
}
