#include <iostream>
using namespace std;
class Person 
{
private:
    string name, email;

public:
    Person(string a, string b)
    {
        name = a, email = b;
    }
    void display()
    {
        cout << "Name: " << name << endl
             << "Email: " << email << endl;
    }
};
class Teacher : public Person
{
private:
    string sub;

public:
    Teacher(string a, string b, string c) : Person(a, b)
    {
        sub = c;
    }
    void display()
    {
        Person::display();
        cout << "Subject: " << sub << endl;
    }
};
class Student : public Person
{
private:
    string dept;
    double cgpa;

public:
    Student(string a, string b, string c, double d) : Person(a, b)
    {
        cgpa = d;
        dept = c;
    }
    void display()
    {
        Person::display();
        cout << "Department: " << dept << endl
             << "CGPA: " << cgpa << endl;
    }
};
int main(int argc, char const *argv[])
{
    Teacher t("a", "a@gmail.com", "c");
    Student s("a", "a@gmail", "CSE", 3.5);
    t.display();
    s.display();
    return 0;
}
