#include <bits/stdc++.h>

using namespace std;
int arr[3];
void solve(){
    for(int i = 0; i<3; i++)cin >> arr[i];
    if(arr[0] < arr[1] && arr[1] < arr[2]) cout << "STAIR" << endl;
    else if(arr[0] < arr[1] && arr[1] > arr[2]) cout << "PEAK" << endl;
    else cout << "NONE" << endl;
}
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    while(n -- > 0) solve();
    return 0;
}
