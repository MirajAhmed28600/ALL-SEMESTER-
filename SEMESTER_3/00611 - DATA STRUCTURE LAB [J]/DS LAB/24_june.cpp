/*
(Mid term marks)
Aattendence 10 marks
task= 2*15=30
obe=1*15=15
lab exam=25
viva =20
====================
total 100 marks






deletion at last index of an array


#include <iostream>
using namespace std;
int main()
{
    int arr[20] = {1, 2, 3, 4, 5, 6, 7};
    int size = 7;

    size--;
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
    return 0;
}


================================================================

deletion at first index of an array

#include <iostream>
using namespace std;
int main()
{
    int arr[20] = {1, 2, 3, 4, 5, 6, 7};
    int size = 7;

    for (int i = 0; i < size - 1; i++){
        arr[i] = arr[i + 1];
    }
    size--;
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
    return 0;
}



================================================================

deletion at any index of an array--for example 3rd index delete and print the array
#include <iostream>
using namespace std;
int main()
{
    int arr[20] = {1, 2, 3, 4, 5, 6, 7};
    int size = 7;

    for (int i = 3; i < size - 1; i++)
        arr[i] = arr[i + 1];

    size--;
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
    return 0;
}






2d array

#include <iostream>
using namespace std;
int main()
{
    int arr[2][2] = {{1, 2}, {5, 6}};

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
            cout << arr[i][j] << " ";
        cout << endl;
    }
    return 0;
}













structure in c++

#include <iostream>
using namespace std;
struct student{
    string name;
    int id;
    double cgpa;
};



void show(student s){
    cout<<'SHOW FUNCTION'<<endl;
    cout<<"Name : "<<s.name<<endl;
    cout<<"ID : "<<s.id<<endl;
    cout<<"CGPA : "<<s.cgpa<<endl;
}




int main(){
    
    student s1;
    s1.name="Ali";
    s1.id=123;
    s1.cgpa=3.5;
    
    cout<<"Name : "<<s1.name<<endl;
    cout<<"ID : "<<s1.id<<endl;
    cout<<"CGPA : "<<s1.cgpa<<endl;
    
    student s2;
    cout<<"enter name : ";
    cin>>s2.name;
    cout<<"enter ID : ";
    cin>>s2.id;
    cout<<"enter CGPA : ";
    cin>>s2.cgpa;

    cout<<"Name : "<<s2.name<<endl;
    cout<<"ID : "<<s2.id<<endl;
    cout<<"CGPA : "<<s2.cgpa<<endl;

    return 0;
}













=============================================================================


*/