#include <iostream>
using namespace std;

int main()
{
    int arr[8] = {64,34,25,12,22,11,90,45};
    int n = 8;

    cout<<"Original array: ";
    for(int i = 0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;

    for(int i = 0;i<n-1;i++)
    {
        bool swapped = false;

        for(int j = 0;j<n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                swapped = true;
            }
        }

        if(swapped == false)
            break;
    }

    cout<<"Sorted array in ascending order: ";
    for(int i = 0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;

    return 0;
}