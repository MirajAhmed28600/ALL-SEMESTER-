#include <iostream>
using namespace std;

int main()
{
    int A[3][3] = {{2,0,1},{4,3,-1},{1,2,5}};
    int B[3][3] = {{1,3,2},{0,4,-2},{5,1,3}};
    int result[3][3] = {0};

    for(int i = 0;i<3;i++)
    {
        for(int j = 0;j<3;j++)
        {
            result[i][j] = 0;
            for(int k = 0;k<3;k++)
            {
                result[i][j] += A[i][k]*B[k][j];
            }
        }
    }

    cout<<"Matrix A:"<<endl;
    for(int i = 0;i<3;i++)
    {
        for(int j = 0;j<3;j++)
        {
            cout<<A[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<"Matrix B:"<<endl;
    for(int i = 0;i<3;i++)
    {
        for(int j = 0;j<3;j++)
        {
            cout<<B[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<"Resultant Matrix (A x B):"<<endl;
    for(int i = 0;i<3;i++)
    {
        for(int j = 0;j<3;j++)
        {
            cout<<result[i][j]<<" ";
        }
        cout<<endl;
    }

    return 0;
}