#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    int arr[n];
    cout << "Enter " << n << " numbers:\n";
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    // -------- Insertion Sort --------
    for (int i = 1; i < n; i++) { //5 3 8 4 2 i=1 -> key = 3 // i= 2 -> key=8
        int key = arr[i]; //3 // 8
        int j = i - 1; //0 //5

        while (j >= 0 && arr[j] > key) { // 5 > 3
            arr[j + 1] = arr[j]; // 5, 5, 8, 4, 2
            j--;
        }

        arr[j + 1] = key; //3 , 5 , 8, 4 , 2
    }

    cout << "\nSorted array: ";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout << endl;

    return 0;
}