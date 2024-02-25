#include<bits/stdc++.h>
using namespace std;
int a[9];
string str;
int out;
int index;
int outA[12];
bool isSu(int x){
    if(x == 1)return false;
    if(x == 2) return true;
    if(x % 2 == 0) return false;
    for(int i = 2;i*i<=x;i++){
        if(x % i == 0) return false;
    }
    return true;
}
void dfs(int i){
    if(i == 8){
        int tmp = 0;
        for(int j = 7;j>=0;j--){
            tmp = tmp * 10 + a[j];
        }
        if(isSu(tmp)){
             out++;
        }
        return;
    }
    if(a[1] == 3 && a[0]>1)return;
    if(a[1] > 3) return;
    if(a[3]>1)return;
    if(a[3] == 1 && a[2] > 2)return;
    if(i == 4){
        int tmp = 0;
        for(int j = 3; j>=0; j--){
            tmp = tmp *10 +a[j];
        }
        if(!isSu(tmp)) return;
    }
    if(str[i] != '-'){
        a[i] = str[i] - '0';
        dfs(i+1);
    }else{
        for(int j = 0;j<=9; j++){
            a[i] = j;
            dfs(i+1);
            a[i] = 0;
        }
    }
}
void solve(){
    memset(a,0,sizeof(a));
    out = 0;
    getchar();
    cin>>str;
    reverse(str.begin(),str.end());
    dfs(0);
    outA[index++] = out;
}
int main(void){
    int n;cin>>n;
    while(n-- > 0){
        solve();
    }
    for(int i = 0;i<index;i++){
        cout<<outA[i]<<endl;
    }
    return 0;
}