#include <iostream>

using namespace std;

int main()
{
    int arr2[2] = {1,2};
    int arr[2][2] = {{1,2},{3,4}};
    int arr3[2][2];

    for (int i = 0;i<2;i++)
    {
        for (int j = 0;j<2;j++)
        {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }

    for (int i = 0;i<2;i++)
    {
        for (int j = 0;j<2;j++)
        {
            cin>>arr3[i][j];
        }
    }

    for (int i = 0;i<2;i++)
    {
        for (int j = 0;j<2;j++)
        {
            cout<<arr3[i][j]<<" ";
        }
        cout<<endl;
    }

    int mat1[2][2] = {{1,2},{3,4}};
    int mat2[2][2] = {{10,20},{30,40}};
    int result[2][2] = {0};

    for (int i = 0;i<2;i++)
    {
        for (int j = 0;j<2;j++)
        {
            result[i][j] = mat1[i][j] - mat2[i][j];
        }
    }

    cout<<"Resultant matrix:"<<endl;
    for (int i = 0;i<2;i++)
    {
        for (int j = 0;j<2;j++)
        {
            cout<<result[i][j]<<" ";
        }
        cout<<endl;
    }








    return 0;
}
