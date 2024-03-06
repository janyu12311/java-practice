#include <bits/stdc++.h>

using namespace std;

int g[205][205];
int w[1010],v[1010];
int b[205];
int dp[1010];
int t,x;
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int m,n;cin>>m>>n;
    for(int i = 1; i<=n; i++){
        cin >> w[i] >> v[i] >> x;
        t = max(t,x);
        b[t]++;
        g[t][b[t]] = i;
    }
    for(int i = 1; i<=t; i++){
        for(int j = m; j>=0; j--){
            for(int l = 1; l<= b[i]; l++){
                if(j >= w[g[i][l]]) dp[j] = max(dp[j] , dp[j - w[g[i][l]]] + v[g[i][l]]);
            }
        }
    }
    cout << dp[m] << endl;
    return 0;
}
