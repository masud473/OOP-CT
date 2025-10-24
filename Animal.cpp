#include <iostream>
using namespace std;
class Animal
{
public:
    virtual void speak() = 0;
};
class Cat;
class Dog : public Animal
{
    int age = 20;

public:
    void speak() override
    {
        cout << "wuf!";
    }
    friend void sum(Cat &c, Dog &d);
};
class Cat : public Animal
{
    int age = 10;

public:
    void speak() override
    {
        cout << "Meow!";
    }
    friend void sum(Cat &c, Dog &d);
};
void sum(Cat &c, Dog &d)
{
    cout << c.age + d.age << endl;
}
int main(int argc, char const *argv[])
{
    Animal *a = new Dog();
    a->speak();
    a = new Cat();
    a->speak();
    Cat c;
    Dog d;
    sum(c, d);
    return 0;
}
