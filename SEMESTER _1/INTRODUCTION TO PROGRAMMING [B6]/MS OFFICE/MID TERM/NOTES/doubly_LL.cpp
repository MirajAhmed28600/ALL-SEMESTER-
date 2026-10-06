#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* prev;
    Node* next;
};

int main() {
    Node* head = new Node();
    Node* second = new Node();
    Node* third = new Node();

    head->data = 10;
    head->prev = NULL;
    head->next = second;

    second->data = 20;
    second->prev = head;
    second->next = third;

    third->data = 30;
    third->prev = second;
    third->next = NULL;

    // Forward traversal
    Node* temp = head;
    cout << "Forward: ";
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }

    cout << "\nBackward: ";
    temp = third; // start from last node
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->prev;
    }
}
