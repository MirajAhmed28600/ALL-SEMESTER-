#include<iostream>
using namespace std;
int main(){
    
    int arr[10]={1,2,3,4,5,6,7,8,9,10};
    int even=0;
        int odd=0;
    for(int i=0; i<10; i++){
        
    if(arr[i] % 2== 0){
        even++;
    }
    else{
        odd++;
    }
    
    }
   cout<<"even number : "<<even<<endl;
       cout<<"odd number : "<<odd<<endl;

    return 0;
}









//======================================end===========










//insertion in the begining of an array









// #include<iostream>
// using namespace std;
// int main(){
    
//     int arr[20]={1,2,3,4,5,6,7,8,9,10};
//     int size=10;
    

//     for(int i=size; i>0; i--){
//         arr[i]=arr[i-1];

//     }
//     arr[0]=70;
//     for(int i=0;i<size;i++)
//     cout<<arr[i]<<" ";
//     return 0;
// }



//===============================================================


//inchertion on any place of an array--for example 3rd index add 80 and print the array



// #include<iostream>
// using namespace std;
// int main(){
    
//     int arr[20]={1,2,3,4,5,6,7,8,9,10};
//     int size=10;
    

//     for(int i=size; i>3; i--){
//         arr[i]=arr[i-1];

//     }
//     arr[3]=80;
//     for(int i=0;i<size;i++)
//     cout<<arr[i]<<" ";
//     return 0;
// }



//===============================================================


// #include<iostream>
// using namespace std;
// int main(){
    
//     int arr[20]={1,2,3,4,5,6,7,8,9,10};
//     int size=10;
    
     
//     arr[size]=100;
//     cout<<"array size :"<<size++<<endl;
//     for(int i=0;i<size+1;i++)
//     cout<<arr[i]<<" ";
//     return 0;
// }