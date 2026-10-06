

//inchertion on any place of an array--for example 3rd index add 80 and print the array



#include<iostream>
using namespace std;
int main(){
    
    int arr[20]={1,2,3,4,5,6,7,8,9,10};
    int SOA=10;
    

    for(int i=1; i<SOA; i++){
        int key = arr[i];

     for(int j=i-1;i>=0;j--){
        if(arr[j]>key){
            arr[j+1]=arr[j];

        }
    }
    arr[j+1] =key;
}
    for(int i=0;i<SOA;i++)
    cout<<arr[i]<<" ";
    return 0;
}


