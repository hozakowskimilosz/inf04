#include <iostream>
#include <vector>
using namespace std;

class SelectionSort {
private:
    int findMaxIndex(int start) {
        int max = vect.size() - 1;
        for (int i = start; i < vect.size(); i++) {
            if (vect[i] > vect[max]) {
                max = i;
            }
        }

        return max;
    }

public:
    vector<int> vect;
    SelectionSort() : vect(10) {};

    void fill() {
        for (int i = 0; i < 10; i++) {
            int number;
            cout << "Podaj element: ";
            cin >> number;
            vect[i] = number;
        }
    }

    void display() {
        for (int i = 0; i < vect.size(); i++) {
            cout << vect[i] << " " << i << endl;
        }
    }

    void sort() {
        for (int i = 0; i < vect.size(); i++) {
            int temp = vect[i];
            int maxIndex = findMaxIndex(i);
            vect[i] = vect[maxIndex];
            vect[maxIndex] = temp;
        }
    }
};

int main()
{
    SelectionSort s1;
    s1.fill();
    s1.display();
    s1.sort();
    cout << endl;
    s1.display();
}