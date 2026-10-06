//array insertion 
#include <iostream>
using namespace std;
 
int main()
{
    int arr[15] = {12,45,67,89,23,56,78,90};
    int arr_size = 8;
 
    cout<<"Initial array: ";
    for(int i = 0;i<arr_size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
 
    int pos = 4;
    int value = 99;
 
    for(int i = arr_size;i>pos;i--)
    {
        arr[i] = arr[i-1];
    }
 
    arr[pos] = value;
    arr_size++;
 
    cout<<"Array after inserting "<<value<<" at index "<<pos<<": ";
    for(int i = 0;i<arr_size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
 
    return 0;
}
 