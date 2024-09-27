#include <iostream>
#include <vector>
using namespace std;

class Doctor {
public:
	string name, surname, speciality;
	int salary;
	static int salaryStatic;

	Doctor(string name, string surname, int salary) {
		this->name = name;
		this->surname = surname;
		this->salary = salaryStatic;
		this->speciality = "dentist";
	}

	void show() {
		cout << name << " " << surname << " " << speciality << " " << salary << endl;
	}
};

class Clinic {
public:
	vector<Doctor> doctors;

	void addDoctor(Doctor doctor) {
		doctors.push_back(doctor);
	}
	
	void show() {
		for (int i = 0; i < doctors.size(); i++) {
			doctors[i].show();
		}
	}
};

int Doctor::salaryStatic = 10000;

int main()
{
	Doctor d1("Siema", "No", 20000);
	Doctor d2("Witam", "Hej", 150000);

	d1.show();
	d2.show();

	Clinic c1;
	c1.addDoctor(d1);
	c1.addDoctor(d2);
	c1.show();
}

