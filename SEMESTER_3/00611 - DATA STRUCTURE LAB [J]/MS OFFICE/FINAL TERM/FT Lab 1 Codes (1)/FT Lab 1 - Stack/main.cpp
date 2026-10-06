#include <iostream>
using namespace std;

class Stack {
private:
    int arr[100];
    int top;
    int size;

public:
    Stack(int s) {
        size = s;
        top = -1;
    }

    void push(int value) {
        if (top == size - 1) {
            cout << "Stack Overflow" << endl;
        }
        else {
            top++;
            arr[top] = value;
        }
    }

    void pop() {
        if (top == -1) {
            cout << "Stack Underflow" << endl;
        }
        else {
            cout << "Popped element: " << arr[top] << endl;
            top--;
        }
    }

    void display() {
        if (top == -1) {
            cout << "Stack is empty" << endl;
        }
        else {
            cout << "Stack elements (Top to Bottom): ";
            for (int i = top; i >= 0; i--) {
                cout << arr[i] << " ";
            }
            cout << endl;
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
};

int main() {
    int n;

    cout << "Enter stack size (Maximum 100): ";
    cin >> n;

    if (n <= 0 || n > 100) {
        cout << "Invalid stack size!" << endl;
        return 0;
    }

    Stack s(n);
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    s.display();
    s.pop();
    s.display();
    s.push(60);
    s.display();
    s.push(70);
    s.display();
    s.peek();

    return 0;
}
