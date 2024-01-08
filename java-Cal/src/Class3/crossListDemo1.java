package Class3;

public class crossListDemo1 {
    public static Node bothLoop1(Node head1,Node head2){
        Node cur1=head1;
        Node cur2=head2;
        int len1=0;
        int len2=0;
        while(cur1.next!=null){
            cur1=cur1.next;
            len1++;
        }
        while(cur2.next!=null){
            cur2=cur2.next;
            len2++;
        }
        if(cur1!=cur2){
            return null;
        }
        int len=len1-len2;
        cur1=len>0?head1:head2;
        cur2=cur1==head1?head2:head1;
        len=Math.abs(len);
        while(len!=0){
            cur1=cur1.next;
            len--;
        }
        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;


    }
}
