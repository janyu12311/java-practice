package textDemo;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Demo1 {
    public static boolean isCompleteTree(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        TreeNode left=null;
        TreeNode right=null;
        TreeNode cur=null;
        boolean isCBT=false;
        if(root==null){
            return true;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            cur=queue.pop();
            if(cur.left==null&&cur.right!=null){
                return false;
            }

            if(cur.left==null||cur.right==null){
                isCBT=true;
            }

            if((cur.left!=null||cur.right!=null)&&isCBT){
                return false;
            }
            if(cur.left!=null){
                queue.add(cur.left);
            }
            if(cur.right!=null){
                queue.add(cur.right);
            }

        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode treeHead=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        TreeNode t6=new TreeNode(6);
        treeHead.left=t2;
        treeHead.right=t3;
        t2.left=t4;
        t2.right=t5;
        t4.left=null;
        t4.right=null;
        t5.left=null;
        t5.right=null;
        t3.left=t6;
        t3.right=null;
        t6.left=null;
        t6.right=null;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Integer[] array = new Integer[list.size()];
        for(int i=0;i<array.length;i++){
            array[i]=list.get(i);
        }
        isCompleteTree(treeHead);
    }

}
