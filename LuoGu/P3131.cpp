#include<bits/stdc++.h>
using namespace std;
int num[50005];
int first[7],last[7];
int main(void){
    int n;
    cin >> n;
    for(int i = 1; i<=n; i++){
        int tmp;
        cin>>tmp;
        num[i] = (num[i-1] + tmp)%7;
    }
    for(int i = n; i>=1; i--){
        first[num[i]] = i;
    }
    first[0] = 0;
    for(int i = 1; i<=n; i++){
        last[num[i]] = i;
    }
    int mx = 0;
    for(int i = 0; i<7; i++){
        mx = max(last[i] - first[i],mx);
    }
    cout<<mx<<endl;
    return 0;
}