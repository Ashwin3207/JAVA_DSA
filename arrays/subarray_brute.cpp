#include <iostream>

using namespace std;

int main()
{
    int n = 5;
    int arr[5] = {1, 2, 3, 4, 5};
    int Msum = INT_MIN;

    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            int currSum = 0;
            currSum += arr[j];
            Msum = max(Msum, currSum);
        }
    }
    cout << "The maximum sum is : " << Msum;
    return 0;
}