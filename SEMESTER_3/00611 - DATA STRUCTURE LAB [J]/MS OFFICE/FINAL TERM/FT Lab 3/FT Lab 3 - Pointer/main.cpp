#include <iostream>

using namespace std;

int main()
{
    int x = 10;
    int *ptr = &x;

    cout<<"Value of X: "<<x <<endl;
    cout<<"Address of X: "<<&x<<endl;
    cout<<"Value stored in ptr: "<<ptr<<endl;
    cout<<"Address of ptr: "<<&ptr<<endl;
    cout<<"Value of x: "<<*ptr<<endl;

    int **ptr2 = &ptr;

    cout<<"Value stored in ptr2: "<<ptr2<<endl;
    cout<<"Address of ptr2: "<<&ptr2<<endl;

    int ***ptr3 = &ptr2;

    cout<<"Value stored in ptr3: "<<ptr3<<endl;
    cout<<"Address of ptr3: "<<&ptr3<<endl;

    *ptr = 5;
    cout<<"Updated value of X: "<<x <<endl;
    **ptr2 = 15;
    cout<<"Updated value of X: "<<x <<endl;

    ***ptr3 = 20;
    cout<<"Updated value of X: "<<x <<endl;


    return 0;
}
