#include <bits/stdc++.h>

using namespace std;
int s[105];
int v[105][105],w[105][105],f[105][105];
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n,m;cin>>n>>m;
    for(int i = 1; i<=n; i++){
        cin >> s[i];
        for(int j = 1; j<=s[i]; j++){
            cin >> w[i][j] >> v[i][j];
        }
    }
    for(int i = 1; i<=n; i++){
        for(int j = 0; j<=m; j++){
            f[i][j] = f[i-1][j];
            for(int k = 1; k<=s[i]; k++){
                if(j>=w[i][k])f[i][j] = max(f[i][j],f[i-1][j-w[i][k]]+v[i][k]);
            }
        }
    }
    cout << f[n][m] << endl;
    return 0;
}
