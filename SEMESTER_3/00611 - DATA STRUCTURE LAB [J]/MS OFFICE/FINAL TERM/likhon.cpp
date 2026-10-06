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



//====================================================================end of code================================================================



#include <iostream>
using namespace std;

int main() {
    int arr[5] = {43,26,29,33,12};
    int n = 5;

    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }

    cout << "Sorted Array: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}




//====================================================================end of code================================================================



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




//====================================================================end of code================================================================





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


//====================================================================end of code================================================================



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


//====================================================================end of code================================================================



#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* left;
    Node* right;
};

Node* createNode(int value) {
    Node* newNode = new Node();
    newNode->data = value;
    newNode->left = newNode->right = NULL;
    return newNode;
}

void insert(Node*& root, int value) {
    if (root == NULL) {
        root = createNode(value);
        return;
    }

    if (value < root->data)
    insert(root->left, value);
    else if (value > root->data)
    insert(root->right, value);
    else
    cout << "Duplicate value not allowed\n";
}

bool search(Node* root, int key) {
    if (root == NULL) return false;

    if (root->data == key) return true;

    if (key < root->data)
        return search(root->left, key);
    else
        return search(root->right, key);
}

Node* findMin(Node* root) {
    while (root->left != NULL)
        root = root->left;
    return root;
}

void deleteNode(Node*& root, int key) {
    if (root == NULL) return;

    if (key < root->data) {
        deleteNode(root->left, key);
    }
    else if (key > root->data) {
        deleteNode(root->right, key);
    }
    else {

        if (root->left == NULL && root->right == NULL) {
            delete root;
            root = NULL;
        }

        else if (root->left == NULL) {
            Node* temp = root;
            root = root->right;
            delete temp;
        }
        else if (root->right == NULL) {
            Node* temp = root;
            root = root->left;
            delete temp;
        }

        else {
            Node* temp = findMin(root->right);
            root->data = temp->data;
            deleteNode(root->right, temp->data);
        }
    }
}

void inorder(Node* root) {
    if (root == NULL) return;

    inorder(root->left);
    cout << root->data << " ";
    inorder(root->right);
}


void preorder(Node* root) {
    if (root == NULL) return;

    cout << root->data << " ";
    preorder(root->left);
    preorder(root->right);
}

void postorder(Node* root) {
    if (root == NULL) return;

    postorder(root->left);
    postorder(root->right);
    cout << root->data << " ";
}

int main() {
    Node* root = NULL;

    insert(root, 50);
    insert(root, 30);
    insert(root, 70);
    insert(root, 20);
    insert(root, 40);
    insert(root, 60);
    insert(root, 80);

    cout << "Inorder: ";
    inorder(root);
    cout << endl;

    cout << "Preorder: ";
    preorder(root);
    cout << endl;

    cout << "Postorder: ";
    postorder(root);
    cout << endl;

    cout << (search(root, 44) ? "Found\n" : "Not Found\n");

    deleteNode(root, 50);

    cout << "After Deletion: ";
    inorder(root);
    cout << endl;

    return 0;
}


//====================================================================end of code================================================================




#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
    Node* prev;
};

void insertBeginning(Node*& head, int value) {
    Node* newNode = new Node();
    newNode->data = value;
    newNode->prev = NULL;
    newNode->next = head;

    if (head != NULL) {
        head->prev = newNode;
    }

    head = newNode;
}

void insertEnd(Node*& head, int value) {
    Node* newNode = new Node();
    newNode->data = value;
    newNode->next = NULL;

    if (head == NULL) {
        newNode->prev = NULL;
        head = newNode;
        return;
    }

    Node* temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }

    temp->next = newNode;
    newNode->prev = temp;
}

void insertAtPosition(Node*& head, int value, int pos) {
    if (pos == 1) {
        insertBeginning(head, value);
        return;
    }

    Node* newNode = new Node();
    newNode->data = value;

    Node* temp = head;
    for (int i = 1; i < pos - 1 && temp != NULL; i++) {
        temp = temp->next;
    }

    if (temp == NULL) {
        cout << "Invalid position\n";
        delete newNode;
        return;
    }

    newNode->next = temp->next;
    newNode->prev = temp;

    if (temp->next != NULL) {
        temp->next->prev = newNode;
    }

    temp->next = newNode;
}

void deleteBeginning(Node*& head) {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    Node* temp = head;
    head = head->next;

    if (head != NULL) {
        head->prev = NULL;
    }

    delete temp;
}

void deleteEnd(Node*& head) {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    Node* temp = head;

    if (head->next == NULL) {
        delete head;
        head = NULL;
        return;
    }

    while (temp->next != NULL) {
        temp = temp->next;
    }

    temp->prev->next = NULL;
    delete temp;
}

