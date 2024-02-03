#include <iostream>
#include <bits/stdc++.h>
using namespace std;

static int p[2];
void swap(int *a, int l, int r)
{
    int tmp = a[l];
    a[l] = a[r];
    a[r] = tmp;
}
void partition1(int *arr, int L, int R)
{
    int left = L - 1;
    int right = R;
    int index = L;
    while (index < right)
    {
        if (arr[index] < arr[R])
        {
            swap(arr, ++left, index++);
        }
        else if (arr[index] > arr[R])
        {
            swap(arr, index, --right);
        }
        else
        {
            index++;
        }
    }
    swap(arr, right, R);
    p[0] = left + 1;
    p[1] = right;
}
void quickSort(int *arr, int l, int r)
{
    if (l < r)
    {
        int mid = (l + r) >> 1;
        swap(arr, mid, r);
        partition1(arr, l, r);
        quickSort(arr, l, p[0] - 1);
        quickSort(arr, p[1] + 1, r);
    }
}
int main(void)
{
    int arr[100000] = {0};
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    quickSort(arr, 0, n-1);
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}