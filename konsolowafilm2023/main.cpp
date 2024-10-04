#include <iostream>
using namespace std;

//******************************************************
//nazwa klasy : film
//pola :   tytul - przechowuje tytuł filmu (string)
//		   liczbaWypozyczen - przechowuje liczbę wypożyczeń filmu (int)
// 
//metody : film – konstruktor domyślny
//		   setTytul, void, ustawia pole tytuł
//		   getTytul, string, zwraca wartość pola tytuł
//		   getLiczbaWypozyczen, int, zwraca liczbę wypożyczeń filmu
//         zwiekszLiczbeWypozyczen, void, inkrementuję wartość liczby wypożyczeń filmu o 1
//informacje : klasa reprezntuję obiekt "film", który zawiera pola tytul i liczbaWypozyczen
//autor : 00000000000
//******************************************************

class film {
protected:
	string tytul;
	int liczbaWypozyczen;

public:
	film() {
		this->tytul = "";
		this->liczbaWypozyczen = 0;
	}

	void setTytul(string tytul) {
		this->tytul = tytul;
	}

	string getTytul() {
		return this->tytul;
	}

	int getLiczbaWypozyczen() {
		return this->liczbaWypozyczen;
	}

	void zwiekszLiczbeWypozyczen() {
		this->liczbaWypozyczen += 1;
	}
};

int main()
{
	film f1;
	f1.setTytul("Tytul filmu");
	cout << f1.getTytul();

	cout << endl << endl;

	cout << "Liczba wypozyczen przed: " << f1.getLiczbaWypozyczen() << endl;
	f1.zwiekszLiczbeWypozyczen();
	cout << "Liczba wypozyczen po: " << f1.getLiczbaWypozyczen() << endl;
}
