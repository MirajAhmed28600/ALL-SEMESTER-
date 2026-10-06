#include <iostream>

using namespace std;

struct plot
{
    string area_name;
    double length;
    double width;
    double price_per_unit;
};

void input(plot &p)
{
    cout<<"Enter area name: ";
    getline(cin,p.area_name);
    cout<<"Enter length: ";
    cin>>p.length;
    cout<<"Enter Width: ";
    cin>>p.width;
    cout<<"Enter price per unit: ";
    cin>>p.price_per_unit;
}

void show(plot p)
{
    cout<<"Area Name: "<<p.area_name<<endl;
    cout<<"Length: "<<p.length<<endl;
    cout<<"Width: "<<p.width<<endl;
    cout<<"Price per unit: "<<p.price_per_unit<<endl;

    int area = p.length * p.width;
    cout<<"Price of the plot: "<<area* p.price_per_unit<<endl;
}

int main()
{
    plot p1,p2,p3;
    /*p1.area_name = "Bashundhara";
    p1.length = 5;
    p1.width = 10;
    p1.price_per_unit = 100;

    cout<<"Area name: "<<p1.area_name<<endl;
    cout<<"Length: "<<p1.length<<endl;
    cout<<"Width: "<<p1.width<<endl;
    cout<<"Price per unit: "<<p1.price_per_unit<<endl;



    /*cout<<"Enter length: ";
    cin>>p2.length;
    cout<<"Enter Width: ";
    cin>>p2.width;
    cout<<"Enter price per unit: ";
    cin>>p2.price_per_unit;

    show(p2);*/

    input(p3);
    show(p3);



    return 0;
}
