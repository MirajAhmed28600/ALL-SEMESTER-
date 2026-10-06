#include <iostream>
using namespace std;

int main()
{
    int arr[10] = {45, 12, 89, 33, 7, 56, 21, 90, 18, 3};
    int n = 10;
    int key;

    cout << "Array: ";

    for(int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    cout << endl;

    cout << "Enter the value to search: ";
    cin >> key;

    bool found = false;

    for(int i = 0; i < n; i++)
    {
        if(arr[i] == key)
        {
            cout << "Element found at index " << i << endl;
            found = true;
            break;
        }
    }

    if(found == false)
    {
        cout << "Element not found." << endl;
    }

    return 0;
}
