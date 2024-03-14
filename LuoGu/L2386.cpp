#include <bits/stdc++.h>

using namespace std;
vector<long long> goal;
bool cmp1(long long& l1,long long& l2) {return l1 > l2;}
void dfs(vector<int> &nums, int cur, int len, long long sum)
{
    if (cur == len)
    {
        goal.push_back(sum);
        return;
    }
    dfs(nums, cur + 1, len, sum + nums[cur]);
    dfs(nums, cur + 1, len, sum);
}
long long kSum(vector<int> &nums, int k)
{
    int len = nums.size();
    dfs(nums, 0, len, 0);
    sort(goal.begin(), goal.end(),cmp1);
    return goal[k - 1];
}
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    vector<int> nums;
    nums.push_back(2);
    nums.push_back(4);
    nums.push_back(-2);
    cout << kSum(nums, 5) << endl;
    return 0;
}
