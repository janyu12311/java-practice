import java.util.LinkedList;
import java.util.Scanner;

public class P1364 {

    static class Node{
        int fu,lt,rt,val,id;
        public Node(int fu,int lt,int rt,int val){
            this.fu = fu;
            this.lt = lt;
            this.rt = rt;
            this.val = val;
        }
    }
    public static Node[] trs;
    public static int bfs(Node tn,boolean[] vis){
        LinkedList<Node> list = new LinkedList<>();
        int sheng = 1;
        list.addLast(tn);;
        int ans = 0;
        int cur = 0;
        int cheng = 1;
        while(!list.isEmpty()){
            Node cr = list.pollFirst();
            sheng--;
            vis[cr.id] = true;
            if(cr.fu != 0 && !vis[cr.fu]){
                cur ++;
                list.addLast(trs[cr.fu]);
                ans += cheng * trs[cr.fu].val;
                vis[cr.fu] = true;
            }if(cr.lt != 0 && !vis[cr.lt]){
                cur ++;
                list.addLast(trs[cr.lt]);
                ans += cheng * trs[cr.lt].val;
                vis[cr.lt] = true;
            }if(cr.rt != 0 && !vis[cr.rt]){
                cur ++;
                list.addLast(trs[cr.rt]);
                ans += cheng * trs[cr.rt].val;
                vis[cr.rt] = true;
            }
            if(sheng == 0){
                sheng = cur;
                cheng ++;
                cur = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fus = new int[n+1];
        trs = new Node[n + 1];
        for(int i = 1; i<=n; i++){
            int w = sc.nextInt();int lt = sc.nextInt();
            int rt = sc.nextInt();
            fus[lt] = i;
            fus[rt] = i;
            trs[i] = new Node(0,lt, rt, w);trs[i].id = i;
        }
        for(int i = 1; i<=n; i++){
            if(fus[i] == 0)continue;
            trs[i].fu = fus[i];
        }
        boolean[] vis = new boolean[n + 1];
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j<= n; j++)vis[j] = false;
            ans = Math.min(bfs(trs[i], vis),ans);
        }
        System.out.println(ans);
        sc.close();
    }
}