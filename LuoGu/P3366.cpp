#include <bits/stdc++.h>

using namespace std;
int f[5010];
struct Node{
    int a,b,w;
}node[200010];
int find(int x){
    if(x != f[x]) f[x] = find(f[x]);
    return f[x];
}
bool cmp(Node& a,Node &b){return (a.w < b.w);}
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n,m; cin >> n >> m;
    for(int i = 1; i<=n; i++)f[i] = i;
    for(int i = 1; i<=m; i++){
        cin >> node[i].a >> node[i].b >> node[i].w;
    }
    int cnt = 0;
    long long ans = 0;
    sort(node + 1, node + 1 + m, cmp);
    for(int i = 1; i<=m; i++){
        int f1 = find(node[i].a);
        int f2 = find(node[i].b);
        if(f1 != f2){
            cnt ++;
            ans += node[i].w;
            f[f1] = f2;
        }
    }
    if(cnt == n-1) cout << ans << endl;
    else cout << "orz" << endl;
    return 0;
}
