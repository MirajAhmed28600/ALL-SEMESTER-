#include <iostream>
#include <vector>
#include <string>
using namespace std;

/*
SCENARIO:
A library lends items. There are Books and DVDs.

Base class: LibraryItem
- title, isBorrowed
- borrow(), returnItem()

Derived:
- Book: author
- DVD: durationMinutes

Program:
- Add a few default items
- Menu: list items, borrow by index, return by index

LEARNING:
- inheritance, protected members, overriding display.
*/

class LibraryItem {
protected:
    string title;
    bool borrowed;

public:
    LibraryItem(string t) : title(t), borrowed(false) {}

    bool isBorrowed() const { return borrowed; }

    bool borrow() {
        if (borrowed) return false;
        borrowed = true;
        return true;
    }

    bool returnItem() {
        if (!borrowed) return false;
        borrowed = false;
        return true;
    }

    virtual void display(int idx) const {
        cout << idx << ") " << title << " [" << (borrowed ? "Borrowed" : "Available") << "]";
    }

    virtual ~LibraryItem() = default;
};

class Book : public LibraryItem {
private:
    string author;

public:
    Book(string t, string a) : LibraryItem(t), author(a) {}

    void display(int idx) const override {
        LibraryItem::display(idx);
        cout << " | Book | Author: " << author << "\n";
    }
};

class DVD : public LibraryItem {
private:
    int minutes;

public:
    DVD(string t, int m) : LibraryItem(t), minutes(m) {}

    void display(int idx) const override {
        LibraryItem::display(idx);
        cout << " | DVD | Duration: " << minutes << " min\n";
    }
};

int main() {
    vector<LibraryItem*> items;
    items.push_back(new Book("OOP in C++", "Bjarne"));
    items.push_back(new DVD("Interstellar", 169));
    items.push_back(new Book("Data Structures", "Sahni"));

    while (true) {
        cout << "\n--- Library ---\n";
        cout << "1) List items\n";
        cout << "2) Borrow item\n";
        cout << "3) Return item\n";
        cout << "0) Exit\n";
        cout << "Choose: ";

        int choice;
        cin >> choice;

        if (choice == 0) break;

        if (choice == 1) {
            for (int i = 0; i < (int)items.size(); i++) items[i]->display(i);
        }
        else if (choice == 2) {
            int idx;
            cout << "Enter index: ";
            cin >> idx;
            if (idx < 0 || idx >= (int)items.size()) cout << "Invalid.\n";
            else cout << (items[idx]->borrow() ? "Borrowed.\n" : "Already borrowed.\n");
        }
        else if (choice == 3) {
            int idx;
            cout << "Enter index: ";
            cin >> idx;
            if (idx < 0 || idx >= (int)items.size()) cout << "Invalid.\n";
            else cout << (items[idx]->returnItem() ? "Returned.\n" : "Was not borrowed.\n");
        }
        else cout << "Invalid choice.\n";
    }

    for (auto p : items) delete p;
    return 0;
}
