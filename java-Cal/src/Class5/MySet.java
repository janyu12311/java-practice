package Class5;

import java.util.*;
public class MySet {
    public HashMap<Node,List<Node>> setMap;
    public MySet(List<Node> list){
         for(Node node:list){
             List<Node> newList=new ArrayList<>();
             newList.add(node);
             setMap.put(node,newList);
         }
    }

    public boolean isSameSet(Node from,Node to){
        List<Node> fromList=setMap.get(from);
        List<Node> toList=setMap.get(to);
        return fromList==toList;
    }

    public void union(Node from,Node to){
        for(Node node:setMap.get(to)){
             setMap.get(from).add(node);
             setMap.put(node,setMap.get(from));
        }
    }


}
