package Class5;

import java.util.*;

public class TopologySort {
    public static List<Node> GraphTopologySort(Graph graph){
        HashMap<Node,Integer> inMap=new HashMap<>();
        Queue<Node> queue=new LinkedList<>();
        for(Node cur:graph.nodes.values()){
            inMap.put(cur,cur.inNum);
            if(cur.inNum==0){
                queue.add(cur);
            }
        }
        List<Node> result=new ArrayList<>();
        while(!queue.isEmpty()){
            Node cur=queue.poll();
            result.add(cur);
            for(Node node:cur.nexts){
                inMap.put(node,inMap.get(node)-1);
                if(inMap.get(node)==0){
                    queue.add(node);
                }
            }
        }
        return result;
    }
}
