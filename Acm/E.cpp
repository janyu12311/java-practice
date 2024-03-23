#include <bits/stdc++.h>
#define lt p<<1
#define rt p<<1|1
using namespace std;
typedef long long ll;
const int MAXN = 2e5 + 1;

struct Tree{
    ll ls,rs,s,ms;
}tr[MAXN << 2];
int a[MAXN];
void pushup(int p){
    tr[p].s = tr[lt].s + tr[rt].s;
    tr[p].ls = max(tr[lt].ls,tr[lt].s + tr[rt].ls);
    tr[p].rs = max(tr[rt].rs,tr[rt].s + tr[lt].rs);
    tr[p].ms = max(max(tr[lt].ms,tr[rt].ms),tr[lt].rs+tr[rt].ls);
}
void build(int p,int l,int r){
    if(l == r){
        tr[p].ls = tr[p].rs = tr[p].s = tr[p].ms = a[l];
        return;
    }
    int m = (l + r) >> 1;
    build(lt,l,m);
    build(rt,m+1,r);
    pushup(p);
}
void update(int p,int pos,ll value,int l,int r){
    if(l == r){
        ll tmp = tr[p].ms + value;
        tr[p].ls = tr[p].rs = tr[p].s = tr[p].ms = tmp;
        return;
    }
    int m = (l + r) >> 1;
    if(pos <= m) update(lt,pos,value,l,m);
    else update(rt,pos,value,m+1,r);
    pushup(p);
}
Tree query(int p, int L, int R,int l,int r){
    if(L <= l && r <= R){
        return tr[p];
    }
    int m = (l + r) >> 1;
    Tree ans,f1,f2;
    if(R <= m)ans = query(lt,L,R,l,m);
    if(L > m) ans = query(rt,L,R,m+1,r);
    if(L <= m && R > m){
        f1 = query(lt,L,R,l,m);
        f2 = query(rt,L,R,m+1,r);
        ans.s = f1.s + f2.s;
        ans.ls = max(f1.ls,f1.s + f2.ls);
        ans.rs = max(f2.rs,f2.s + f1.rs);
        ans.ms = max(max(f1.ms,f2.ms),f1.rs+f2.ls);
    }
    return ans;
}
int main()
{
   std::ios::sync_with_stdio(false);
   int n; cin >> n;
   for(int i = 1; i<=n; i++) cin >> a[i];
   build(1,1,n);
   int m; cin >> m;
   while(m -- > 0){
     int l,r,k;cin >> l >> r >> k;
     Tree sum = query(1,l,r,1,n);
     update(1,k,min((ll)1000,sum.ms),1,n);
     cout << sum.ms << endl;
   }
   return 0;
}
