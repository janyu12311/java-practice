import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo1 {

    public static void main(String[] args) {
        File f=new File("D:\\桌面\\手术室\\aaa.txt");
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.exists());
        System.out.println("===================================================");
        File f2=new File("myFile\\a.txt");
        System.out.println(f2.getAbsolutePath());
        System.out.println(f.length());
        long l = f.lastModified();
        SimpleDateFormat sd=new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss");
        Date d=new Date(l);
        System.out.println(sd.format(d));

    }
}
