#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
#define N 100010
#define lc p<<1
#define rc p<<1|1
struct Node{
    int l,r,add;
    ll sum;
}tr[4 * N];
int w[N];
void build(int p,int l,int r){
    tr[p].l = l,tr[p].r =r,tr[p].add = 0;
    tr[p].sum = w[l];
    if(l == r)return;
    int mid = (l + r) >> 1;
    build(lc,l,mid);
    build(rc,mid+1,r);
    tr[p].sum = tr[lc].sum + tr[rc].sum;
}
void pushup(int p){
    tr[p].sum = tr[lc].sum + tr[rc].sum;
}
void pushdown(int p){
    if(tr[p].add){
        tr[lc].sum += (tr[lc].r - tr[lc].l + 1) * tr[p].add;
        tr[rc].sum += (tr[rc].r - tr[rc].l + 1) * tr[p].add;
        tr[lc].add += tr[p].add;
        tr[rc].add += tr[p].add;
        tr[p].add = 0;
    }
}
ll queryf(int p,int l,int r){
    if(l <= tr[p].l && tr[p].r <= r){ return tr[p].sum;}
    int m = (tr[p].l + tr[p].r) >> 1;
    ll sum = 0;
    pushdown(p);
    if(l <= m) sum += queryf(lc,l,r);
    if(r > m) sum += queryf(rc,l,r);
    return sum;
}

void update(int p,int l,int r,int k){
    if(l <= tr[p].l && tr[p].r <= r){
        tr[p].sum += (tr[p].r - tr[p].l + 1) * k;
        tr[p].add += k;
        return;
    }
    int m = (tr[p].l + tr[p].r) >> 1;
    pushdown(p);
    if(l <= m) update(lc,l,r,k);
    if(r > m) update(rc,l,r,k);
    pushup(p);  
}
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n,m;cin >> n >> m;
    for(int i = 1; i<=n; i++) cin >> w[i];
    build(1,1,n);
    while(m-->0){
        int choice; cin >> choice;
        if(choice == 1){
            int l,r,k;cin>>l>>r>>k;
            update(1,l,r,k);
        }else if(choice == 2){
            int l,r;cin >> l >> r;
            cout << queryf(1,l,r) << endl;;
        }
    }
    return 0;
}
