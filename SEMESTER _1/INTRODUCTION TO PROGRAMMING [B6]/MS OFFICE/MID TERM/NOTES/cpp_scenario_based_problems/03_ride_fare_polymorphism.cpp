#include <iostream>
#include <vector>
#include <memory>
using namespace std;

/*
SCENARIO:
You are building a ride-sharing fare calculator.

Different ride types:
- Economy: base 40, perKm 12
- Premium: base 70, perKm 18
- Bike: base 25, perKm 9

Input:
- Number of rides
- For each ride: type (E/P/B) and distance km
Output:
- Fare for each ride + total revenue

LEARNING:
- Polymorphism with virtual functions.
*/

class Ride {
public:
    virtual double fare(double km) const = 0;
    virtual ~Ride() = default;
};

class Economy : public Ride {
public:
    double fare(double km) const override { return 40 + 12 * km; }
};

class Premium : public Ride {
public:
    double fare(double km) const override { return 70 + 18 * km; }
};

class Bike : public Ride {
public:
    double fare(double km) const override { return 25 + 9 * km; }
};

int main() {
    int n;
    cout << "Enter number of rides: ";
    cin >> n;

    double total = 0;

    for (int i = 0; i < n; i++) {
        char type;
        double km;
        cout << "\nRide " << (i+1) << " type (E=Economy, P=Premium, B=Bike): ";
        cin >> type;
        cout << "Distance (km): ";
        cin >> km;

        unique_ptr<Ride> r;
        if (type == 'E' || type == 'e') r = make_unique<Economy>();
        else if (type == 'P' || type == 'p') r = make_unique<Premium>();
        else if (type == 'B' || type == 'b') r = make_unique<Bike>();
        else {
            cout << "Invalid type. Skipping.\n";
            continue;
        }

        double f = r->fare(km);
        cout << "Fare = " << f << "\n";
        total += f;
    }

    cout << "\nTotal revenue = " << total << "\n";
    return 0;
}
