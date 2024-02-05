import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class C1_10_10{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp =  br.readLine();
        String[] strs = tmp.split("[ ]+");
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(int i = 0;i<strs.length;i++){
            if(!pq.contains(strs[i]))  pq.add(strs[i]);
           
        }
        int tmpLen = pq.size();
        for(int i = 0 ;i<tmpLen;i++){
            if(i!=tmpLen-1){
                System.out.println(pq.poll());
            }else{
                System.out.print(pq.poll());
            }            
        }
    }
}
