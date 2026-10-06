#include <iostream>
using namespace std;

int main()
{
    int mat[3][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int transpose[4][3];

    for(int i = 0;i<3;i++)
    {
        for(int j = 0;j<4;j++)
        {
            transpose[j][i] = mat[i][j];
        }
    }

    cout<<"Original Matrix (3x4):"<<endl;
    for(int i = 0;i<3;i++)
    {
        for(int j = 0;j<4;j++)
        {
            cout<<mat[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<"Transposed Matrix (4x3):"<<endl;
    for(int i = 0;i<4;i++)
    {
        for(int j = 0;j<3;j++)
        {
            cout<<transpose[i][j]<<" ";
        }
        cout<<endl;
    }

    return 0;
}