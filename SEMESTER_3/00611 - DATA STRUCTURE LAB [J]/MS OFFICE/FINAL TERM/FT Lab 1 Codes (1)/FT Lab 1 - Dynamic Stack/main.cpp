#include <iostream>
using namespace std;

class Stack {
private:
    int *arr;
    int size;
    int top;

public:
    Stack(int s) {
    if (s <= 0) {
        size = 1;
    } else {
        size = s;
    }

    arr = new int[size];
    top = -1;
}

    void resize() {
        int newSize = size * 2;
        int *newArr = new int[newSize];

        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }

        delete[] arr;
        arr = newArr;
        size = newSize;

        cout << "Stack resized to " << size << endl;
    }

    void push(int value) {
        if (top == size - 1) {
            resize();
        }

        top++;
        arr[top] = value;
    }

    void pop() {
        if (top == -1) {
            cout << "Stack Underflow" << endl;
        }
        else {
            cout << "Popped: " << arr[top] << endl;
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            cout << "Stack is empty" << endl;
        }
        else {
            cout << "Top element: " << arr[top] << endl;
        }
    }

    void display() {
        if (top == -1) {
            cout << "Stack is empty" << endl;
        }
        else {
            cout << "Stack elements: ";
            for (int i = top; i >= 0; i--) {
                cout << arr[i] << " ";
            }
            cout << endl;
        }
    }

    ~Stack() {
        delete[] arr;
    }
};

int main() {

    Stack s(5);

    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    s.push(60);
    s.push(40);
    s.push(50);
    s.push(60);
    s.push(40);
    s.push(50);
    s.push(60);
    s.push(100);

    s.display();

    s.pop();

    s.display();

    s.peek();

    return 0;
}
