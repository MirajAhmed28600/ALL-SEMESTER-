#include <iostream>
#include <vector>
#include <string>
using namespace std;

/*
SCENARIO:
You are making a simple ATM simulation for multiple accounts.

- Store accounts in an array/vector.
- Use pointers to select the current account (so students learn pointers).

Features:
1) Login by account number (index)
2) Deposit
3) Withdraw (validate)
4) Check balance
0) Exit

LEARNING:
- pointers to objects, menu loop, basic validation.
*/

class Account {
private:
    string owner;
    double balance;

public:
    Account(string name, double bal) : owner(name), balance(bal) {}

    string getOwner() const { return owner; }
    double getBalance() const { return balance; }

    void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    bool withdraw(double amt) {
        if (amt <= 0) return false;
        if (amt > balance) return false;
        balance -= amt;
        return true;
    }
};

int main() {
    vector<Account> accounts = {
        Account("Jubair", 5000),
        Account("Rehnuma", 3000),
        Account("Asha", 10000)
    };

    Account* current = nullptr;

    while (true) {
        cout << "\n--- ATM ---\n";
        cout << "1) Login\n";
        cout << "2) Deposit\n";
        cout << "3) Withdraw\n";
        cout << "4) Balance\n";
        cout << "0) Exit\n";
        cout << "Choose: ";

        int choice;
        cin >> choice;

        if (choice == 0) break;

        if (choice == 1) {
            int idx;
            cout << "Enter account index (0-" << (int)accounts.size()-1 << "): ";
            cin >> idx;

            if (idx < 0 || idx >= (int)accounts.size()) {
                cout << "Invalid index.\n";
                current = nullptr;
            } else {
                current = &accounts[idx]; // pointer to selected account
                cout << "Logged in as " << current->getOwner() << "\n";
            }
        }
        else if (choice == 2) {
            if (!current) { cout << "Please login first.\n"; continue; }
            double amt;
            cout << "Deposit amount: ";
            cin >> amt;
            current->deposit(amt);
            cout << "Done.\n";
        }
        else if (choice == 3) {
            if (!current) { cout << "Please login first.\n"; continue; }
            double amt;
            cout << "Withdraw amount: ";
            cin >> amt;
            if (current->withdraw(amt)) cout << "Withdraw success.\n";
            else cout << "Withdraw failed.\n";
        }
        else if (choice == 4) {
            if (!current) { cout << "Please login first.\n"; continue; }
            cout << "Balance = " << current->getBalance() << "\n";
        }
        else {
            cout << "Invalid choice.\n";
        }
    }

    return 0;
}
