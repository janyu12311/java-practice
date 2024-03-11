#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n,k,p,q;cin>>n>>k>>p>>q;
    if(k * q <= n * p){
        cout << 0 << endl;
        return 0;
    }
    int x = (int)((k*q - p*n)/p);
    if((k*q - p*n)%p != 0) x ++ ;
    cout << x << endl;
    return 0;
}
