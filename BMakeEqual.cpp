#include<bits/stdc++.h>
using namespace std;
int pop[200010];
void solve(){
    int n;
    cin >> n;
    long sum = 0;
    for(int i = 1; i<=n; i++){
        cin >> pop[i];
        sum += pop[i];
    }
    int lose = 0;
    int p = sum / n;
    for(int i = 1; i<=n; i++){
        if(pop[i] >= p){
            lose += pop[i] - p;
        }else{
            if(p - pop[i] > lose){
                printf("NO\n");
                return;
            }else{
                lose = lose - p + pop[i];
            }
        }
    }
    printf("YES\n");
}
int main(void){
    int n;
    cin >> n;
    while(n-- > 0){
        solve();
    }
    return 0;
}