package textDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Demo2 {

    public static boolean isMatch(String s, String p) {
        boolean isHave=false;
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='*'&&!isHave){
                isHave=true;
                sb1.append(p.charAt(i));
            }
            else if(p.charAt(i)=='*'&&isHave){
                continue;
            }
            else if(p.charAt(i)!='*') {
                sb1.append(p.charAt(i));
            }
        }
        String rex=sb1.toString();
        return s.matches(rex);
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<ListNode> list=new ArrayList<ListNode>();
        ListNode cur=head;
        int len=0;
        while(cur!=null){
            len++;
            ListNode next=cur.next;
            cur.next=null;
            list.add(cur);
            cur=next;
        }
        ListNode[] arr=new ListNode[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        for(int i=0,j=i+k;j<len;i+=k,j=i+k){
            for(int h=i;h<j;h++){
                for(int l=i;l<j-h-1;l++){
                    ListNode tmp=arr[l];
                    arr[l]=arr[l+1];
                    arr[l+1]=tmp;
                }
            }
        }
        ListNode newhead=arr[0];;
        cur=newhead;
        for(int i=1;i<arr.length;i++){
            cur.next=arr[i];
            cur=cur.next;
        }
        return newhead;
    }

    public static void main(String[] args){
        String s="abc";
        String p="a*********bc";
        System.out.println(isMatch(s,p));
    }



}
