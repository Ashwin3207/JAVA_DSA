#include <iostream>
#include <climits> // For INT_MIN

using namespace std;

int main()
{
    int arr[5] = {0, 2, -2, 4, 5};
    int n = 5;

    int currSum = 0;
    int maxSum = INT_MIN; // Initialize maxSum to the smallest possible integer

    for (int i = 0; i < n; i++)
    {
        currSum += arr[i];
        if (currSum > maxSum)
        {
            maxSum = currSum; // Update maxSum
        }
        if (currSum < 0)
        {
            currSum = 0; // Reset currSum if it becomes negative
        }
    }
    cout << "Maximum subarray sum : " << maxSum;
    return 0;
}
