#include <iostream>
using namespace std;

int main()
{
    int arr[10] = {11,22,33,44,55,66,77,88,99,110};
    int n = 10;
    int key;

    cout<<"Array: ";
    for(int i = 0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;

    cout<<"Enter the value to search: ";
    cin>>key;

    int left = 0;
    int right = n-1;
    bool found = false;

    while(left<=right)
    {
        int mid = (left+right)/2;

        if(arr[mid]==key)
        {
            cout<<"Element found at index "<<mid<<endl;
            found = true;
            break;
        }
        else if(arr[mid]<key)
        {
            left = mid+1;
        }
        else
        {
            right = mid-1;
        }
    }

    if(found == false)
    {
        cout<<"Not found"<<endl;
    }

    return 0;
}