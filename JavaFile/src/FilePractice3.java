import java.io.File;

public class FilePractice3 {
    public static boolean is(File f){
        File[] files = f.listFiles();
        for (File file : files) {
            if(file.isFile()){
                if(file.toString().endsWith(".avi")){
                    return true;
                }
            }
            if(file.isDirectory()){
                if(is(file)){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        File f1=new File("D:\\桌面\\手术室\\aaa");
        System.out.println(is(f1));
    }
}
