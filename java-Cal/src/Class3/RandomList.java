package Class3;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class RandomList {
    public static Node copyRandomList(Node head){
        HashMap<Node,Node> hashMap=new HashMap<Node,Node>();
        Node cur=head;
        while(cur!=null){
            hashMap.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            hashMap.get(cur).random=hashMap.get(cur.random);
            hashMap.get(cur).next=hashMap.get(cur.next);

            cur=cur.next;
        }

        return hashMap.get(head);



    }

}
