#include <bits/stdc++.h>

using namespace std;
int trap(vector<int> &height)
{
    int len = height.size();
    int left[len];
    int right[len];
    int sum = 0;
    left[0] = height[0];
    right[len - 1] = height[len - 1];
    for (int i = 1; i < len; i++)
        left[i] = max(left[i - 1], height[i]);
    for (int i = len - 2; i >= 0; i--)
        right[i] = max(right[i + 1], height[i]);
    for (int i = 1; i < len - 1; i++)
        sum += max(min(left[i - 1], right[i + 1]) - height[i], 0);
    return sum;
}
int main(void)
{

    return 0;
}