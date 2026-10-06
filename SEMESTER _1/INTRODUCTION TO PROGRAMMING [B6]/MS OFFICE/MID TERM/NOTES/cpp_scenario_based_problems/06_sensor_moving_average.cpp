#include <iostream>
#include <vector>
using namespace std;

/*
SCENARIO:
A sensor gives noisy temperature readings. You want a smoother signal.

Task:
- Input N readings
- Compute a moving average with window size W (e.g., W=3):
  avg[i] = average of readings from i-(W-1) to i (only when enough data exists)
- Print the smoothed series

LEARNING:
- arrays/vectors, loops, functions, careful boundaries.
*/

double averageLastW(const vector<double>& a, int endIdx, int W) {
    double sum = 0;
    for (int i = endIdx - (W - 1); i <= endIdx; i++) sum += a[i];
    return sum / W;
}

int main() {
    int n, W;
    cout << "Enter N: ";
    cin >> n;
    cout << "Enter window W: ";
    cin >> W;

    vector<double> a(n);
    for (int i = 0; i < n; i++) {
        cout << "Reading " << (i+1) << ": ";
        cin >> a[i];
    }

    cout << "\nSmoothed output (moving average):\n";
    for (int i = 0; i < n; i++) {
        if (i < W - 1) {
            cout << "i=" << i << " -> N/A (need " << W << " values)\n";
        } else {
            cout << "i=" << i << " -> " << averageLastW(a, i, W) << "\n";
        }
    }

    return 0;
}
