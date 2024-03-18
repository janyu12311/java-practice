#include <bits/stdc++.h>

using namespace std;
int cnt;
typedef long long ll;
ll ans[1000000];
int head[1000000];
bool vis[1000000];
struct edge{
    int to;
    int w;
    int nextt;
}edge[1000000];
void add(int u,int v,int w){
    edge[++cnt].to = v;
    edge[cnt].w = w;
    edge[cnt].nextt = head[u];
    head[u] = cnt;
}
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n,m,s; cin >> n >> m >> s;
    for(int i = 1; i<=n; i++)ans[i] = 2147483647;
    ans[s] = 0;
    for(int i = 1; i<=n; i++){
        int a,b,c; cin >> a >> b >> c;
        add(a,b,c);
    }

    return 0;
}
