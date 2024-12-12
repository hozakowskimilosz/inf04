#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>
using namespace std;

void fill(vector<int> &vect) {
    srand(time(NULL));

    for (int i = 0; i < vect.size(); i++) {
        vect[i] = (rand() % 100) + 1;
    }
}

void sentinelSearch(vector<int> &vect, int target) {
    vect.push_back(target);
    int idx = 0;

    for (int i = 0; i < vect.size(); i++) {
        if (vect[i] == target) {
            if (i == vect.size() - 1) {
                idx = -1;
            }
            else {
                idx = i;
                break;
            }
        }
    }

    if (idx > 0) {
        for (int i = 0; i < vect.size() - 1; i++) {
            if (idx == i) {
                cout << vect[i] << " Znaleziono wartosc pod indeksem " << idx << endl;
            }
            else {
                cout << vect[i] << endl;
            }
        }
    }
    else {
        for (int i = 0; i < vect.size() - 1; i++) {
            cout << vect[i] << endl;
        }
        cout << "Nie odnaleziono elementu.";
    }

}

int main()
{
    vector<int> vect(100);

    int target;
    cout << "Podaj szukany element: ";
    cin >> target;

    fill(vect);
    sentinelSearch(vect, target);
}

