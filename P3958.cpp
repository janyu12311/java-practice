#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
int f[1001];
int find(int x)
{
    if (x != f[x])
        f[x] = find(f[x]);
    return f[x];
}
ll calDis(ll x1, ll y1, ll z1, ll x2, ll y2, ll z2)
{
    return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2);
}
ll x[100001], y[100001], z[100001];
int high[100001], di[100001];
void solve()
{
    int n, h;
    ll r;
    cin >> n >> h >> r;
    for (int i = 1; i <= n; i++) f[i] = i;
    int tod = 0;
    int toh = 0;
    for (int i = 1; i <= n; i++)
    {
        cin >> x[i] >> y[i] >> z[i];
        if (z[i] + r >= h)
            high[toh++] = i;
        if (z[i] - r <= 0)
            di[tod++] = i;
        for (int j = 1; j <= i; j++)
        {
            if (calDis(x[i], y[i], z[i], x[j], y[j], z[j]) > 4 * r * r)
                continue;
            if (calDis(x[i], y[i], z[i], x[j], y[j], z[j]) <= 4 * r * r)
            {
                int a1 = find(i);
                int a2 = find(j);
                if (a1 != a2) f[a1] = a2;
            }
        }
    }
    bool ok = false;
    for (int i = 0; i < toh; i++)
    {
        for (int j = 0; j < tod; j++)
        {
            if (find(high[i]) == find(di[j]))
            {
                ok = true;
                break;
            }
        }
        if (ok) break;
    }
    if (ok)
        cout << "Yes" << endl;
    else
        cout << "No" << endl;
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