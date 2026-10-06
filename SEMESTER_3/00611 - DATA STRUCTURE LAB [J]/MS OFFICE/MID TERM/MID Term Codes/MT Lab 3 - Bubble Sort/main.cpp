#include <iostream>
using namespace std;

int main()
{
    int arr[10] = {45, 12, 89, 33, 7, 56, 21, 90, 18, 3};
    int n = 10;

    for(int i = 0; i < n - 1; i++)
    {
        bool swapped = false;

        for(int j = 0; j < n - 1 - i; j++)
        {
            if(arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                swapped = true;
            }
        }

        if(swapped == false)
            break;
    }

    cout << "Sorted array in ascending order: ";
    for(int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}
