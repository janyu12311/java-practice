import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class FilePractice4 {
    static HashMap<String,Integer> hm;
    public static void find(File f){
        File[] files = f.listFiles();
        for (File file : files) {
            if(file.isFile()){
                String[] split = file.toString().split("\\.");
                if(hm.containsKey(file.toString().split("\\.")[split.length-1])){
                   hm.put(file.toString().split("\\.")[split.length-1],hm.get(file.toString().split("\\.")[split.length-1])+1);
               }else{
                   hm.put(file.toString().split("\\.")[split.length-1],1);
               }
            }
            if(file.isDirectory()){
                find(file);
            }
        }
    }
    public static void main(String[] args) {
        hm=new HashMap<>();
        File f=new File("D:\\桌面\\手术室\\aaa");
         find(f);
        hm.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+" "+integer);
            }
        });
    }
}
