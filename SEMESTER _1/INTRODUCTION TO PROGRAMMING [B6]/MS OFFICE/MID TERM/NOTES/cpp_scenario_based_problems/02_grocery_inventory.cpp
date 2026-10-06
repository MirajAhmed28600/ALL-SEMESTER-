#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
using namespace std;

/*
SCENARIO:
You are making a tiny grocery inventory program (like a shop).

Features:
- Add items (name, quantity, unitPrice)
- Sell items (reduce quantity)
- Restock items (increase quantity)
- Print inventory + total inventory value

LEARNING:
- Encapsulation (private members), getters/setters, menu-driven program.
*/

class Item {
private:
    string name;
    int qty;
    double unitPrice;

public:
    Item(string n, int q, double p) : name(n), qty(q), unitPrice(p) {}

    string getName() const { return name; }
    int getQty() const { return qty; }
    double getUnitPrice() const { return unitPrice; }

    void restock(int amount) {
        if (amount > 0) qty += amount;
    }

    bool sell(int amount) {
        if (amount <= 0) return false;
        if (amount > qty) return false;
        qty -= amount;
        return true;
    }

    double value() const { return qty * unitPrice; }
};

int findItemIndex(const vector<Item>& items, const string& name) {
    for (int i = 0; i < (int)items.size(); i++) {
        if (items[i].getName() == name) return i;
    }
    return -1;
}

int main() {
    vector<Item> items;

    while (true) {
        cout << "\n--- Grocery Inventory ---\n";
        cout << "1) Add item\n";
        cout << "2) Sell item\n";
        cout << "3) Restock item\n";
        cout << "4) View inventory\n";
        cout << "0) Exit\n";
        cout << "Choose: ";

        int choice;
        cin >> choice;

        if (choice == 0) break;

        if (choice == 1) {
            string name; int q; double p;
            cout << "Item name: "; cin >> name;
            cout << "Quantity: ";  cin >> q;
            cout << "Unit price: "; cin >> p;

            if (findItemIndex(items, name) != -1) {
                cout << "Item already exists. Use restock instead.\n";
            } else {
                items.emplace_back(name, q, p);
                cout << "Added.\n";
            }
        }
        else if (choice == 2) {
            string name; int amount;
            cout << "Item name: "; cin >> name;
            cout << "Sell amount: "; cin >> amount;

            int idx = findItemIndex(items, name);
            if (idx == -1) {
                cout << "Item not found.\n";
            } else {
                if (items[idx].sell(amount)) cout << "Sold.\n";
                else cout << "Not enough stock / invalid.\n";
            }
        }
        else if (choice == 3) {
            string name; int amount;
            cout << "Item name: "; cin >> name;
            cout << "Restock amount: "; cin >> amount;

            int idx = findItemIndex(items, name);
            if (idx == -1) {
                cout << "Item not found.\n";
            } else {
                items[idx].restock(amount);
                cout << "Restocked.\n";
            }
        }
        else if (choice == 4) {
            cout << "\nInventory:\n";
            cout << left << setw(12) << "Name"
                 << setw(8) << "Qty"
                 << setw(12) << "UnitPrice"
                 << setw(12) << "Value" << "\n";

            double totalValue = 0;
            for (const auto& it : items) {
                totalValue += it.value();
                cout << left << setw(12) << it.getName()
                     << setw(8) << it.getQty()
                     << setw(12) << fixed << setprecision(2) << it.getUnitPrice()
                     << setw(12) << fixed << setprecision(2) << it.value() << "\n";
            }
            cout << "Total inventory value = " << fixed << setprecision(2) << totalValue << "\n";
        }
        else {
            cout << "Invalid choice.\n";
        }
    }

    return 0;
}
