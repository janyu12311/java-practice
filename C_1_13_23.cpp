#include<bits/stdc++.h>
using namespace std;
int reverse(int num){
    int tmp = 0;
    while(num){
        tmp = tmp*10 + num%10;
        num /= 10;
    }
    return tmp;
}
bool isSushu(int x){
    if(x == 1) return false;
    if(x == 2) return true;
    for(int i = 2; i + i <=x; i++){
        if(x % i == 0) return false;
    }
    return true;
}
int main(void){
    int flag = 0;
    int have = 0;
    int s,e;cin>>s>>e;
    for(int i = s; i<=e; i++){
        if(isSushu(i) &&isSushu(reverse(i))){
            have = 1;
            if(!flag){
                flag = 1;
                cout<<i;
            }else{
                cout<<','<<i;
            }
        }
    }
    if(!have)cout<<"No";
    return 0;
}