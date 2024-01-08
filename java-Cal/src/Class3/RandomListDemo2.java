package Class3;


public class RandomListDemo2 {

    public static Node copyRandomList(Node head){
        if(head==null){
            return null;
        }
        Node cur=head;
        Node next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=new Node(cur.val);
            cur.next.next=next;
            cur=next;
        }

        cur=head;
        Node copyNode=null;
        while(cur!=null){
            next=cur.next.next;
            copyNode=cur.next;
            copyNode.random=cur.random==null?null:cur.random;
            cur=next;
        }

        cur=head;
        Node res=head.next;
        while(cur!=null){
            next=cur.next.next;
            copyNode=cur.next;
            cur.next=next;
            copyNode.next=next!=null?next.next:null;
            cur=next;
        }
        return res;






    }


}
