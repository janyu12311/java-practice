package Class3;


import org.w3c.dom.Node;

import java.util.Stack;

public class List {
    class Node {
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    //反转链表1
    //    public static boolean isPalindrome1(Node head){
//        Stack<Node> statck=new Stack<Node>();
//        Node tmp=head;
//        while(tmp!=null){
//          statck.push(tmp);
//          tmp=tmp.next;
//        }
//        while(head!=null){
//            if(head.val!=statck.pop().val){
//                return false;
//            }
//            head=head.next;
//        }
//
//        return true;
//    }
    //反转链表优化2
//    public static boolean isPalindrome2(Node head) {
//        if (head == null || head.next == null) {
//            return false;
//        }
//        Node n1 = head;
//        Node n2 = head;
//        while (n2.next != null && n2.next.next != null) {
//            n1 = n1.next;
//            n2 = n2.next.next;
//        }
//        n2 = n1.next;
//        n1.next = null;
//        Node n3 = null;
//        //翻转一半的链表
//        while (n2 != null) {
//            n3 = n2.next;
//            n2.next = n1;
//            n1 = n2;
//            n2 = n3;
//        }
//        n3 = n1;
//        n2 = head;
//        boolean res = true;
//        while (n1 != null && n2 != null) {
//            if (n1.val != n2.val) {
//                res = false;
//                break;
//            }
//            n1=n1.next;
//            n2=n2.next;
//        }
//        n1=null;
//        while(n3!=null){
//            n2=n3.next;
//            n3.next=n1;
//            n1=n3;
//            n3=n2;
//        }
//       return res;
//
//    }

    //快排链表版
    public static Node partition(Node head, int x){
         Node sH=null;
         Node sT=null;
         Node eH=null;
         Node eT=null;
         Node mH=null;
         Node mT=null;
         Node next=null;
         while(head!=null){
             next=head.next;
             head.next=null;
             //如果小于比较值
             if(head.val<x){
                 if(sH==null){
                     sH=head;
                     sT=head;
                 }else{
                     sT.next=head;
                     sT=head;
                 }
             }

             //如果是相等的情况
             else if(head.val==x){
                 if(eH==null){
                     eH=head;
                     eT=head;
                 }else{
                     eT.next=head;
                     eT=head;
                 }
             }
             //如果是大于的情况
             else{
                 if(mH==null){
                     mH=head;
                     mT=head;
                 }else{
                     mT.next=head;
                     mT=head;
                 }
             }
             head=next;
         }
         if(sT!=null){
             sT=eT;
             eT=eT==null?sT:eT;
         }
         if(eT!=null){
             eT.next=mH;
         }
         return sH!=null?sH:(eH!=null?eH:mH);

    }

    public static void main(String[] args) {

    }








}
