#include<bits/stdc++.h>
using namespace std;
int n,V;
int s[31];
long long sums[33];
long long mx;
void dfs(int i,long long lose){
    if(i > n){
        mx = min(mx,lose);
        return;
    }
    if(lose >= sums[i]){
        mx = min(lose - sums[i],mx);
        return;
    }
    if(lose >= s[i]) dfs(i+1,lose - s[i]);
    dfs(i+1,lose);
}
bool cmps(int &a,int &b){
    return a > b ?true:false;
}
int main(void){
    cin>>V>>n;
    mx = V;
    for(int i =1; i<=n; i++){
        scanf("%d",&s[i]);
    }
    sort(s+1,s+n+1,cmps);
    for(int i = n; i>=1; i--){
        sums[i] = sums[i+1] + s[i];
    }
    dfs(1,V);
    cout<<mx<<endl;
    return 0;
}