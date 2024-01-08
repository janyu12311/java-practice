package Class7;

import java.util.*;

public class ReverseStack {
    public static void reverse(Stack<Integer> stack){
        int result=stack.pop();
        if(stack.isEmpty()){
           return;
        }
         int last=f(stack);
         reverse(stack);
         stack.push(last);

    }
    public static int f(Stack<Integer> stack){
        int result=stack.pop();
        if(stack.isEmpty()){
            return result;
        }else{
            int last=f(stack);
            stack.push(result);
            return last;
        }
    }
}
