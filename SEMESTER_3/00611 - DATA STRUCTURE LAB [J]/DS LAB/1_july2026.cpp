//selection sort, bubble sort, linear search, binary search

//bouble sort

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

















        //selection sort
    #include <iostream>
using namespace std;

int main() {
    int n;

    cout << "Enter array size: ";
    cin >> n;

    int arr[n];

    // Input array
    cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // Selection Sort
    for (int i = 0; i < n - 1; i++) {

        // প্রথমে ধরে নিই i-তম element-টাই সবচেয়ে ছোট
        int minIndex = i;

        // বাকি অংশে আরও ছোট element আছে কি না খুঁজি
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // সবচেয়ে ছোট element-কে সঠিক জায়গায় বসাই
        swap(arr[i], arr[minIndex]);
    }

    // Print sorted array
    cout << "Sorted array: ";

    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    cout << endl;

    return 0;
}





//==============================================
//linear search

#include <iostream>
using namespace std;

int main() {
    int n;

    cout << "Enter array size: ";
    cin >> n;

    int arr[n];

    // Input array
    cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int target;
    cout << "Enter the number to search: ";
    cin >> target;

    bool found = false;

    // Linear Search
    for (int i = 0; i < n; i++) {
        if (arr[i] == target) {
            cout << "Element found at index " << i << endl;
            found = true;
            break;
        }
    }

    if (!found) {
        cout << "Element not found!" << endl;
    }

    return 0;
}



//binary search

