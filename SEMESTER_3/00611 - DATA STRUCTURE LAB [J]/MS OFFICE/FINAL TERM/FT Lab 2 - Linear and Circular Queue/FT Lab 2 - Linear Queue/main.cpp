#include <iostream>
using namespace std;

class Queue {
private:
    int arr[100];
    int size;
    int front, rear;

public:
    Queue(int s) {
        if (s <= 0 || s > 100) {
            size = 100;
        }
        else {
            size = s;
        }

        front = -1;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            cout << "Queue Overflow" << endl;
        }
        else {
            if (front == -1) {
                front = 0;
            }

            rear++;
            arr[rear] = value;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            cout << "Queue Underflow" << endl;
        }
        else {
            cout << "Removed: " << arr[front] << endl;
            front++;

            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    void display() {
        if (front == -1) {
            cout << "Queue is empty" << endl;
        }
        else {
            cout << "Queue elements: ";

            for (int i = front; i <= rear; i++) {
                cout << arr[i] << " ";
            }

            cout << endl;
        }
    }
};

int main() {

    int n;

    cout << "Enter queue size: ";
    cin >> n;

    Queue q(n);

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    q.display();

    q.dequeue();

    q.display();

    q.enqueue(40);

    q.display();

    q.enqueue(50);

    q.display();

    q.enqueue(60);

    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();

    q.display();

    return 0;
}
