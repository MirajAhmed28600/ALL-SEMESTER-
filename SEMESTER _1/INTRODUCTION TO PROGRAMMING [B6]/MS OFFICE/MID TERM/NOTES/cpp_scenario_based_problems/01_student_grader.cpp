#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
using namespace std;

/*
SCENARIO:
You are building a small tool for a teacher to calculate final grades.

Rules:
- Input N students.
- For each student: name, quiz1, quiz2, mid, final.
- Best quiz counts (max of quiz1, quiz2) out of 10
- Mid out of 30
- Final out of 60
- Total = bestQuiz + mid + final (out of 100)
- Print a result table and the class average.

LEARNING:
- loops, vectors, functions, formatting.
*/

double calcTotal(int q1, int q2, int mid, int fin) {
    int bestQuiz = (q1 > q2) ? q1 : q2;
    return bestQuiz + mid + fin;
}

int main() {
    int n;
    cout << "Enter number of students: ";
    cin >> n;

    vector<string> names(n);
    vector<int> q1(n), q2(n), mid(n), fin(n);
    vector<double> total(n);

    for (int i = 0; i < n; i++) {
        cout << "\nStudent " << (i+1) << " name: ";
        cin >> names[i];

        cout << "Quiz1 (0-10): "; cin >> q1[i];
        cout << "Quiz2 (0-10): "; cin >> q2[i];
        cout << "Mid (0-30): ";   cin >> mid[i];
        cout << "Final (0-60): "; cin >> fin[i];

        total[i] = calcTotal(q1[i], q2[i], mid[i], fin[i]);
    }

    double sum = 0;
    cout << "\n--- Result Sheet ---\n";
    cout << left << setw(12) << "Name"
         << setw(6) << "Q1"
         << setw(6) << "Q2"
         << setw(6) << "Mid"
         << setw(6) << "Final"
         << setw(8) << "Total" << "\n";

    for (int i = 0; i < n; i++) {
        sum += total[i];
        cout << left << setw(12) << names[i]
             << setw(6) << q1[i]
             << setw(6) << q2[i]
             << setw(6) << mid[i]
             << setw(6) << fin[i]
             << setw(8) << fixed << setprecision(1) << total[i] << "\n";
    }

    cout << "\nClass average = " << fixed << setprecision(2) << (sum / n) << "\n";
    return 0;
}
