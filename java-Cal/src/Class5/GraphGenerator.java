package Class5;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphGenerator {
    public static Graph createGraph1(Integer[][] matrix){
        Graph graph=new Graph();
        for(int i=0;i<matrix.length;i++){
            Integer from=matrix[i][0];
            Integer to=matrix[i][1];
            Integer weight=matrix[i][2];
            if(!graph.nodes.containsKey(from)){
                graph.nodes.put(from,new Node(from));
            }
            if(!graph.nodes.containsKey(to)){
                graph.nodes.put(to,new Node(to));
            }
            Node fromNode=new Node(from);
            Node toNode=new Node(to);
            Edge newEdge=new Edge(weight,fromNode,toNode);
            graph.edges.add(newEdge);
            fromNode.outNum++;
            toNode.inNum++;
            fromNode.edges.add(newEdge);
        }
        return graph;
    }
    //广度优先遍历
    public static void bfs(Node node){
        if(node==null){
            return ;
        }
        HashSet<Node> set=new HashSet<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        set.add(node);
        while(!queue.isEmpty()){
            Node tmp=queue.poll();
            System.out.println(tmp.value);
            for(Node next:tmp.nexts) {
                if (!set.contains(next)) {
                    queue.add(next);
                    set.add(next);
                }
            }
        }
    }
    //深度优先遍历
    public static void dfs(Node node){
        if(node==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        HashSet<Node> set=new HashSet<>();
        stack.add(node);
        set.add(node);
        System.out.println(node.value);
        while(!stack.isEmpty()){
            Node cur=stack.pop();
            for(Node next:cur.nexts){
                if(!set.contains(cur)){
                    System.out.println(next.value);
                    stack.push(cur);
                    stack.push(next);
                    set.add(next);
                    break;
                }
            }
        }

    }



}
