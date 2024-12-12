#include <iostream>
#include <vector>
using namespace std;

void bubbleSort(vector<int> &numbers) {
    int size = numbers.size();

    for (int i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
            int temp;
            if (numbers[i] > numbers[j]) {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
    }
}

void display(vector<int> &numbers) {
    int size = numbers.size();

    for (int i = 0; i < size; i++) {
        cout << numbers[i] << ", ";
    }
}

int main()
{
    vector<int> numbers = { 9, 8, 7, 4, 3, 1, 5, 6, 2 };
    
    display(numbers);
    bubbleSort(numbers);
    cout << endl;
    display(numbers);
}

