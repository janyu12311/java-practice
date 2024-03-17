#include <bits/stdc++.h>

using namespace std;
typedef long long LL;
int a[100010];
int pre[100010];
int main(void)
{
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++)
        cin >> a[i];
    LL zheng = 0;
    LL fu = 0;
    for (int i = 1; i <= n; i++)
    {
        if (i != 1)
        {
            pre[i] = a[i] - a[i - 1];
            if (pre[i] > 0)
                zheng += pre[i];
            else
                fu += abs(pre[i]);
        }
    }
    cout << max(zheng, fu) << '\n'
         << abs(zheng - fu) + 1;
    return 0;
}