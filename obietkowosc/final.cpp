#include <iostream>
#include <vector>
using namespace std;

class Doctor {
protected:
    string name;
    string surname;
    string speciality;
    int salary;
    static int salaryStatic;
    int hireYear;
    int lastSalaryChange;

public:
    Doctor(string name, string surname, int salary, string speciality)
        : name(name), surname(surname), salary(salary), speciality(speciality),
        hireYear(2024), lastSalaryChange(0) {}

    virtual void show() = 0;

    void setSalary(int newSalary) {
        this->salary = newSalary;
        this->lastSalaryChange = 2024;
    }

    static int getStaticSalary() {
        return salaryStatic;
    }
};

int Doctor::salaryStatic = 10000;

class Dentist : public Doctor {
private:
    bool isImplant;

public:
    Dentist(string name, string surname, int salary, bool isImplant)
        : Doctor(name, surname, salary, "dentist"), isImplant(isImplant) {}

    void show() override {
        cout << name << " " << surname << " " << speciality << " " << salary
            << " " << hireYear << " " << lastSalaryChange << endl;
        cout << "Robi implanty? " << isImplant << endl;
    }
};

class Orthopedist : public Doctor {
public:
    Orthopedist(string name, string surname, int salary)
        : Doctor(name, surname, salary, "orthopeda") {}

    void show() override {
        cout << name << " " << surname << " " << speciality << " " << salary
            << " " << hireYear << " " << lastSalaryChange << endl;
    }
};

class Clinic {
public:
    vector<Doctor*> doctors;

    void addDoctor(Doctor* doctor) {
        doctors.push_back(doctor);
    }

    void show() {
        for (Doctor* doctor : doctors) {
            doctor->show();
        }
    }
};

int main()
{
    Dentist d1("Siema", "No", 20000, true);
    Orthopedist d2("Witam", "Hej", 150000);
    Doctor* d3 = new Dentist("Dawid", "Wolski", 20, true);

    d1.setSalary(123123123);

    d1.show();
    d2.show();

    Clinic c1;
    c1.addDoctor(&d1);
    c1.addDoctor(&d2);
    c1.addDoctor(d3);
    c1.show();

    delete d3;

    return 0;
}