#include <iostream>
using namespace std;

int main(void) {
    int Bx, By, Hx, Hy;
    cin >> Bx >> By >> Hx >> Hy;
    long arr[30][30] = { 0 };
    for (int i = 0; i <= Bx; i++) {
        for (int j = 0; j <= By; j++) {
            arr[i][j] = 1;
        }
    }
    arr[Hx][Hy] = 0;
    if (Hx + 2 <= Bx && Hy + 1 <= By) { arr[Hx + 2][Hy + 1] = 0; }
    if (Hx + 1 <= Bx && Hy + 2 <= By) { arr[Hx + 1][Hy + 2] = 0; }
    if (Hx - 1 >= 0 && Hy + 2 <= By) { arr[Hx - 1][Hy + 2] = 0; }
    if (Hx - 2 >= 0 && Hy + 1 <= By) { arr[Hx - 2][Hy + 1] = 0; }
    if (Hx - 1 >= 0 && Hy - 2 >= 0) { arr[Hx - 1][Hy - 2] = 0; }
    if (Hx - 2 >= 0 && Hy - 1 >= 0) { arr[Hx - 2][Hy - 1] = 0; }
    if (Hx + 1 <= Bx && Hy - 2 >= 0) { arr[Hx + 1][Hy - 2] = 0; }
    if (Hx + 2 <= Bx && Hy - 1 >= 0) { arr[Hx + 2][Hy - 1] = 0; }
    for (int i = 0; i <= Bx; i++) {
        for (int j = 0; j <= By; j++) {
            if (i == 0 && j == 0) {
                continue;
            }
            if (arr[i][j] == 0) {
                continue;
            }
            if (i == 0) arr[i][j] = arr[i][j-1];
            else if (j == 0) arr[i][j] = arr[i-1][j];
            else {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
    }
    cout << arr[Bx][By];

}