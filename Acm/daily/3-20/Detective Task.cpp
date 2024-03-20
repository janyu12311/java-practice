#include <bits/stdc++.h>

using namespace std;

void solve(){
    string str; cin >> str;
    int len = str.size();
    int left = 0;
    int right = len - 1;
    for(int i = 0; i<len ;i++)if(str[i] == '1') left = i;
    for(int i = left; i<len; i++)if(str[i] == '0'){ right = i;break;}
    cout << right - left + 1 << endl;
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
