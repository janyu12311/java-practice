#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
ll par[3000010], val[3000010];
ll find(int a)
{
    if (a == par[a])
        return a;
    int t = find(par[a]);
    val[a] += val[par[a]];
    return par[a] = t;
}
void merge(int a, int b, ll value)
{
    int p1 = find(a);
    int p2 = find(b);
    par[p1] = p2;
    val[p1] = value + val[b] - val[a];
}
void solve()
{
    int n, m;
    cin >> n >> m;
    for (int i = 1; i <= n; i++)
    {
        par[i] = i;
        val[i] = 0;
    }
    int ans = 0;
    for (int i = 1; i <= m; i++)
    {
        int choice, a, b;
        ll value;
        cin >> choice >> a >> b >> value;
        if(ans) continue;
        if (choice == 1) value = -value;
        if (find(a) == find(b))
        {
            if (val[a] - val[b] != value)
            {
                ans = i;
                continue;
            }
        }else{
            merge(a,b,value);
        }
    }
    if(ans) cout << ans << endl;
    else cout << "gxljj so beautiful" << endl;
}
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin >> n;
    while (n-- > 0)
    {
        solve();
    }
    return 0;
}
