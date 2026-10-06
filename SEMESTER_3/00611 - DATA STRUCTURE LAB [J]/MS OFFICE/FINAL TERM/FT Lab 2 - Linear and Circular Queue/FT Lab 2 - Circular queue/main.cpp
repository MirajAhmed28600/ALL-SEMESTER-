#include <iostream>
using namespace std;

class CircularQueue {
private:
    int arr[100];
    int size;
    int front, rear;

public:
    CircularQueue(int s) {

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

        if ((rear + 1) % size == front) {
            cout << "Queue Overflow" << endl;
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = value;
    }

    void dequeue() {

        if (front == -1) {
            cout << "Queue Underflow" << endl;
            return;
        }

        cout << "Removed: " << arr[front] << endl;

        if (front == rear) {
            front = rear = -1;
        }
        else {
            front = (front + 1) % size;
        }
    }

    void display() {

        if (front == -1) {
            cout << "Queue is empty" << endl;
            return;
        }

        cout << "Queue elements: ";

        int i = front;

        while (true) {
            cout << arr[i] << " ";

            if (i == rear)
                break;

            i = (i + 1) % size;
        }

        cout << endl;
    }
};

int main() {

    int n;

    cout << "Enter queue size: ";
    cin >> n;

    CircularQueue q(n);

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.enqueue(60);

    q.display();

    q.dequeue();

    q.display();

    q.enqueue(60);

    q.display();

    return 0;
}
