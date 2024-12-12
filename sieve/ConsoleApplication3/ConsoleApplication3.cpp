#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

void erastotenes(vector<bool>& booleans) {
    int n = int(sqrt(booleans.size()));

    for (int i = 2; i < sqrt(n); i++) {
        if (booleans[i] == true) {
            for (int j = i * i; j < booleans.size(); j+=i) {
                booleans[j] = false;
            }
        }
    }
}

void fillValues(vector<bool>& booleans) {
    for (int i = 0; i < booleans.size(); i++) {
        booleans[i] = true;
    }
}

void display(vector<bool>& booleans) {
    for (int i = 2; i < booleans.size(); i++) {
        if (booleans[i]) {
            cout << i << endl;
        }
    }
}

int main()
{
    vector<bool> v1(100);
    fillValues(v1);
    erastotenes(v1);
    display(v1);
}

