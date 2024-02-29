#include <bits/stdc++.h>

using namespace std;
int a[210][210];
int dp[210];
int n;

int main(void)
{
    cin >> n;
    for (int i = 1; i < n; i++)
    {
        for (int j = i + 1; j <= n; j++)
        {
            cin >> a[i][j];
        }
        dp[i] = 1e9;
    }
    for(int i = n-1; i>=1; i--){
        for(int j = i + 1; j<=n; j++){
            dp[i] = min(dp[i],dp[j] + a[i][j]);
        }
    }
    cout<<dp[1]<<endl;
    
}