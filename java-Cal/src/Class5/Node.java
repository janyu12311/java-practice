package Class5;

import java.util.ArrayList;

public class Node {
    public int value;
    public int inNum;
    public int outNum;
    public ArrayList<Node> nexts;
    public ArrayList<Edge> edges;

    public Node(int value){
        this.value=value;
        inNum=0;
        outNum=0;
        nexts=new ArrayList<>();
        edges=new ArrayList<>();
    }
}
