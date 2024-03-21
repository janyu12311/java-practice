#include <bits/stdc++.h>

using namespace std;
void solve(){
    string s,t;
    cin >> s >> t;
    int lens,lent;
    lens = s.size();
    lent = t.size();
    if(lent == 1 && t[0] == 'a'){
        cout << 1 << endl;
        return;
    }
    int asNum = 0,atNum = 0;
    for(int i = 0; i<lens; i++) if(s[i] == 'a') asNum++;
    for(int i = 0; i<lent; i++) if(t[i] == 'a') atNum++;
    if(asNum && atNum){
        cout << -1 << endl;
        return;
    }
    cout << 2 * asNum << endl;
}
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    while(n -- > 0){
        solve();
    }
    return 0;
}
