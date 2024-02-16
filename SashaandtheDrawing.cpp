#include<bits/stdc++.h>
using namespace std;
void solve(){
    int n,k;cin>>n>>k;
    if(k <= 4*n - 4){
        if(k%2==0){
            cout<<(k>>1)<<endl;
        }else{
            cout<<(k>>1) + 1<<endl;
        }
    }else if(k == 4*n-3){
        cout<<n+n-1<<endl;
    }else{
        cout<<(n<<1)<<endl;
    }
}
int main(void){
    int n; cin>>n;
    while(n-- >0){
        solve();
    }
    return 0;
}