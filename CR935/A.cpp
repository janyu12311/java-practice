#include <bits/stdc++.h>

using namespace std;
void solve(){
    int a,b,c;cin>> a>> b >> c;
    if(b % 3 != 0 && 3 - (b % 3) > c){
        cout << -1 << endl;
        return;
    }
    int ans = a;
    if(b % 3 == 0) ans += b / 3;
    else{
        ans += b / 3 + 1;
        c = c - (3 - (b % 3));
    }
    ans += c / 3;
    if(c % 3 != 0) ans ++;
    cout << ans << endl; 
}
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin>>n;
    while(n-- > 0){
        solve();
    }
    return 0;
}
