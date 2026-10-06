//2 array deletion · CPP
#include <iostream>
using namespace std;
 
int main()
{
    int arr[10] = {12,45,67,89,23,56,78,90};
    int arr_size = 8;
 
    cout<<"Initial array: ";
    for(int i = 0;i<arr_size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
 
    int pos = 3;
 
    for(int i = pos;i<arr_size-1;i++)
    {
        arr[i] = arr[i+1];
    }
 
    arr_size--;
 
    cout<<"Array after deleting element at index "<<pos<<": ";
    for(int i = 0;i<arr_size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
 
    return 0;
}
 