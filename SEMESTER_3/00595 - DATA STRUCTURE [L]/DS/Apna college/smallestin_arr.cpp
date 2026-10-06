#include<iostream>
#include <climits>
using namespace std;
int main(){
    int size;
    cout<<"enter arr size"<<endl;
    cin>>size;

    int arr[size];
    
    int smallest=INT_MAX;

    for(int i=0; i<size; i++){
      
        cin>>arr[i];
        
        if(arr[i]<smallest){
            smallest= arr[i];

        }

    }
 cout<<"smallest num is:"<<smallest<<endl;
return 0;

}