#include <bits/stdc++.h>

using namespace std;
typedef unsigned long long ll;
ll h[1000010],p[1000010],p2[1000010];
const int Hash = 131;
const ll M = pow(2,64);
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    string ans;
    string tmp;cin>>tmp;
    p[0] = 1,h[0] = 0,p2[0] = 0;
    int aLen = tmp.size();
    for(int i = 1; i<=aLen; i++){
        p[i] = p[i-1] * Hash;
        h[i] = (h[i-1] * Hash + tmp[i-1]) % M;
    }
    ans += tmp;
    for(int i = 1; i<n; i++){
        cin >> tmp;
        int same = 0;
        int sLen = tmp.size();
        if(aLen < sLen){
            for(int j = aLen + 1; j<= sLen; j++) p[j] = (p[j-1] * Hash) % M;
        }
        for(int j = 1; j<=sLen; j++){
            p2[j] = (p2[j-1] * Hash + tmp[j-1]) % M;
            if(j <= aLen && p2[j] - p2[0] * p[j] == h[aLen] - h[aLen - j] * p[j]) same = j;
        }
        ans += tmp.substr(same,sLen);
        aLen = sLen;
        for(int j = 1; j<= sLen; j++) h[j] = p2[j];
    }
    cout << ans << endl;
    return 0;
}
