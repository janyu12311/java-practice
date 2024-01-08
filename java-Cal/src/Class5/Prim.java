package Class5;

import java.util.*;
public class Prim{
    public static List<Edge> PrimSort(Graph graph){
        //小根堆
        PriorityQueue<Edge> priorityQueue =new PriorityQueue<>((o1,o2)->{
                return o1.weight-o2.weight;
            }
        );
        List<Edge> result=new ArrayList<>();
        HashSet<Node> set=new HashSet<>();


        for(Node node :graph.nodes.values()){
            if(!set.contains(node)){
                for(Edge edge:node.edges){
                    priorityQueue.add(edge);
                }
                set.add(node);
            }
            while(!priorityQueue.isEmpty()){
                Edge edge=priorityQueue.poll();
                if(!set.contains(edge.to)){
                    set.add(edge.to);
                    result.add(edge);
                    for(Edge toedge:edge.to.edges){
                        priorityQueue.add(toedge);
                    }
                }
            }

        }


        return result;
    }



}
