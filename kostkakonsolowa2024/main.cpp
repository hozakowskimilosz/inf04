#include <iostream>
using namespace std;

class Dice {
public:
    int numOfGames;
    int* arrayOfResults = new int[numOfGames];
    int numOfPoints;

    void play() {
        cout << "Podaj liczbe rzutow od 3 do 10: ";

        while (true) {
            cin >> numOfGames;
            if (numOfGames >= 3 && numOfGames <= 10) {
                break;
            }
            cout << "Od 3 do 10: ";
        }

        arrayOfResults = new int[numOfGames];
    }

    void roll() {
        for (int i = 0; i < numOfGames; i++) {
            int result = rand() % 6 + 1;
            arrayOfResults[i] = result;
            cout << "Kostka " << i + 1 << ": " << arrayOfResults[i] << endl;
        }
    }

    int sum() {
        numOfPoints = 0;

        for (int i = 1; i <= 6; i++) {
            int counter = 0;
            for (int j = 0; j < numOfGames; j++) {
                if (arrayOfResults[j] == i) {
                    counter++;
                }
            }
            if (counter >= 2) {
                numOfPoints += i * counter;
            }
        }

        cout << "Liczba uzyskanych punktow: " << numOfPoints << endl;

        return numOfPoints;
    }

};

int main()
{
    srand(time(0));
    string choice;

    Dice d1;
    d1.play();
    while (true) {
        d1.roll();
        d1.sum();

        cout << "Jeszcze raz? (t/n) ";
        cin >> choice;

        if (choice == "t") {
            continue;
        }
        else if(choice == "n") {
            break;
        }
    }
}
