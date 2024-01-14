import java.io.File;
import java.io.IOException;

public class FilePractice1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\桌面\\手术室\\aaa\\eee.txt");
        f1.createNewFile();
    }
}
