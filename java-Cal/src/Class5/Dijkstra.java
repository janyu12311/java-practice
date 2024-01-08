package Class5;

import java.util.*;
public class Dijkstra {
    //找头结点到各个节点的最小距离
    public static HashMap<Node,Integer> dijkstraSort(Graph graph,Node head){
        HashMap<Node,Integer> distanceMap=new HashMap<>();
        distanceMap.put(head,0);
        HashSet<Node> selectNodes=new HashSet<>();
        Node minNode=getMidDistance(distanceMap,selectNodes);
        while(minNode!=null){
            int length=distanceMap.get(minNode);
            for(Edge edge:minNode.edges){
                if(!distanceMap.containsKey(edge.to)){
                    distanceMap.put(edge.to,length+edge.weight);
                }
                distanceMap.put(edge.to,Math.min(length+ edge.weight,distanceMap.get(edge.to)));
            }
            selectNodes.add(minNode);
            minNode=getMidDistance(distanceMap,selectNodes);
        }
        return distanceMap;
    }
    public static Node getMidDistance(HashMap<Node,Integer> distanceMap,HashSet<Node> selectNodes){
        Node minNode=null;
        int misDistance=Integer.MAX_VALUE;
        for (Map.Entry<Node, Integer> entry : distanceMap.entrySet()) {
            if(!selectNodes.contains(entry.getKey())&&entry.getValue()<misDistance){
                minNode=entry.getKey();
                misDistance=entry.getValue();
            }
        }
        return minNode;
    }
}
