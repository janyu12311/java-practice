#include <cmath>
#include <iostream>
#include <cstdlib>
#include <algorithm>
#include <string.h>
using namespace std;
char str1[1010],str2[1010];
int dp[1010][1010],len1,len2;
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    while(~scanf(" %s",str1)){
        scanf(" %s",str2);
        len1 = strlen(str1);
        len2 = strlen(str2);
        memset(dp,0,sizeof(dp));
        for(int i = 1; i<=len1; i++){
            for(int j = 1; j<=len2; j++){
                if(str1[i-1] == str2[j-1]) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
            }
        }
        cout << dp[len1][len2] << endl;
    }
    return 0;
}
