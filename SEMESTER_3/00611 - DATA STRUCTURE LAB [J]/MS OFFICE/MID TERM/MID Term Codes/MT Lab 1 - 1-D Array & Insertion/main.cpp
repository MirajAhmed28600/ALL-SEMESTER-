#include <iostream>

using namespace std;

int main()
{
    /*int arr[5] = {1,2,3,4,5};

    int arr[5];

    for (int i = 0;i<5;i++)
    {
        cout<<"Insert the value at index "<<i<<" : ";
        cin>>arr[i];
    }


    for (int i = 0; i<5;i++)
    {
        cout<<"Value stored in index "<<i<<" : "<<arr[i]<<endl;;
    }

    int arr[10] = {11,15,13,20,22,21,15,36,40,50};

    int even = 0;
    int odd = 0;

    for (int i = 0;i<10;i++)
    {
        if(arr[i]%2==0)
        {
            even++;
        }
        else
        {
            odd++;
        }
    }

    cout<<"Total even numbers: "<<even<<endl;
    cout<<"Total odd numbers: "<<odd<<endl;

    */

    int arr[100] = {10,20,30,40,50};
    int arr_size = 5;

    cout<<"Initial array: ";
    for (int i = 0;i<arr_size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;

    arr[arr_size++] = 60;
   // arr_size++;



    cout<<"after inserting an element at the end of the array: ";
    for (int i = 0;i<arr_size;i++)
    {
        cout<<arr[i]<<" ";
    }

    cout<<endl;

    for(int i = arr_size;i>=0;i--)
    {
        arr[i] = arr[i-1];

    }

    arr[0] = 70;

    arr_size++;

    cout<<"After inserting an element at the start of the array: ";
    for (int i = 0;i<arr_size;i++)
    {
        cout<<arr[i]<<" ";
    }

    cout<<endl;


    int pos = 3;

    int value = 100;

    for (int i = arr_size;i>= pos;i--)
    {
        arr[i]= arr[i-1];
    }

    arr[pos] = 100;

    arr_size++;

    cout<<endl;

    cout<<"After inserting an element at a specific position of the array: ";
    for (int i = 0;i<arr_size;i++)
    {
        cout<<arr[i]<<" ";
    }

    cout<<endl;

    return 0;
}