void deleteAtPosition(Node*& head, int pos) {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    if (pos == 1) {
        deleteBeginning(head);
        return;
    }

    Node* temp = head;

    for (int i = 1; i < pos && temp != NULL; i++) {
        temp = temp->next;
    }

    if (temp == NULL) {
        cout << "Invalid position\n";
        return;
    }

    if (temp->next != NULL) {
        temp->next->prev = temp->prev;
    }

    if (temp->prev != NULL) {
        temp->prev->next = temp->next;
    }

    delete temp;
}

void display(Node* head) {
    Node* temp = head;

    while (temp != NULL) {
        cout << temp->data << " <-> ";
        temp = temp->next;
    }

    cout << "NULL\n";
}

int main() {
    Node* head = NULL;

    insertBeginning(head, 10);
    insertBeginning(head, 5);
    insertEnd(head, 20);
    insertAtPosition(head, 15, 3);

    display(head);

    deleteBeginning(head);
    deleteEnd(head);
    deleteAtPosition(head, 2);

    display(head);

    return 0;
}




//====================================================================end of code================================================================


#include <iostream>

using namespace std;

int main()
{
    int x = 10;
    int *ptr = &x;

    cout<<"Value of X: "<<x <<endl;
    cout<<"Address of X: "<<&x<<endl;
    cout<<"Value stored in ptr: "<<ptr<<endl;
    cout<<"Address of ptr: "<<&ptr<<endl;
    cout<<"Value of x: "<<*ptr<<endl;

    int **ptr2 = &ptr;

    cout<<"Value stored in ptr2: "<<ptr2<<endl;
    cout<<"Address of ptr2: "<<&ptr2<<endl;

    int ***ptr3 = &ptr2;

    cout<<"Value stored in ptr3: "<<ptr3<<endl;
    cout<<"Address of ptr3: "<<&ptr3<<endl;

    *ptr = 5;
    cout<<"Updated value of X: "<<x <<endl;
    **ptr2 = 15;
    cout<<"Updated value of X: "<<x <<endl;

    ***ptr3 = 20;
    cout<<"Updated value of X: "<<x <<endl;


    return 0;
}




//====================================================================end of code================================================================




#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

void insertBeginning(Node*& head, int value) {
    Node* newNode = new Node();
    newNode->data = value;
    newNode->next = head;
    head = newNode;
}

void insertEnd(Node*& head, int value) {
    Node* newNode = new Node();
    newNode->data = value;
    newNode->next = NULL;

    if (head == NULL) {
        head = newNode;
        return;
    }

    Node* temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }

    temp->next = newNode;
}

void insertAtPosition(Node*& head, int value, int pos) {
    if (pos == 1) {
        insertBeginning(head, value);
        return;
    }

    Node* newNode = new Node();
    newNode->data = value;

    Node* temp = head;
    for (int i = 1; i < pos - 1 && temp != NULL; i++) {
        temp = temp->next;
    }

    if (temp == NULL) {
        cout << "Invalid position\n";
        delete newNode;
        return;
    }

    newNode->next = temp->next;
    temp->next = newNode;
}

void deleteBeginning(Node*& head) {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    Node* temp = head;
    head = head->next;
    delete temp;
}

void deleteEnd(Node*& head) {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    if (head->next == NULL) {
        delete head;
        head = NULL;
        return;
    }

    Node* temp = head;
    while (temp->next->next != NULL) {
        temp = temp->next;
    }

    delete temp->next;
    temp->next = NULL;
}

void deleteAtPosition(Node*& head, int pos) {
    if (head == NULL) {
        cout << "List is empty\n";
        return;
    }

    if (pos == 1) {
        deleteBeginning(head);
        return;
    }

    Node* temp = head;
    for (int i = 1; i < pos - 1 && temp->next != NULL; i++) {
        temp = temp->next;
    }

    if (temp->next == NULL) {
        cout << "Invalid position\n";
        return;
    }

    Node* nodeToDelete = temp->next;
    temp->next = nodeToDelete->next;
    delete nodeToDelete;
}

void display(Node* head) {
    Node* temp = head;

    while (temp != NULL) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }

    cout << "NULL\n";
}

int main() {
    Node* head = NULL;

    insertBeginning(head, 10);
    insertBeginning(head, 5);
    insertEnd(head, 20);
    insertAtPosition(head, 15, 3);

    display(head);

    deleteBeginning(head);
    deleteEnd(head);
    deleteAtPosition(head, 2);

    display(head);

    return 0;
}
