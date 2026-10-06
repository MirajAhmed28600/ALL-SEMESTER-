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
