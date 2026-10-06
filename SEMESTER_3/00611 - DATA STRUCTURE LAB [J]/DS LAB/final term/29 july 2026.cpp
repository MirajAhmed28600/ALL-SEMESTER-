//insertion sort
#include<iostream>
using namespace std;

int main(){
    int arr[10]={1,2,3,4,5,6,7,8,9,10};
    for(int i=1; i<10; i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    for(int i=0; i<10; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}



//stack
//LIFO
/* 
push() - adds an element to the top of the stack
pop() - removes the top element from the stack
isEmpty() - checks if the stack is empty
overflow() - checks if the stack is full
peek() - returns the top element of the stack without removing it

top=0 
top=-1 when stack is empty
*/ 


