#include<bits/stdc++.h>
#define lc p<<1
#define rc p<<1|1
using namespace std;
typedef long long ll;
const ll N = 2e5 + 5;
ll a[N + 1];
struct Tree{
    ll l,r,s;
}tr[N * 4];
void build(ll p,ll l, ll r){
    tr[p].l = l;
    tr[p].r = r;
    tr[p].s = a[l];
    if(l == r) return;
    ll m = (l + r) >> 1;
    build(lc,l,m);
    build(rc,m+1,r);
    tr[p].s = tr[lc].s + tr[rc].s;
}
ll query(ll p,ll l,ll r){
    if(l <= tr[p].l && tr[p].r <=r )return tr[p].s;
    ll m = (tr[p].l + tr[p].r) >> 1;
    ll sum = 0;
    if(l <= m) sum += query(lc,l,r);
    if(r > m) sum += query(rc,l,r);
    return sum;
}
void update(ll p,ll pos){
    if(tr[p].l == pos && tr[p].r == pos) {
        tr[p].s = tr[p].s ^ 1;
        return;
    }
    ll m = (tr[p].l + tr[p].r) >> 1;
    if(pos <= m) update(lc,pos);
    if(pos > m) update(rc,pos);
    tr[p].s = tr[lc].s + tr[rc].s;
}
int main()
{
   std::ios::sync_with_stdio(false);
   int n; cin >> n;
   string str; cin >> str;
   if(n != 1){
     for(int i = 1; i<n; i++){a[i] = (str[i-1] - '0') ^ (str[i] - '0');}
     build(1,1,n-1);
   }
   n--;
   ll q; cin >> q;
   while(q-->0){
    ll choice,l,r;cin >> choice >> l >> r;
 

    if(choice == 1){
        if(n==0)continue;
        if(l!=1)update(1,l-1);
        if(r!= n+1) update(1,r);
    }else{   if(n == 0){
        cout << "YES" << endl;
        continue;
    }
        if(l == r || query(1,l,r-1) == (r-l)) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
   }
   return 0;
}
