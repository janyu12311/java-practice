package Test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter p=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        st.nextToken();
        int a= (int) st.nval;
        st.nextToken();
        String inp1=st.sval;
        p.println(a+" "+inp1);
        p.flush();
    }
}
