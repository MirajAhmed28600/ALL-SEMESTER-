#include <iostream>
using namespace std;

int main()
{
    int arr[10] = {15,23,89,45,67,12,78,34,90,56};
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

    bool found = false;

    for(int i = 0;i<n;i++)
    {
        if(arr[i]==key)
        {
            cout<<"Element found at index "<<i<<endl;
            found = true;
            break;
        }
    }

    if(found == false)
    {
        cout<<"Not found"<<endl;
    }

    return 0;
}