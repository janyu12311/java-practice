#include<bits/stdc++.h>
using namespace std;
const int MAX = 200007;
int res[MAX];
int S(int x){
    int ans = 0;
    while(x){
        ans += x % 10;
        x /= 10;
    }
    return ans;
}
int main(void){

    
    res[0] = 0;
    for(int i = 1; i<MAX; i++){
        res[i] = res[i-1] + S(i);
    }
    int t;cin>>t;
    for(int i = 0; i<t; i++){
        int m = 0;cin>>m;
        cout<<res[m]<<'\n';
    }
    return 0;
}