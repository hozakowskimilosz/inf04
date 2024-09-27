#include <iostream>
using namespace std;

class Rectangle {
public:
	int sideA, sideB;

	Rectangle(int sideA, int sideB) {
		this->sideA = sideA;
		this->sideB = sideB;
	}

	virtual void show() {
		cout << sideA << " " << sideB << endl;
	}
};

class Pentagon: public Rectangle {
public:
	int sideC;

	Pentagon(int sideA, int sideB, int sideC): Rectangle(sideA, sideB) {
		this->sideC = sideC;
	}

	void show() {
		cout << sideA << " " << sideB << " " << sideC << endl;
	}
};

class PentagonB : public Rectangle {
public:
	int sideC;

	PentagonB(int sideA, int sideB, int sideC) : Rectangle(sideA, sideB) {
		this->sideC = sideC;
	}

	void show() {
		cout << sideA << " " << sideB << " " << sideC << " B" << endl;
	}
};

int main()
{
	Rectangle r1(2, 5);
	Rectangle* r2 = new Rectangle(5, 2);
	r1.show();
	r2->show();

	Pentagon p1(10, 20, 30);
	p1.show();

	Rectangle* p2 = new Pentagon(5, 15, 25);
	Rectangle* p3 = new PentagonB(100, 200, 300);
	p2->show();
	p3->show();

}

