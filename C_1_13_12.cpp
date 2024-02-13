#include <bits/stdc++.h>
using namespace std;
int a1[2000] = {0};
int a2[2000] = {0};
int main(void)
{
    int n;
    long long sum1 = 0, sum2 = 1;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        scanf("%d/%d", &a1[i], &a2[i]);
        for (int j = sum2;; j++)
        {
            if (j % a2[i] == 0 && j % sum2 == 0)
            {
                sum2 = j;
                break;
            }
        }
    }
    for (int i = 0; i < n; i++)
    {
        sum1 += (sum2 / a2[i]) * a1[i];
    }

    for (int i = 2; i <= sum1; i++)
    {
        if (sum1 % i == 0 && sum2 % i == 0)
        {
            sum1 /= i;
            sum2 /= i;
            i--;
        }
    }
    if (sum2 == 1)
    {
        cout << sum1;
    }
    else if (sum1 == 0)
    {
        cout << 0;
    }
    else
    {
        printf("%lld/%lld", sum1, sum2);
    }
}