#include<bits/stdc++.h>
using namespace std;
int a[110];
void solve(){
    int n;cin>>n;
    for(int i = 0; i<n;i++){
        cin>>a[i];
    }
    sort(a,a+n);
    long long sum = 0;
    for(int i = 1; i<n; i++){
        sum += a[i] - a[i-1];
    }
    cout<<sum<<endl;
}
int main(void){
    int n ;cin>>n;
    while(n-- >0){
        solve();
    }
    return 0;
}