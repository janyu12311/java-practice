#include<bits/stdc++.h>
using namespace std;
int timeS[105];
int low[105];
int high[105];
void solve(){
    int n,tem;cin >> n >> tem;
    for(int i = 1; i<=n; i++){
        scanf("%d %d %d",&timeS[i],&low[i],&high[i]);
    }
    int mn = tem,mm = tem;
    for(int i = 1; i<= n; i++){
        mn = mn + timeS[i] - timeS[i-1];
        mm -= timeS[i] - timeS[i-1];
        if(mn >= low[i] && mm <= high[i]){
            mm = max(mm,low[i]);
            mn = min(mn,high[i]);
        }else{
            cout<<"NO"<<endl;
            return;
        }
    }
    cout<<"YES"<<endl;
}
int main(void){
    int n ;
    cin >> n;
    while(n-- >0){
        solve();
    }
    return 0;
}