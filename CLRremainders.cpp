#include <bits/stdc++.h>
using namespace std;
int a[200010];
int mod1 = 0;
// 乘法
vector<int> mul(vector<int> &A, int b)
{
    int t = 0;
    vector<int> c;
    for (int i = 0; i < A.size() || t; i++)
    {
        if (i < A.size())
            t += A[i] * b;
        c.push_back(t % 10);
        t /= 10;
    }
    while (c.size() > 1 && c.back() == 0)
        c.pop_back();
    return c;
}
// 除法
vector<int> biv(vector<int> &A, int b, int &r)
{
    vector<int> c;
    r = 0;
    for (int i = A.size() - 1; i >= 0; i--)
    {
        r = r * 10 + A[i];
        c.push_back(r / b);
        r %= b;
    }
    reverse(c.begin(), c.end());
    while (c.size() > 1 && c.back() == 0)
        c.pop_back();
    return c;
}
void solve()
{
    int n, m;
    cin >> n >> m;
    vector<int> c;
    cin >> a[0];
    int tmp = a[0];
    while (tmp)
    {
        c.push_back(tmp % 10);
        tmp /= 10;
    }
    for (int i = 1; i < n; i++)
    {
        cin >> a[i];
        c = mul(c, a[i]);
    }
    getchar();
    string str;
    cin >> str;
    int left = 0;
    int right = n - 1;
    for (int i = 0; i < n; i++)
    {
        mod1 = 0;
        int tmp = 0;
        if (str[i] == 'L')
        {
            for (int i = c.size()-1;i>=0; i--)
            {
                mod1 = (mod1 * 10 + c[i]) % m;
            }
            c = biv(c, a[left], tmp);
            left++;
            cout << mod1 << " ";
        }
        else
        {
            for (int i = c.size()-1;i>=0; i--)
            {
                mod1 = (mod1 * 10 + c[i]) % m;
            }
            c = biv(c, a[right], tmp);
            right--;
            cout << mod1 << " ";
        }
    }
    cout << endl;
    return;
}
int main(void)
{
    int n;
    cin >> n;
    while (n-- > 0)
    {
        solve();
    }
    return 0;
}